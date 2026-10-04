"""AI generation, execution, coverage precedence and saved summary checks."""
from collections import Counter
import json
from pathlib import Path
import unittest
from zipfile import ZipFile

from summary.verdicts import classify_bug, decide_status, NA_CAUSES, unavailable_cause, VERDICTS
from summary.metrics import ROOT, load_records
from coverage_summaries import build_directory
from summary.tests.test_bug_verdicts import cells
from build_report_site import build_snapshot


class AIVerdictTests(unittest.TestCase):
    def fixture(self, state):
        scratch=ROOT/'.coverage-build'; scratch.mkdir(exist_ok=True)
        with build_directory(scratch) as root:
            base=root/'Gemini-3.8-flash'
            tests=base/'TestCode/Codec_1_buggy'; tests.mkdir(parents=True)
            (tests/'FooTest.java').write_text('class FooTest { @org.junit.Test public void example() {} }',encoding='utf-8')
            (base/'generation_state.json').write_text(json.dumps(state),encoding='utf-8')
            payload={'buggy':{'result':'PASS','compile':'PASS','test_compile':'PASS','coverage_status':'PASS'},
                     'fixed':{'result':'PASS','compile':'PASS','test_compile':'PASS'}}
            metrics={m:{'kind':'RECORDED','value':50} for m in ('line','condition')}
            return classify_bug(root,'gemini','Round1','Codec_1',payload['buggy'],payload,metrics)

    def test_all_latest_tasks_failed_invalidate_old_sources(self):
        r=self.fixture({'Codec_1/Foo.java':{'status':'FAILED','error':'Quota exhausted','updated_at':'2026-10-01'}})
        self.assertEqual(r['verdict'],'FAIL')
        self.assertTrue(r['stale_generation_failure'])

    def test_truncated_complete_record_is_generation_failure(self):
        r=self.fixture({'Codec_1/Foo.java':{'status':'COMPLETED','finish_reason':'length'}})
        self.assertEqual(r['verdict'],'FAIL')

    def test_partial_class_failure_uses_execution_as_user_confirmed(self):
        r=self.fixture({'Codec_1/Foo.java':{'status':'FAILED'},
                        'Codec_1/Bar.java':{'status':'COMPLETED','finish_reason':'stop'}})
        self.assertEqual(r['verdict'],'NOT_REVEALING')
        self.assertFalse(r['latest_generation_failed'])
        self.assertEqual(r['generation_failed_tasks'],['Codec_1/Foo.java'])

    def test_missing_generation_state_is_not_guessed_as_failure(self):
        r=self.fixture({})
        self.assertEqual(r['verdict'],'NOT_REVEALING')
        self.assertIn('metadata missing',r['notes'])

    def test_unavailable_causes_are_exclusive_and_execution_precedes_coverage(self):
        for buggy,fixed,expected in [('NOT_RUN','PASS','BUGGY_NOT_RUN'),
                                     ('PASS','NOT_RUN','FIXED_NOT_RUN'),
                                     ('NOT_RUN','NOT_RUN','BOTH_NOT_RUN'),
                                     ('FAIL','PASS','COVERAGE_UNAVAILABLE')]:
            self.assertEqual(unavailable_cause('NOT_AVAILABLE',[],buggy,fixed),expected)
        self.assertEqual(unavailable_cause('NOT_AVAILABLE',[{'subject':'fixed','test_compile':'FAIL'}],'PASS','PASS'),'FIXED_NOT_RUN')
        self.assertIsNone(unavailable_cause('FAIL',[],'NOT_RUN','NOT_RUN'))

    def test_execution_timeout_overrides_stale_paired_results(self):
        validations=[{'subject':'fixed','test_status':'TIMEOUT'}]
        status,_=decide_status(has_tests=True,latest_generation_failed=False,
                              measurement_failed=False,validations=validations,
                              buggy='FAIL',fixed='PASS')
        self.assertEqual(status,'NOT_AVAILABLE')
        self.assertEqual(unavailable_cause(status,validations,'FAIL','PASS'),'FIXED_NOT_RUN')

    def test_current_bug_cohorts_and_cause_partition(self):
        for method,n in [('gemini',854),('deepseek',1708)]:
            records=load_records(method)
            self.assertEqual(len(records),n)
            for rnd in {r['round'] for r in records}:
                rows=[r for r in records if r['round']==rnd]
                self.assertEqual(len(rows),854)
                counts=Counter(r['verdict'] for r in rows)
                self.assertEqual(sum(counts[v] for v in VERDICTS),854)
                causes=Counter(r['not_available_cause'] for r in rows if r['verdict']=='NOT_AVAILABLE')
                self.assertEqual(sum(causes[c] for c in NA_CAUSES),counts['NOT_AVAILABLE'])
        rows={r['target']:r for r in load_records('gemini')}
        self.assertEqual({t for t,r in rows.items() if r['verdict']=='FAIL'},{'Compress_16','Jsoup_67'})
        self.assertEqual(rows['Mockito_30']['verdict'],'NOT_REVEALING')
        for target in ('Mockito_30','Compress_29','Jsoup_56','JacksonDatabind_111'):
            self.assertTrue(rows[target]['generation_failed_tasks'])
            self.assertNotEqual(rows[target]['verdict'],'FAIL')

    def test_excel_final_counts_formulas_causes_and_absent_round(self):
        for method,base in [('gemini','Gemini-3.8-flash'),('deepseek','Deepseek-flash-v4')]:
            records=load_records(method)
            with ZipFile(ROOT/base/'summary.xlsx') as archive:
                bugrows=[v for n,v,f in cells(archive,'BugResults') if n>=2 and v.get('A')]
                self.assertEqual(len(bugrows),len(records))
                lookup={(r['round'],r['target']):r for r in records}
                for v in bugrows:
                    r=lookup[(v['C'],f"{v['A']}_{int(v['B'])}")]
                    self.assertEqual(v['D'],r['verdict'])
                    self.assertEqual(v.get('P'),r['not_available_cause'])
                for n,v,f in cells(archive,'Verdicts'):
                    if n<7 or v.get('D') not in VERDICTS:continue
                    rows=[r for r in records if (v['B']=='All projects' or v['B']==r['project']) and (v['C']=='All rounds' or v['C']==r['round'])]
                    count=sum(r['verdict']==v['D'] for r in rows)
                    self.assertEqual(v['E'],count)
                    if rows:self.assertAlmostEqual(v['F'],count/len(rows))
                    else:self.assertEqual(v['F'],'—')
                    if rows:self.assertIn('BugResults',f['E'])
                    else:self.assertEqual(f['E'],'0')
                for n,v,f in cells(archive,'StatusChecks'):
                    if n<7 or not v.get('B'):continue
                    self.assertEqual(v['D'],v['E']);self.assertEqual(v['E'],v['F']);self.assertEqual(v['G'],0)
                    if method=='gemini' and v['C']=='Round2':self.assertEqual(v['D'],0)
                for n,v,f in cells(archive,'UnavailableCauses'):
                    if n<7 or v.get('D') not in NA_CAUSES:continue
                    rows=[r for r in records if (v['B']=='All projects' or v['B']==r['project']) and (v['C']=='All rounds' or v['C']==r['round'])]
                    count=sum(r['not_available_cause']==v['D'] for r in rows)
                    na=sum(r['verdict']=='NOT_AVAILABLE' for r in rows)
                    self.assertEqual(v['E'],count);self.assertEqual(v['G'],na)
                    if na:self.assertAlmostEqual(v['F'],count/na)
                    else:self.assertEqual(v['F'],'—')
                    if v.get('H') is not None:self.assertEqual(v['H'],0)
                    if rows:self.assertIn('COUNTIF',f['E'])
                    else:self.assertEqual(f['E'],'0')
                dash={n:v for n,v,f in cells(archive,'Dashboard')}
                self.assertEqual(dash[18]['B'],'Verdict')
                for column,rnd in [('C','Round1'),('D','Round2'),('E','All rounds')]:
                    rows=[r for r in records if rnd=='All rounds' or r['round']==rnd]
                    for n,status in enumerate(VERDICTS,19):
                        self.assertEqual(dash[n][column],sum(r['verdict']==status for r in rows))
                    self.assertEqual(dash[9][column],sum(r['verdict']=='REVEALING' for r in rows))

    def test_web_final_verdict_matches_evidence(self):
        for method in build_snapshot()['methods']:
            if method['id'] not in ('gemini','deepseek'):continue
            records=load_records(method['id'])
            self.assertEqual(method['summary']['verdicts'],{s:sum(r['verdict']==s for r in records) for s in VERDICTS})


if __name__=='__main__':
    unittest.main()
