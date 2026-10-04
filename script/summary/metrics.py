"""Evidence-based coverage classification shared by Excel, web and comparison.

Only saved results are counted. Source JSON/CSV files are read, never rewritten.
"""
from collections import Counter, defaultdict
import csv
import json
import math
import re
from pathlib import Path
from .verdicts import classify_bug, VERDICTS

ROOT = Path(__file__).resolve().parents[2]
METHODS = {
    'ga': ('GA (V2)', [('Round1','GeneticAlgorithm/Result_v2_Round1/report.csv'),
                      ('Round2','GeneticAlgorithm/Result_v2_Round2/report.csv')]),
    'randoop': ('FRT/Randoop', [('Round1','Feedback-Directed Random Test Generation/report.csv'),
                              ('Round2','Feedback-Directed Random Test Generation/report_Round2.csv')]),
    'deepseek': ('DeepSeek', [('Round1','Deepseek-flash-v4/Result/report.csv'),
                            ('Round2','Deepseek-flash-v4/Result2/report.csv')]),
    'gemini': ('Gemini', [('Round1','Gemini-3.8-flash/report.csv')]),
}
GROUP_IDS = {'GeneticAlgorithm':'ga','Feedback-Directed Random Test Generation':'randoop',
             'Deepseek-flash-v4':'deepseek','Gemini-3.8-flash':'gemini'}
SUCCESS = {'PASS','OK','TESTS_FAILED'}  # Assertion failures can still yield valid coverage.
FAILURE = {'FAIL','TIMEOUT','NOT_AVAILABLE','NOT_RUN','ERROR','COMPILE_FAILED',
           'TEST_COMPILE_FAILED','NO_TESTS','NO_TEST_FILES','CHECKOUT_FAILED'}
VALUE_FIELDS = {'line': ('line_coverage','line_cov'),
                'condition': ('condition_coverage','branch_cov'), 'coverage': ('coverage',)}
TOTAL_FIELDS = {'line': ('lines_total','lines'),
                'condition': ('conditions_total','total_branches','branches'),
                'coverage': ('total_goals',)}


def number(value):
    if value in (None,'') or isinstance(value,bool): return None
    try: result = float(value)
    except (ValueError,TypeError): return None
    return result if math.isfinite(result) else None


def first(record, names):
    return next((record[key] for key in names if key in record), None)


def evidence(source, payload=None):
    """Normalize measurement fields and buggy-side execution evidence."""
    payload = payload or {}
    buggy = payload.get('buggy', {})
    validation = next((r for r in payload.get('validations',[]) if r.get('subject')=='buggy'), {})
    details = {**source, **payload, **validation, **buggy}
    # CSV measurements are the summary's input; JSON only supplies missing columns
    # and execution evidence. A blank CSV metric is intentionally kept blank.
    for key in (*sum(VALUE_FIELDS.values(),()), *sum(TOTAL_FIELDS.values(),())):
        if key in source: details[key] = source[key]
    return details


def classify(details, metric):
    """Return RECORDED, A, B or UNRESOLVED without guessing from null alone.

    B requires zero measurable items AND evidence that coverage completed.
    Explicit coverage/compile failure wins over default zero totals. A numeric
    percentage for a successful zero-total metric is also B (legacy 0%/100%).
    """
    value = number(first(details, VALUE_FIELDS[metric]))
    total = number(first(details, TOTAL_FIELDS[metric]))
    coverage_status = str(details.get('coverage_status','')).upper()
    compile_failure = any(str(details.get(key,'')).upper() in FAILURE
                          for key in ('compile','test_compile'))
    failed = coverage_status in FAILURE or compile_failure
    successful = coverage_status in SUCCESS
    if compile_failure and successful:
        return {'kind':'UNRESOLVED','value':None,'reason':'successful coverage status conflicts with compile failure'}
    # Some historical summaries omit the coverage status, but a valid measurement
    # of the other metric proves the measurement stage produced a report.
    if not coverage_status and not compile_failure:
        other = 'condition' if metric=='line' else 'line'
        other_total = number(first(details,TOTAL_FIELDS[other]))
        other_value = number(first(details,VALUE_FIELDS[other]))
        successful = other_value is not None and other_total is not None and other_total > 0
    if total is not None and total < 0:
        return {'kind':'UNRESOLVED','value':None,'reason':'negative measurable total'}
    if total == 0 and successful and not failed:
        return {'kind':'B','value':None,'reason':'coverage completed; measurable total = 0'}
    if value is not None:
        if not 0 <= value <= 100 or failed or total == 0:
            return {'kind':'UNRESOLVED','value':None,'reason':'numeric coverage conflicts with total or failure status'}
        return {'kind':'RECORDED','value':value,'reason':'numeric coverage for applicable metric'}
    if not failed and not successful:
        execution = str(details.get('result',details.get('buggy_result',''))).upper()
        failed = execution in (FAILURE - {'FAIL'}) or str(details.get('verdict','')).upper()=='NOT_AVAILABLE'
    if failed:
        return {'kind':'A','value':None,'reason':'coverage unavailable or execution/compile failed'}
    return {'kind':'UNRESOLVED','value':None,'reason':'missing coverage without conclusive failure or successful zero-total evidence'}


