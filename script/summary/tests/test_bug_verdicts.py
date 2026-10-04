"""Final bug status precedence, source evidence and exported Excel reconciliation."""
from collections import Counter
import unittest
import xml.etree.ElementTree as ET
from zipfile import ZipFile

from summary.verdicts import VERDICTS, decide_status
from summary.metrics import ROOT, load_records, resource_targets
from build_report_site import build_snapshot
from summary.tests.test_paired_coverage import sheet_xml
from coverage_summaries import NS, read_data


def cells(archive, name):
    strings = [''.join(n.itertext()) for n in ET.fromstring(archive.read('xl/sharedStrings.xml'))] if 'xl/sharedStrings.xml' in archive.namelist() else []
    rows = []
    for row in sheet_xml(archive, name).findall('x:sheetData/x:row', NS):
        values, formulas = {}, {}
        for cell in row.findall('x:c', NS):
            column = ''.join(c for c in cell.get('r') if c.isalpha())
            v = cell.find('x:v', NS)
            value = v.text if v is not None else None
            kind = cell.get('t')
            if kind == 's': value = strings[int(value)]
            elif kind == 'inlineStr': value = ''.join(cell.find('x:is', NS).itertext())
            elif kind == 'b': value = value == '1'
            elif value is not None and kind not in ('str', 'e'): value = float(value)
            values[column] = value
            f = cell.find('x:f', NS)
            if f is not None: formulas[column] = f.text
        rows.append((int(row.get('r')), values, formulas))
    return rows


