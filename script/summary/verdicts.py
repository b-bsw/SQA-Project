"""Bug/round verdicts from saved generation and execution evidence only.

No source results or generation state are written by this module.
"""
from functools import lru_cache
import json
import re

from generate_randoop_tests import parse_java_file_info

VERDICTS = ('REVEALING', 'NOT_REVEALING', 'NOT_AVAILABLE', 'INCONCLUSIVE', 'FAIL')
SUCCESS = {'PASS', 'OK', 'TESTS_FAILED'}
FAILED_STAGE = {'FAIL', 'FAILED', 'ERROR', 'TIMEOUT', 'NOT_RUN', 'NOT_AVAILABLE',
                'COMPILE_FAILED', 'TEST_COMPILE_FAILED', 'CHECKOUT_FAILED'}
NA_CAUSES = ('BUGGY_NOT_RUN', 'FIXED_NOT_RUN', 'BOTH_NOT_RUN', 'COVERAGE_UNAVAILABLE')


@lru_cache(maxsize=None)
def read_json(path):
    return json.loads(path.read_text(encoding='utf-8')) if path.is_file() else {}


@lru_cache(maxsize=None)
def test_files(directory):
    """Usable source means at least one JUnit test method, before compilation."""
    files = sorted(directory.rglob('*.java'))
    for source in files:
        with source.open(encoding='utf-8', errors='replace') as stream:
            if any(re.search(r'@(?:org\.junit\.)?Test\b', line) for line in stream):
                return len(files), True
    return len(files), False


@lru_cache(maxsize=None)
def resource_classes(directory):
    return {parse_java_file_info(p, directory)['fqcn'] for p in directory.rglob('*.java')}


@lru_cache(maxsize=None)
def ai_generation_records(base, method, round_name):
    """Latest record per source task, matching the existing summary state lookup."""
    state = base / 'state' / round_name
    paths = [base / 'generation_state.json'] if method == 'gemini' and round_name == 'Round1' else []
    if round_name == 'Round1': paths.append(state / 'generator_state.json')
    paths.extend(sorted((state / 'shards').glob('*.json')))
    records = {}
    for path in paths:
        for task, value in read_json(path).items():
            if not isinstance(value, dict): continue
            current = records.get(task)
            if current is None or str(value.get('updated_at', '')) >= str(current[0].get('updated_at', '')):
                records[task] = (value, path)
    return records


def generation_failed(record):
    return (str(record.get('status', '')).upper() in {'FAIL', 'FAILED', 'LIMIT_REACHED', 'ERROR', 'TIMEOUT'}
            or record.get('finish_reason') == 'length' or record.get('is_truncated') is True)


def unavailable_cause(status, validations, buggy, fixed):
    """Exclusive cause: execution failures first, coverage-only failure last."""
    if status != 'NOT_AVAILABLE': return None
    by_side = {r.get('subject'): r for r in validations}
    def unavailable(side, result):
        return result not in ('PASS', 'FAIL') or any(
            str(by_side.get(side, {}).get(field, '')).upper() in FAILED_STAGE
            for field in ('compile', 'test_compile', 'test_status', 'status')
            if field != 'test_status' or str(by_side.get(side, {}).get(field, '')).upper() != 'FAIL')
    a, b = unavailable('buggy', buggy), unavailable('fixed', fixed)
    if a and b: return 'BOTH_NOT_RUN'
    if a: return 'BUGGY_NOT_RUN'
    if b: return 'FIXED_NOT_RUN'
    return 'COVERAGE_UNAVAILABLE'


