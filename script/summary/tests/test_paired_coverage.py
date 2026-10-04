"""Arithmetic, grouping and saved-workbook checks for the two coverage views."""
import json
from pathlib import Path
import subprocess
import unittest
import xml.etree.ElementTree as ET
from zipfile import ZipFile

import coverage_summaries as summaries
from build_report_site import summarize, build_snapshot
from summary.metrics import classify, load_records, metric_summary, GROUP_IDS, intersection, resource_inventory, resource_targets, ga_verdict

ROOT = Path(__file__).resolve().parents[3]


def sheet_xml(archive, name):
    """Resolve by worksheet name so added inventory tabs do not change checks."""
    ns = summaries.NS
    book = ET.fromstring(archive.read('xl/workbook.xml'))
    sheet = next(s for s in book.findall('x:sheets/x:sheet',ns) if s.get('name')==name)
    identifier = sheet.get('{http://schemas.openxmlformats.org/officeDocument/2006/relationships}id')
    relationships = ET.fromstring(archive.read('xl/_rels/workbook.xml.rels'))
    target = next(r.get('Target') for r in relationships if r.get('Id')==identifier)
    return ET.fromstring(archive.read(target.lstrip('/') if target.startswith('/') else 'xl/'+target))


class CoverageTests(unittest.TestCase):
    def test_ga_verdict_requires_paired_validation_and_keeps_generation_fail_separate(self):
        for buggy,fixed,expected in [('FAIL','PASS','REVEALING'),('PASS','PASS','NOT_REVEALING'),
                                     ('FAIL','FAIL','INCONCLUSIVE'),('PASS','FAIL','INCONCLUSIVE'),
                                     ('NOT_RUN','PASS','NOT_AVAILABLE')]:
            self.assertEqual(ga_verdict({'coverage_status':'OK'},dict(buggy_result=buggy,fixed_result=fixed))[0],expected)
        self.assertEqual(ga_verdict({'coverage_status':'OK'})[0],'NOT_AVAILABLE')
        self.assertEqual(ga_verdict({'generation_status':'FAIL'})[0],'FAIL')
        self.assertEqual(ga_verdict({'coverage_status':'TESTS_FAILED'})[0],'NOT_AVAILABLE')

    def test_only_resource_targets_enter_workbooks_web_and_analysis(self):
        allowed = resource_targets()
        self.assertEqual(len(allowed),854)
        for method in GROUP_IDS.values():
            self.assertTrue(all(r['target'] in allowed for r in load_records(method)))
        self.assertEqual({r['target'] for r in load_records('ga',resource_only=False)}-allowed,
                         set())
        for method in build_snapshot()['methods']:
            for round_result in method['rounds']:
                self.assertEqual(round_result['summary']['results'],len(allowed))
        self.assertTrue(all(row[3] in allowed for row in summaries.ga_data()[1:]))

    def test_resource_check_preserves_missing_and_extra_results(self):
        scratch = ROOT / '.coverage-build'
        scratch.mkdir(exist_ok=True)
        with summaries.build_directory(scratch) as directory:
            root = Path(directory)
            for target in ('Gson_8','JacksonCore_4'):
                (root/'Resoucre'/target).mkdir(parents=True)
            tests = root/'GeneticAlgorithm/TestCode/Gson_8'
            tests.mkdir(parents=True)
            (tests/'Example.java').write_text('class Example {}')
            checks = resource_inventory({'ga':[{'round':'Round1','target':'Gson_8'},
                                               {'round':'Round1','target':'Closure_175'}]},root)
            self.assertEqual(checks[0]['missingResults'],['JacksonCore_4'])
            self.assertEqual(checks[0]['extraResults'],['Closure_175'])
            self.assertEqual(checks[0]['testCount'],1)
            self.assertEqual(checks[1]['resultCount'],0)
            self.assertEqual(checks[1]['missingResults'],['Gson_8','JacksonCore_4'])

    def test_zero_missing_and_independent_metric_denominators(self):
        rows = [dict(verdict='NOT_REVEALING', line_cov='80', branch_cov='60'),
                dict(verdict='REVEALING', line_cov='0', branch_cov='',lines_total=1,conditions_total=0,coverage_status='PASS'),
                dict(verdict='NOT_AVAILABLE', line_cov='', branch_cov='')]
        result = summarize(rows)
        self.assertEqual(result['lineCoverage'], 40)
        self.assertAlmostEqual(result['lineCoverageAllResults'], 80/3)
        self.assertEqual(result['branchCoverage'], 60)
        self.assertEqual(result['branchCoverageAllResults'], 30)
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
        function = page[page.index('    function combineMetrics('):page.index('    function selectedEntries(')]
        code = "const VERDICTS=[['REVEALING'],['NOT_REVEALING'],['NOT_AVAILABLE'],['INCONCLUSIVE'],['FAIL']];\n" + function
        cases = [summarize([dict(verdict='NOT_REVEALING',line_cov='80',branch_cov='40')]),
                 summarize([dict(verdict='NOT_AVAILABLE',line_cov='',branch_cov=''),
                            dict(verdict='REVEALING',line_cov='0',branch_cov='',lines_total=1,conditions_total=0,coverage_status='PASS')])]
        code += '\nconsole.log(JSON.stringify(combine(' + json.dumps(cases) + ')));'
        node = summaries.node_executable()
        output = subprocess.check_output([str(node), '-e', code], text=True)
        result = json.loads(output)
        self.assertEqual(result['lineCoverage'], 40)
        self.assertAlmostEqual(result['lineCoverageAllResults'], 80/3)
        self.assertEqual(result['branchCoverage'], 40)
        self.assertAlmostEqual(result['branchCoverageAllResults'], 20)
        empty = json.loads(subprocess.check_output([str(node), '-e', code[:code.index('console.log')]+'console.log(JSON.stringify(combine([])));'],text=True))
        self.assertIsNone(empty['lineCoverageAllResults'])

    def test_workbook_builder_edge_cases_and_grouping(self):
        # Execute the exported pure helpers without importing the authoring runtime.
        source = (ROOT / 'script/summary/build_coverage_summaries.mjs').read_text(encoding='utf-8')
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
                records = load_records(GROUP_IDS[group])
                with ZipFile(path) as archive:
                    ns = summaries.NS
                    strings = []
                    if 'xl/sharedStrings.xml' in archive.namelist():
                        strings = [''.join(node.itertext()) for node in ET.fromstring(archive.read('xl/sharedStrings.xml'))]
                    sheet = sheet_xml(archive,'Coverage')
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
                            project = record['project']
                            round_name = record['round']
                            return (values['B']=='All projects' or project==values['B']) and (values['C']=='All rounds' or round_name==values['C'])
                        selected = [r for r in records if belongs(r)]
                        metric = {'Coverage':'coverage','Line':'line','Condition':'condition'}[values['D']]
                        stats=metric_summary(selected,metric)
                        for column,key in [('E','total'),('F','recorded'),('G','failure'),('H','notApplicable'),('I','unresolved')]:self.assertEqual(values[column],stats[key])
                        self.assertEqual(values['M'],stats['applicable'] if stats['applicable'] is not None else 'Pending')
                        for column,key in [('J','recordedOnly'),('K','allResults'),('L','runnablePercent')]:
                            if stats[key] is not None:self.assertAlmostEqual(values[column],stats[key]/100,places=9)
                            else:self.assertEqual(values[column],'Pending' if stats['unresolved'] and column!='J' else '—')
                        for cell in row.findall('x:c',ns):
                            if cell.get('r').startswith(('E','F','G','H','I','J','K','L','M')):
                                self.assertIsNotNone(cell.find('x:f',ns))
                        count += 1
                    self.assertGreaterEqual(count,108)

    def test_web_snapshot_consistency(self):
        for method in build_snapshot()['methods']:
            for summary in [method['summary'],*method['projects'].values(),*[r['summary'] for r in method['rounds']]]:
                for key,count_key,all_key in [('lineCoverage','coverageRecords','lineCoverageAllResults'),('branchCoverage','branchCoverageRecords','branchCoverageAllResults')]:
                    if summary['results']:
                        stats=summary['metrics']['line' if key=='lineCoverage' else 'condition']
                        denominator=summary['results']-stats['notApplicable']
                        expected = (summary[key] or 0) * summary[count_key] / denominator if denominator else None
                        if expected is None:self.assertIsNone(summary[all_key])
                        else:self.assertAlmostEqual(summary[all_key],expected)

    def test_successful_zero_totals_are_na_even_when_numeric(self):
        for value in (None,0,100):
            self.assertEqual(classify({'branches':0,'branch_cov':value,'coverage_status':'PASS'},'condition')['kind'],'B')
        self.assertEqual(classify({'lines':0,'line_cov':None,'coverage_status':'OK'},'line')['kind'],'B')

    def test_failed_default_zero_totals_are_failure(self):
        self.assertEqual(classify({'branches':0,'branch_cov':None,'coverage_status':'FAIL'},'condition')['kind'],'A')
        self.assertEqual(classify({'branches':0,'branch_cov':None,'verdict':'NOT_AVAILABLE','buggy_result':'NOT_RUN'},'condition')['kind'],'A')

    def test_ambiguous_cases_are_not_guessed(self):
        self.assertEqual(classify({'branches':0,'branch_cov':None},'condition')['kind'],'UNRESOLVED')
        record={'metrics':{'condition':classify({'branches':0},'condition')},'details':{'branches':0}}
        stats=metric_summary([record],'condition')
        self.assertEqual(stats['unresolved'],1)
        self.assertIsNone(stats['allResults']);self.assertIsNone(stats['runnablePercent'])
        self.assertEqual(classify({'branches':2,'branch_cov':None,'coverage_status':'PASS'},'condition')['kind'],'UNRESOLVED')
        self.assertEqual(classify({'branches':0,'branch_cov':None,'coverage_status':'PASS','compile':'FAIL'},'condition')['kind'],'UNRESOLVED')

    def test_assertion_failure_with_valid_measurement_is_recorded(self):
        self.assertEqual(classify({'conditions_total':10,'condition_coverage':80,'coverage_status':'TESTS_FAILED'},'condition')['kind'],'RECORDED')
        self.assertEqual(classify({'branches':10,'branch_cov':80,'coverage_status':'PASS','result':'FAIL'},'condition')['kind'],'RECORDED')

    def test_intersection_averages_rounds_per_bug_before_bugs(self):
        def row(target,round_name,value,kind='RECORDED'):
            return {'target':target,'round':round_name,'metrics':{metric:{'kind':kind,'value':value} for metric in ('line','condition')}}
        records={method:[row('Math_1','Round1',80),row('Math_1','Round2',0),row('Math_2','Round1',100)] for method in GROUP_IDS.values()}
        records['gemini']=[row('Math_1','Round1',60),row('Math_2','Round1',None,'B')]
        combined=intersection(records)
        self.assertEqual(combined['line']['bugs'],1)
        self.assertEqual(combined['line']['averages']['ga'],40)
        self.assertEqual(combined['line']['recordedResults']['ga'],2)
        self.assertEqual(combined['line']['recordedResults']['gemini'],1)
        self.assertEqual(intersection(records,'Round1')['line']['averages']['ga'],80)
        self.assertEqual(intersection(records,'Round2')['line']['bugs'],0)
        self.assertTrue(all(n==0 for n in intersection(records,'Round2')['line']['recordedResults'].values()))

    def test_all_na_group_has_no_mean_but_is_runnable(self):
        rows=[{'metrics':{'condition':{'kind':'B','value':None}},'details':{'branches':0}}]
        stats=metric_summary(rows,'condition')
        self.assertIsNone(stats['recordedOnly']);self.assertIsNone(stats['allResults'])
        self.assertEqual(stats['runnablePercent'],100)

    def test_saved_intersection_values_match_membership_and_round_policy(self):
        from summary.metrics import analysis
        expected=analysis()['intersection']
        ns=summaries.NS
        for group in summaries.GROUPS:
            with self.subTest(group=group), ZipFile(ROOT/group/'summary.xlsx') as archive:
                sheet=sheet_xml(archive,'Intersection')
                cells={cell.get('r'):cell for cell in sheet.findall('.//x:c',ns)}
                row=7
                for scope,metrics in expected.items():
                    for metric,item in metrics.items():
                        self.assertEqual(float(cells[f'D{row}'].find('x:v',ns).text),item['bugs'])
                        for column,method in zip('EFGH',('ga','randoop','deepseek','gemini')):
                            cell=cells[f'{column}{row}']
                            self.assertIsNotNone(cell.find('x:f',ns))
                            value=cell.find('x:v',ns).text
                            if item['bugs']:self.assertAlmostEqual(float(value)*100,item['averages'][method],places=9)
                            else:self.assertEqual(value,'—')
                        for column,method in zip('IJKL',('ga','randoop','deepseek','gemini')):
                            cell=cells[f'{column}{row}']
                            self.assertIsNotNone(cell.find('x:f',ns))
                            self.assertEqual(float(cell.find('x:v',ns).text),item['recordedResults'][method])
                        row+=1

    def test_latest_verdict_preserves_valid_buggy_coverage(self):
        records=load_records('deepseek')
        row=next(r for r in records if r['round']=='Round1' and r['target']=='Codec_10')
        self.assertEqual(row['verdict'],'NOT_AVAILABLE')
        self.assertEqual(row['not_available_cause'],'FIXED_NOT_RUN')
        for metric in ('line','condition'):
            self.assertEqual(row['metrics'][metric]['kind'],'RECORDED')
            stats=metric_summary([row],metric)
            self.assertEqual(stats['notAvailableWithNumericCoverage'],1)
            self.assertEqual(stats['recordedOnly'],row['metrics'][metric]['value'])
            self.assertEqual(stats['allResults'],row['metrics'][metric]['value'])

    def test_round_counts_are_pooled(self):
        from summary.metrics import analysis
        report=analysis()
        for method,scopes in report['roundMetrics'].items():
            for metric in ('line','condition'):
                a,b,total=(scopes[s][metric] for s in ('Round1','Round2','All rounds'))
                for key in ('total','recorded','failure','notApplicable','coverageSum','notAvailableWithNumericCoverage'):
                    self.assertAlmostEqual(total[key],a[key]+b[key])
                if total['recorded']:
                    self.assertAlmostEqual(total['recordedOnly'],(a['coverageSum']+b['coverageSum'])/(a['recorded']+b['recorded']))
        self.assertEqual(report['roundMetrics']['gemini']['Round2']['line']['total'],0)
        self.assertIsNone(report['roundMetrics']['gemini']['Round2']['line']['allResults'])

    def test_saved_coverage_cases_show_latest_verdict_and_both_sources(self):
        from summary.tests.test_bug_verdicts import cells
        for group,method in GROUP_IDS.items():
            records={(r['round'],r['target']):r for r in load_records(method)}
            with ZipFile(ROOT/group/'summary.xlsx') as archive:
                count=0
                for n,values,formulas in cells(archive,'CoverageCases'):
                    if n<2 or not values.get('D'):continue
                    count+=1
                    record=records[(values['C'],values['D'])]
                    self.assertEqual(values['P'],record['verdict'])
                    self.assertEqual(values.get('Q'),record['verdictSource'])
                    metric={'Line':'line','Condition':'condition','Coverage':'coverage'}[values['E']]
                    if record['metrics'][metric]['kind']=='RECORDED':
                        self.assertAlmostEqual(values['O'],record['metrics'][metric]['value'])
                    else:self.assertIsNone(values.get('O'))
                self.assertEqual(count,len(records)*len(next(iter(records.values()))['metrics']))

    def test_integrated_reports_match_saved_cases_and_cached_calculations(self):
        from summary.tests.test_bug_verdicts import cells
        for group,method in GROUP_IDS.items():
            records=load_records(method)
            expected={(r['project'],r['bug_id'],r['round']):r for r in records}
            changed={key for key,r in expected.items() if r['previousVerdict']!=r['verdict']}
            with self.subTest(group=group), ZipFile(ROOT/group/'summary.xlsx') as archive:
                notes={n:(values,formulas) for n,values,formulas in cells(archive,'ReportNotes')}
                for n,metric in ((13,'line'),(14,'condition')):
                    values,formulas=notes[n]
                    stats=metric_summary(records,metric)
                    for column,key,scale in [('C','coverageSum',1),('D','recorded',1),('E','applicable',1),('F','recordedOnly',100),('G','allResults',100),('H','runnablePercent',100)]:
                        self.assertIn(column,formulas)
                        self.assertAlmostEqual(values[column]*scale,stats[key],places=8)
                actual=set()
                for n,values,_ in cells(archive,'StatusChanges'):
                    if n<7 or not values.get('B'):continue
                    key=(values['B'],int(values['C']),values['D'])
                    actual.add(key)
                    self.assertEqual(values['E'],expected[key]['previousVerdict'])
                    self.assertEqual(values['F'],expected[key]['verdict'])
                self.assertEqual(actual,changed)
                for n,values,_ in cells(archive,'BugResults'):
                    if n<2 or not values.get('A'):continue
                    record=expected[(values['A'],int(values['B']),values['C'])]
                    self.assertEqual(values['V'],str(record['previousVerdict']!=record['verdict']).lower())
                    self.assertEqual(values['T'],str(bool(record.get('stale_generation_failure'))).lower())
                tables=[ET.fromstring(archive.read(name)) for name in archive.namelist() if name.startswith('xl/tables/') and name.endswith('.xml')]
                by_name={t.get('displayName'):t for t in tables}
                for name in ('BugResultsTable','CoverageCasesTable','StatusChangesTable'):
                    self.assertIn(name,by_name)
                    self.assertIsNotNone(by_name[name].find('x:autoFilter',summaries.NS))


if __name__ == '__main__':
    unittest.main()
