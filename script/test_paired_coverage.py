"""Arithmetic, grouping and saved-workbook checks for the two coverage views."""
import json
from pathlib import Path
import subprocess
import unittest
import xml.etree.ElementTree as ET
from zipfile import ZipFile

import coverage_summaries as summaries
from build_report_site import summarize, build_snapshot

ROOT = Path(__file__).resolve().parents[1]


class CoverageTests(unittest.TestCase):
    def test_zero_missing_and_independent_metric_denominators(self):
        rows = [dict(verdict='NOT_REVEALING', line_cov='80', branch_cov='60'),
                dict(verdict='REVEALING', line_cov='0', branch_cov=''),
                dict(verdict='NOT_AVAILABLE', line_cov='', branch_cov='')]
        result = summarize(rows)
        self.assertEqual(result['lineCoverage'], 40)
        self.assertAlmostEqual(result['lineCoverageAllResults'], 80/3)
        self.assertEqual(result['branchCoverage'], 60)
        self.assertEqual(result['branchCoverageAllResults'], 20)
        self.assertEqual((result['coverageRecords'], result['branchCoverageRecords']), (2, 1))

    def test_empty_and_all_missing(self):
        empty = summarize([])
        self.assertIsNone(empty['lineCoverage'])
        self.assertIsNone(empty['lineCoverageAllResults'])
        missing = summarize([dict(verdict='NOT_AVAILABLE')])
        self.assertIsNone(missing['lineCoverage'])
        self.assertEqual(missing['lineCoverageAllResults'], 0)
        self.assertIsNone(missing['branchCoverage'])
        self.assertEqual(missing['branchCoverageAllResults'], 0)

    def test_browser_combine_uses_record_counts(self):
        page = (ROOT / 'index.html').read_text(encoding='utf-8')
        function = page[page.index('    function combine('):page.index('    function selectedEntries(')]
        code = "const VERDICTS=[['REVEALING'],['NOT_REVEALING'],['NOT_AVAILABLE'],['INCONCLUSIVE'],['FAIL']];\n" + function
        cases = [summarize([dict(verdict='NOT_REVEALING',line_cov='80',branch_cov='40')]),
                 summarize([dict(verdict='NOT_AVAILABLE',line_cov='',branch_cov=''),
                            dict(verdict='REVEALING',line_cov='0',branch_cov='')])]
        code += '\nconsole.log(JSON.stringify(combine(' + json.dumps(cases) + ')));'
        node = summaries.node_executable()
        output = subprocess.check_output([str(node), '-e', code], text=True)
        result = json.loads(output)
        self.assertEqual(result['lineCoverage'], 40)
        self.assertAlmostEqual(result['lineCoverageAllResults'], 80/3)
        self.assertEqual(result['branchCoverage'], 40)
        self.assertAlmostEqual(result['branchCoverageAllResults'], 40/3)
        empty = json.loads(subprocess.check_output([str(node), '-e', code[:code.index('console.log')]+'console.log(JSON.stringify(combine([])));'],text=True))
        self.assertIsNone(empty['lineCoverageAllResults'])

    def test_workbook_builder_edge_cases_and_grouping(self):
        # Execute the exported pure helpers without importing the authoring runtime.
        source = (ROOT / 'script/build_coverage_summaries.mjs').read_text(encoding='utf-8')
        source = source[source.index('export function columnName'):source.index('function formatTable')].replace('export ', '')
        code = source + '''
const assert = require('node:assert/strict');
const data = [['round','target','line_coverage','condition_coverage'],
 ['Round1','Math_1',.8,.6],['Round1','Math_2',0,null],['Round2','Math_1',null,null],
 ['Round2','Lang_1',.2,0]];
const groups = groupsFor(data);
const all = groups.find(g=>g.project==='All projects'&&g.round==='All rounds');
const math = groups.find(g=>g.project==='Math'&&g.round==='All rounds');
assert.equal(all.rows.length,4); assert.equal(math.rows.length,3);
assert.deepEqual(metricStats(math.rows,2,1),{count:2,recorded:.4,all:.8/3});
const r2 = groups.find(g=>g.project==='Math'&&g.round==='Round2');
assert.deepEqual(metricStats(r2.rows,2,1),{count:0,recorded:null,all:0});
assert.deepEqual(metricStats([],2,1),{count:0,recorded:null,all:null});
assert.equal(metricStats([{values:[80]},{values:[0]},{values:[null]}],0,100).recorded,.4);
assert.equal(references([2,3,5,6], 'E'),"'Data'!$E$2:$E$3,'Data'!$E$5:$E$6");
'''
        node = summaries.node_executable()
        subprocess.run([str(node), '-e', code], check=True)

    def test_saved_workbooks_match_raw_values_for_every_project_and_round(self):
        for group in summaries.GROUPS:
            with self.subTest(group=group):
                path = ROOT / group / 'summary.xlsx'
                data = summaries.read_data(path)
                headers = data[0]
                records = [dict(zip(headers, row)) for row in data[1:]]
                with ZipFile(path) as archive:
                    ns = summaries.NS
                    strings = []
                    if 'xl/sharedStrings.xml' in archive.namelist():
                        strings = [''.join(node.itertext()) for node in ET.fromstring(archive.read('xl/sharedStrings.xml'))]
                    sheet = ET.fromstring(archive.read('xl/worksheets/sheet3.xml'))
                    count = 0
                    for row in sheet.findall('x:sheetData/x:row', ns):
                        if int(row.get('r')) < 7:
                            continue
                        values = {}
                        for cell in row.findall('x:c',ns):
                            v = cell.find('x:v',ns)
                            kind = cell.get('t')
                            text = v.text if v is not None else None
                            if kind == 's': text = strings[int(text)]
                            elif kind == 'inlineStr': text = ''.join(cell.find('x:is',ns).itertext())
                            elif kind not in ('str','e') and text is not None: text = float(text)
                            values[''.join(c for c in cell.get('r') if c.isalpha())] = text
                        if 'D' not in values: continue
                        def belongs(record):
                            project = record.get('project') or record['target'].split('_')[0]
                            round_name = str(record['round'])
                            if isinstance(record['round'],float): round_name = 'Round'+str(int(record['round']))
                            return (values['B']=='All projects' or project==values['B']) and (values['C']=='All rounds' or round_name==values['C'])
                        selected = [r for r in records if belongs(r)]
                        field = {'Coverage':'coverage','Line': 'line_coverage' if 'line_coverage' in headers else 'line_cov','Condition':'condition_coverage'}[values['D']]
                        numeric = [r[field] for r in selected if isinstance(r.get(field),(int,float))]
                        total = sum(numeric) / (100 if group=='GeneticAlgorithm' else 1)
                        self.assertEqual(values['E'],len(selected))
                        self.assertEqual(values['F'],len(numeric))
                        for column, denominator in [('G',len(numeric)),('H',len(selected))]:
                            if denominator: self.assertAlmostEqual(values[column],total/denominator,places=9)
                            else: self.assertEqual(values[column],'—')
                        for cell in row.findall('x:c',ns):
                            if cell.get('r').startswith(('E','F','G','H')):
                                self.assertIsNotNone(cell.find('x:f',ns))
                        count += 1
                    self.assertGreaterEqual(count,108)

    def test_web_snapshot_consistency(self):
        for method in build_snapshot()['methods']:
            for summary in [method['summary'],*method['projects'].values(),*[r['summary'] for r in method['rounds']]]:
                for key,count_key,all_key in [('lineCoverage','coverageRecords','lineCoverageAllResults'),('branchCoverage','branchCoverageRecords','branchCoverageAllResults')]:
                    if summary['results']:
                        expected = (summary[key] or 0) * summary[count_key] / summary['results']
                        self.assertAlmostEqual(summary[all_key],expected)


if __name__ == '__main__':
    unittest.main()