def decide_status(*, has_tests, latest_generation_failed, measurement_failed,
                  validations, buggy, fixed):
    """Precedence: generation/source failure, execution failure, paired verdict."""
    if latest_generation_failed:
        return 'FAIL', 'Latest same-round generation failed; older files/results are excluded'
    if not has_tests:
        return 'FAIL', 'No saved Java source containing a JUnit test method'
    if measurement_failed:
        return 'NOT_AVAILABLE', 'Tests exist but current coverage did not complete'
    for validation in validations:
        for field in ('compile', 'test_compile', 'coverage_status', 'status'):
            if str(validation.get(field, '')).upper() in FAILED_STAGE:
                return 'NOT_AVAILABLE', f"{validation.get('subject', 'execution')} {field}={validation[field]}"
    if buggy not in ('PASS', 'FAIL') or fixed not in ('PASS', 'FAIL'):
        return 'NOT_AVAILABLE', 'Paired buggy/fixed execution missing or could not run'
    for validation in validations:
        run_status = str(validation.get('test_status', '')).upper()
        if run_status in FAILED_STAGE and run_status != 'FAIL':
            return 'NOT_AVAILABLE', f"{validation.get('subject', 'execution')} test_status={validation['test_status']}"
        # FAIL here is an assertion failure, evaluated from the paired results below.
    if buggy == 'FAIL' and fixed == 'PASS':
        return 'REVEALING', 'Same saved validation suite failed on buggy and passed on fixed'
    if buggy == fixed == 'PASS':
        return 'NOT_REVEALING', 'Same saved validation suite passed on buggy and fixed'
    return 'INCONCLUSIVE', 'Fixed also failed; assertion failure cannot be attributed to this bug'


