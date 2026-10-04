"""Verify V2 deadlines stop subprocess descendants and retain failure evidence."""
import importlib.util
import os
from pathlib import Path
import sys
import tempfile
import time
import unittest

path = Path(__file__).resolve().parents[1] / 'GeneticAlgorithm/Code/run_ga_results_v2.py'
spec = importlib.util.spec_from_file_location('ga_v2', path)
ga = importlib.util.module_from_spec(spec)
spec.loader.exec_module(ga)


@unittest.skipIf(os.name == 'nt', 'Defects4J runners execute on Linux/WSL')
class DeadlineTests(unittest.TestCase):
    def test_no_generated_tests_is_fail_not_unavailable(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            result = ga.measure_target('Gson',8,root/'tests',root/'results','/unused',1)
            self.assertEqual(result['coverage_status'],'FAIL')
            self.assertEqual(result['generation_status'],'FAIL')

    def test_timeout_kills_descendant_and_logs_reason(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            marker = root / 'child-completed'
            child = f"import time; from pathlib import Path; time.sleep(1); Path({str(marker)!r}).touch()"
            parent = f"import subprocess,sys,time; subprocess.Popen([sys.executable,'-c',{child!r}]); time.sleep(5)"
            with self.assertRaisesRegex(RuntimeError, 'TIMEOUT'):
                ga.run_command([sys.executable, '-c', parent], root/'run.log', .2)
            time.sleep(1)
            self.assertFalse(marker.exists())
            self.assertIn('TIMEOUT', (root/'run.log').read_text())

    def test_failed_measurement_still_writes_result(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            (root/'tests/Gson_8').mkdir(parents=True)
            (root/'tests/Gson_8/Example_ESTest.java').write_text('class Example_ESTest {}')
            fake = root/'slow-defects4j'
            fake.write_text('#!/bin/sh\nsleep 5\n')
            fake.chmod(0o755)
            result = ga.measure_target('Gson',8,root/'tests',root/'results',str(fake),1)
            self.assertEqual(result['coverage_status'],'NOT_AVAILABLE')
            self.assertIn('TIMEOUT',result['failure_reason'])
            self.assertTrue((root/'results/Gson_8/result.json').is_file())


if __name__ == '__main__':
    unittest.main()