def result_path(method, round_name, source, target):
    if method=='randoop':
        directory = 'Result' if round_name=='Round1' else 'Result_Round2'
        return ROOT / 'Feedback-Directed Random Test Generation' / directory / target / 'result.json'
    if method=='gemini': return ROOT / 'Gemini-3.8-flash/Result' / target / 'result.json'
    return (ROOT / source).parent / target / 'result.json'


def resource_targets(root=ROOT):
    reference = root / 'Resoucre'
    if not reference.is_dir():
        raise ValueError(f'Resource directory missing: {reference}')
    targets = {p.name for p in reference.iterdir()
               if p.is_dir() and re.fullmatch(r'[A-Za-z][A-Za-z0-9]*_[1-9][0-9]*',p.name)}
    if not targets:
        raise ValueError(f'No target folders in {reference}')
    return targets


def ga_verdict(details, validation=None):
    """Previous GA summary rule, retained only as the status-change baseline."""
    validation = validation or {}
    if details.get('generation_status') == 'FAIL' or details.get('coverage_status') == 'FAIL':
        return 'FAIL', 'Test generation failed'
    if number(validation.get('tests')) == 0:
        return 'FAIL', 'Saved generation produced no tests'
    buggy, fixed = validation.get('buggy_result'), validation.get('fixed_result')
    if buggy == 'FAIL' and fixed == 'PASS':
        return 'REVEALING', 'Same saved suite failed on buggy and passed on fixed'
    if buggy == fixed == 'PASS':
        return 'NOT_REVEALING', 'Same saved suite passed on buggy and fixed'
    if buggy not in ('PASS','FAIL') or fixed not in ('PASS','FAIL'):
        return 'NOT_AVAILABLE', 'Paired buggy/fixed validation missing or could not run'
    return 'INCONCLUSIVE', 'Fixed also failed; cannot attribute failure to the bug'


def load_records(method, *, resource_only=True):
    records = []
    allowed = resource_targets() if resource_only else None
    for round_name, source in METHODS[method][1]:
        with (ROOT/source).open(encoding='utf-8-sig',newline='') as stream:
            rows = list(csv.DictReader(stream))
        seen = set()
        for row in rows:
            bug_id = int(row['bug_id'])
            target = f"{row['project']}_{bug_id}"
            if target in seen: raise ValueError(f'Duplicate bug/round: {method}/{round_name}/{target}')
            seen.add(target)
            if allowed is not None and target not in allowed:
                continue
            path = result_path(method,round_name,source,target)
            payload = json.loads(path.read_text(encoding='utf-8')) if path.is_file() else {}
            details = evidence(row,payload)
            metrics = {metric:classify(details,metric) for metric in ('line','condition')}
            if 'coverage' in row: metrics['coverage']=classify(details,'coverage')
            verdict_fields = {}
            if method in ('ga', 'randoop', 'gemini', 'deepseek'):
                verdict_fields = classify_bug(ROOT, method, round_name, target, details, payload, metrics)
                if method == 'ga':
                    old_path = ROOT/'GeneticAlgorithm'/f'Result_{round_name}'/target/'result.json'
                    old_validation = json.loads(old_path.read_text(encoding='utf-8')) if old_path.is_file() else {}
                    previous = ga_verdict(details, old_validation)[0]
                else:
                    previous = row.get('verdict')
                verdict_fields['previousVerdict'] = previous
                # A failed latest generation invalidates stale numeric coverage.
                # The original percentages remain untouched in Data/details.
                if verdict_fields['verdict'] == 'FAIL':
                    metrics = {metric:{'kind':'A', 'value':None, 'reason':verdict_fields['verdictReason']}
                               for metric in metrics}
            records.append({'method':method,'round':round_name,'project':row['project'],
                            'bug_id':bug_id,'target':target,'metrics':metrics,'details':details,
                            'source':source,'result_source':path.relative_to(ROOT).as_posix(),
                            'result_json_present':path.is_file(), **verdict_fields})
    return records