def classify_bug(root, method, round_name, target, details, payload, metrics):
    if method == 'ga':
        base = root / 'GeneticAlgorithm'
        test_dir = base / 'TestCode' / target
        validation_path = base / f'Result_{round_name}' / target / 'result.json'
        metadata = read_json(validation_path)
        generation_source = validation_path
        validation = metadata
        if payload.get('paired_validation'):
            validation = payload
            validation_path = base / f'Result_v2_{round_name}' / target / 'result.json'
        latest_failed = str(details.get('generation_status', '')).upper() in {'FAIL', 'FAILED'}
    elif method == 'randoop':
        base = root / 'Feedback-Directed Random Test Generation'
        test_dir = base / ('TestCode' if round_name == 'Round1' else 'TestCode_Round2') / (target + '_buggy')
        state_dir = base / 'rounds' / round_name
        shard = state_dir / 'state' / f"{target.rsplit('_', 1)[0]}.json"
        combined = state_dir / 'generation_state.json'
        metadata = read_json(shard).get(target)
        generation_source = shard
        if metadata is None:
            metadata = read_json(combined).get(target, {})
            generation_source = combined
        validation = payload
        validation_path = base / ('Result' if round_name == 'Round1' else 'Result_Round2') / target / 'result.json'
        latest_failed = str(metadata.get('status', '')).upper() in {'FAIL', 'FAILED'}
    elif method in ('gemini', 'deepseek'):
        base = root / ('Gemini-3.8-flash' if method == 'gemini' else 'Deepseek-flash-v4')
        test_dir = base / ('TestCode2' if round_name == 'Round2' else 'TestCode') / (target + '_buggy')
        validation_path = base / ('Result2' if round_name == 'Round2' else 'Result') / target / 'result.json'
        paired = [{**payload.get(side, {}), 'subject': side} for side in ('buggy', 'fixed')]
        validation = {'buggy_result': payload.get('buggy', {}).get('result', details.get('buggy_result')),
                      'fixed_result': payload.get('fixed', {}).get('result', details.get('fixed_result')),
                      'validations': paired}
        tasks = {task: value for task, value in ai_generation_records(base, method, round_name).items()
                 if task.startswith(target + '/')}
        failed_tasks = {task: value for task, value in tasks.items() if generation_failed(value[0])}
        generation_source = base / 'state' / round_name / 'status' / (target + '.json')
        metadata = read_json(generation_source)
        # A failed class alongside successfully generated classes is partial,
        # as for GA. An explicit failed bug attempt or failure of every recorded
        # current task invalidates an older saved suite.
        latest_failed = generation_failed(metadata) or bool(tasks and len(failed_tasks) == len(tasks))
    else:
        raise ValueError(f'Unknown verdict method: {method}')
    files, has_tests = test_files(test_dir)
    coverage_status = str(details.get('coverage_status', '')).upper()
    measurement_failed = (coverage_status in FAILED_STAGE or
                          any(m['kind'] == 'A' for m in metrics.values()) or
                          not any(m['kind'] in ('RECORDED', 'B') for m in metrics.values()))
    buggy, fixed = validation.get('buggy_result'), validation.get('fixed_result')
    status, reason = decide_status(has_tests=has_tests, latest_generation_failed=latest_failed,
                                   measurement_failed=measurement_failed,
                                   validations=validation.get('validations', []), buggy=buggy, fixed=fixed)
    partial, known, failed_classes, missing_classes, ignored = 'N/A', True, [], [], []
    notes = [reason]
    generation_sources = [generation_source] if generation_source.is_file() else []
    if method in ('gemini', 'deepseek'):
        generation_sources.extend(sorted({path for value, path in tasks.values()}))
        for task, (entry, path) in failed_tasks.items():
            notes.append(f"Class generation unavailable: {task}; status={entry.get('status')}; finish_reason={entry.get('finish_reason')}; {entry.get('error', '')}")
        if not tasks and not metadata:
            notes.append('Same-round generation metadata missing; use saved tests and execution evidence, no failure inferred')
    if method == 'ga':
        reported = {item['target_class']: item for item in metadata.get('targets', [])}
        # Legacy metadata includes .txt resources as generation targets. They are
        # not Java classes and must not create a partial-class generation flag.
        ignored = [c for c in reported if c.endswith('.txt') or c.startswith('src.main.resources.')]
        classes = {c: t for c, t in reported.items() if c not in ignored}
        failed_classes = sorted(c for c, t in classes.items()
                                if t.get('generation_result') != 'PASS' or t.get('tests') == 0)
        missing_classes = sorted(resource_classes(root / 'Resoucre' / target) - set(classes)) if classes else []
        known = bool(classes) or not has_tests
        partial = bool(has_tests and (failed_classes or missing_classes))
        if failed_classes: notes.append('Failed Java class generation: ' + ', '.join(failed_classes))
        if missing_classes: notes.append('Resource Java classes absent from generation record: ' + ', '.join(missing_classes))
        if ignored: notes.append('Non-Java resource targets excluded from partial_generation: ' + ', '.join(ignored))
        if not known: notes.append('Per-class evidence missing; false means no recorded partial failure, completeness unverified')
        notes.append('Paired V2 validation and coverage use the same suite; both rounds repeat saved TestCode'
                     if payload.get('paired_validation') else
                     'V2 coverage and historical same-round paired validation may use different suites')
    if latest_failed and has_tests:
        notes.append(f"Stale saved suite: generation={metadata.get('timestamp')}; result={payload.get('created_at')}")
    if (coverage_status == 'TESTS_FAILED' or details.get('test_status') == 'FAIL') and any(
            m['kind'] == 'RECORDED' for m in metrics.values()):
        notes.append('Assertions failed with measured coverage; paired execution and stage checks determine status')
    if details.get('failure_reason'): notes.append(str(details['failure_reason']))
    return {'verdict': status, 'verdictReason': reason, 'notes': '; '.join(notes),
            'partial_generation': partial, 'partial_generation_known': known,
            'failed_generation_classes': failed_classes, 'missing_generation_classes': missing_classes,
            'ignored_resource_targets': ignored, 'buggy_result': buggy, 'fixed_result': fixed,
            'java_files': files, 'has_test_methods': has_tests,
            'latest_generation_failed': latest_failed,
            'stale_generation_failure': latest_failed and has_tests,
            'not_available_cause': unavailable_cause(status, validation.get('validations', []), buggy, fixed),
            'generation_failed_tasks': sorted(failed_tasks) if method in ('gemini', 'deepseek') else [],
            'generationSource': '; '.join(p.relative_to(root).as_posix() for p in generation_sources) or None,
            'verdictSource': validation_path.relative_to(root).as_posix() if validation_path.is_file() else None}