class BugVerdictTests(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        cls.records = {m: load_records(m) for m in ('ga', 'randoop')}

    def test_generation_failure_wins_over_stale_passing_results(self):
        args = dict(has_tests=True, latest_generation_failed=True, measurement_failed=False,
                    validations=[], buggy='PASS', fixed='PASS')
        self.assertEqual(decide_status(**args)[0], 'FAIL')
        args.update(latest_generation_failed=False, has_tests=False)
        self.assertEqual(decide_status(**args)[0], 'FAIL')

    def test_measurement_and_compile_failure_win_over_assertions(self):
        args = dict(has_tests=True, latest_generation_failed=False, measurement_failed=True,
                    validations=[], buggy='FAIL', fixed='PASS')
        self.assertEqual(decide_status(**args)[0], 'NOT_AVAILABLE')
        args.update(measurement_failed=False, validations=[{'subject':'fixed', 'compile':'FAIL'}])
        self.assertEqual(decide_status(**args)[0], 'NOT_AVAILABLE')
        args['validations'] = [{'subject':'buggy', 'test_status':'FAIL', 'coverage_status':'PASS'}]
        self.assertEqual(decide_status(**args)[0], 'REVEALING')
        args['fixed'] = 'FAIL'
        self.assertEqual(decide_status(**args)[0], 'INCONCLUSIVE')

    def test_paired_pass_and_missing_side(self):
        args = dict(has_tests=True, latest_generation_failed=False, measurement_failed=False,
                    validations=[], buggy='PASS', fixed='PASS')
        self.assertEqual(decide_status(**args)[0], 'NOT_REVEALING')
        args['fixed'] = 'NOT_RUN'
        self.assertEqual(decide_status(**args)[0], 'NOT_AVAILABLE')

    def test_same_resource_cohort_and_five_status_partition(self):
        expected = resource_targets()
        for rows in self.records.values():
            for rnd in ('Round1','Round2'):
                selected = [r for r in rows if r['round'] == rnd]
                self.assertEqual({r['target'] for r in selected}, expected)
                self.assertEqual(len(selected), len(expected))
                self.assertEqual(sum(Counter(r['verdict'] for r in selected)[v] for v in VERDICTS), len(expected))
                self.assertFalse(any(r['verdict'] not in VERDICTS for r in selected))
            self.assertEqual(len(rows), 2*len(expected))

    def test_failed_latest_randoop_suites_exclude_old_numeric_coverage(self):
        for target in ('Mockito_14','Mockito_16'):
            r = next(r for r in self.records['randoop'] if r['round']=='Round1' and r['target']==target)
            self.assertTrue(r['has_test_methods'])
            self.assertTrue(r['stale_generation_failure'])
            self.assertEqual(r['verdict'], 'FAIL')
            self.assertIsNotNone(r['details']['line_cov'])
            for metric in r['metrics'].values():
                self.assertEqual(metric['kind'], 'A')
                self.assertIsNone(metric['value'])
        self.assertTrue(all(r['partial_generation']=='N/A' for r in self.records['randoop']))

    def test_ga_partial_classes_exclude_non_java_and_disclose_unknown(self):
        for rnd in ('Round1','Round2'):
            rows = {r['target']: r for r in self.records['ga'] if r['round']==rnd}
            self.assertTrue(rows['Codec_1']['partial_generation'])
            self.assertIn('org.apache.commons.codec.language.DoubleMetaphone', rows['Codec_1']['missing_generation_classes'])
            self.assertFalse(rows['Codec_14']['partial_generation'])
            self.assertTrue(rows['Codec_14']['ignored_resource_targets'])
            self.assertEqual(rows['Gson_8']['verdict'], 'FAIL')
        unknown = [r for r in self.records['ga'] if not r['partial_generation_known']]
        self.assertTrue(unknown)
        self.assertTrue(all('completeness unverified' in r['notes'] for r in unknown))

    def test_saved_bug_rows_verdict_formulas_and_cached_values(self):
        for method, directory in [('ga','GeneticAlgorithm'), ('randoop','Feedback-Directed Random Test Generation')]:
            with ZipFile(ROOT/directory/'summary.xlsx') as archive:
                records = {(r['round'], r['target']): r for r in self.records[method]}
                bugs = cells(archive, 'BugResults')
                selected = [v for row,v,_ in bugs if row >= 2 and v.get('A')]
                self.assertEqual(len(selected), 2*len(resource_targets()))
                for value in selected:
                    r = records[(value['C'], f"{value['A']}_{int(value['B'])}")]
                    self.assertEqual(value['D'], r['verdict'])
                    flag = r['partial_generation']
                    self.assertEqual(value['E'], str(flag).lower() if isinstance(flag,bool) else flag)
                    self.assertEqual(value['G'], str(r['partial_generation_known']).lower())
                    self.assertEqual(value['F'], r['notes'])
                for row, value, formulas in cells(archive, 'Verdicts'):
                    if row < 7 or value.get('D') not in VERDICTS: continue
                    rr = [r for r in self.records[method] if (value['B']=='All projects' or r['project']==value['B']) and (value['C']=='All rounds' or r['round']==value['C'])]
                    count = sum(r['verdict']==value['D'] for r in rr)
                    self.assertEqual(value['E'], count)
                    self.assertAlmostEqual(value['F'], count/len(rr))
                    self.assertIn('COUNTIF', formulas['E'])
                    self.assertIn('BugResults', formulas['E'])
                    self.assertIn('F', formulas)
                for row, value, formulas in cells(archive, 'StatusChecks'):
                    if row < 7 or not value.get('B'): continue
                    self.assertEqual(value['D'], value['E'])
                    self.assertEqual(value['E'], value['F'])
                    self.assertEqual(value['G'], 0)
                    self.assertTrue(all(c in formulas for c in ('E','F','G','H','I')))
                # The stale raw Randoop measurements remain present and unmodified.
                if method=='randoop':
                    matrix = read_data(ROOT/directory/'summary.xlsx')
                    header = matrix[0]
                    stale = [dict(zip(header,row)) for row in matrix[1:] if row[header.index('target')] in ('Mockito_14','Mockito_16') and row[header.index('round')]=='Round1']
                    self.assertEqual(len(stale), 2)
                    self.assertTrue(all(row['line_cov'] is not None and row['verdict']=='INCONCLUSIVE' for row in stale))

    def test_web_uses_final_statuses(self):
        for method in build_snapshot()['methods']:
            if method['id'] not in self.records: continue
            for rnd in method['rounds']:
                rows = [r for r in self.records[method['id']] if r['round']==rnd['name'].replace(' ','')]
                counts = Counter(r['verdict'] for r in rows)
                self.assertEqual(rnd['summary']['verdicts'], {v:counts[v] for v in VERDICTS})


if __name__ == '__main__':
    unittest.main()