def metric_summary(records, metric):
    selected = [r['metrics'][metric] for r in records]
    counts = Counter(r['kind'] for r in selected)
    values = [r['value'] for r in selected if r['kind']=='RECORDED']
    total = sum(values)
    applicable = len(records)-counts['B']
    # Unknown A/B membership changes the denominator; do not publish a guessed mean.
    unresolved = counts['UNRESOLVED']
    raw_values = [number(first(r['details'],VALUE_FIELDS[metric])) for r in records]
    raw_values = [v for v in raw_values if v is not None]
    return {'total':len(records),'recorded':counts['RECORDED'],'failure':counts['A'],
            'notApplicable':counts['B'],'unresolved':unresolved,'applicable':applicable if not unresolved else None,
            'coverageSum':total,'recordedOnly':total/len(values) if values else None,
            'notAvailableWithNumericCoverage':sum(r.get('verdict')=='NOT_AVAILABLE' and r['metrics'][metric]['kind']=='RECORDED' for r in records),
            'allResults':total/applicable if applicable and not unresolved else None,
            'runnablePercent':100*(len(records)-counts['A'])/len(records) if records and not unresolved else None,
            'oldRecordedOnly':sum(raw_values)/len(raw_values) if raw_values else None,
            'oldAllResults':sum(raw_values)/len(records) if records else None}


def intersection(all_records, round_name=None):
    """Intersect bug IDs per metric. Combined: average numeric rounds per bug first.

    Per-round intersections require all four methods in the same round. Combined
    averages each method's numeric round values per bug before averaging bugs.
    Missing/failed/N/A rounds supply no numeric value to this secondary analysis.
    """
    output = {}
    for metric in ('line','condition'):
        by_method = {}
        for method, records in all_records.items():
            bugs = defaultdict(list)
            for r in records:
                if round_name and r['round'] != round_name: continue
                m = r['metrics'][metric]
                if m['kind']=='RECORDED': bugs[r['target']].append((r['round'],m['value']))
            by_method[method] = bugs
        common = sorted(set.intersection(*(set(by_method[m]) for m in METHODS)))
        entries = []
        for bug in common:
            entries.append({'target':bug,'values':{m:sum(v for _,v in by_method[m][bug])/len(by_method[m][bug]) for m in METHODS},
                            'rounds':{m:[rnd for rnd,_ in by_method[m][bug]] for m in METHODS}})
        output[metric] = {'bugs':len(common),'entries':entries,
                          'recordedResults':{m:sum(len(e['rounds'][m]) for e in entries) for m in METHODS},
                          'averages':{m:sum(e['values'][m] for e in entries)/len(entries) if entries else None for m in METHODS}}
    return output


def resource_inventory(records, root=ROOT):
    """Compare actual saved results/tests against Resoucre, without inventing results."""
    pattern = re.compile(r'^[A-Za-z][A-Za-z0-9]*_[1-9][0-9]*$')
    expected = resource_targets(root)
    test_dirs = {
        'ga': ['GeneticAlgorithm/TestCode', 'GeneticAlgorithm/TestCode'],
        'randoop': ['Feedback-Directed Random Test Generation/TestCode', 'Feedback-Directed Random Test Generation/TestCode_Round2'],
        'deepseek': ['Deepseek-flash-v4/TestCode', 'Deepseek-flash-v4/TestCode2'],
        'gemini': ['Gemini-3.8-flash/TestCode'],
    }
    checks = []
    for method, rows in records.items():
        for index, (round_name, _) in enumerate(METHODS[method][1]):
            actual = {r['target'] for r in rows if r['round'] == round_name}
            tests_root = root / test_dirs[method][index]
            tests = {p.name.removesuffix('_buggy') for p in tests_root.iterdir()
                     if p.is_dir() and pattern.fullmatch(p.name.removesuffix('_buggy')) and any(p.rglob('*.java'))} if tests_root.is_dir() else set()
            checks.append({'method':method, 'round':round_name, 'referenceCount':len(expected),
                           'resultCount':len(actual & expected), 'testCount':len(tests & expected),
                           'savedResultCount':len(actual), 'savedTestCount':len(tests),
                           'missingResults':sorted(expected-actual), 'extraResults':sorted(actual-expected),
                           'missingTests':sorted(expected-tests), 'extraTests':sorted(tests-expected)})
    return checks


def analysis():
    records = {method:load_records(method) for method in METHODS}
    return {'resourceInventory':resource_inventory({m:load_records(m,resource_only=False) for m in METHODS}),
            'roundMetrics':{method:{scope:{metric:metric_summary([r for r in rows if scope=='All rounds' or r['round']==scope],metric)
                                          for metric in ('line','condition')}
                                   for scope in ('Round1','Round2','All rounds')} for method,rows in records.items()},
            'bugVerdicts':{method:{scope:{v:sum(r['verdict']==v for r in records[method] if scope=='All rounds' or r['round']==scope)
                                         for v in VERDICTS}
                                   for scope in (*[name for name,source in METHODS[method][1]],'All rounds')} for method in METHODS},
            'gaVerdicts':{scope:{v:sum(r['verdict']==v for r in records['ga'] if scope=='All rounds' or r['round']==scope)
                                for v in ('REVEALING','NOT_REVEALING','NOT_AVAILABLE','INCONCLUSIVE','FAIL')}
                          for scope in ('Round1','Round2','All rounds')},
            'methods':{method:{'name':METHODS[method][0],
                              'metrics':{metric:metric_summary(rows,metric) for metric in ('line','condition')}} for method,rows in records.items()},
            'intersection':{scope:intersection(records,None if scope=='All rounds' else scope) for scope in ('All rounds','Round1','Round2')},
            'unresolved':[audit_row(r,metric) for rows in records.values() for r in rows for metric,m in r['metrics'].items() if m['kind']=='UNRESOLVED'],
            'changed':[audit_row(r,metric) for rows in records.values() for r in rows for metric,m in r['metrics'].items() if m['kind']=='B'],
            'coverageVerdictDifferences':[{'method':r['method'],'round':r['round'],'target':r['target'],
                         'metric':metric,'coverage':m['value'],'latest_verdict':r['verdict'],
                         'not_available_cause':r['not_available_cause'],'buggy_result':r['buggy_result'],
                         'fixed_result':r['fixed_result'],'coverage_source':r['result_source'],
                         'verdict_source':r['verdictSource']}
                         for rows in records.values() for r in rows for metric,m in r['metrics'].items()
                         if metric in ('line','condition') and r['verdict']=='NOT_AVAILABLE' and m['kind']=='RECORDED'],
            'records':records}


def audit_row(record,metric):
    details=record['details']; m=record['metrics'][metric]
    return {'method':record['method'],'round':record['round'],'target':record['target'],'metric':metric,
            'kind':m['kind'],'reason':m['reason'],'rawCoverage':number(first(details,VALUE_FIELDS[metric])),
            'measurableTotal':number(first(details,TOTAL_FIELDS[metric])),
            'coverage_status':details.get('coverage_status'),
            'compile':details.get('compile'),'test_compile':details.get('test_compile'),
            'buggy_result':details.get('result',details.get('buggy_result')),
            'source':record['result_source'] if record.get('result_json_present',True) else record['source']}
