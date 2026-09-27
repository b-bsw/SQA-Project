"""Time the complete generation/results command invoked from a round folder."""
import sys
from pathlib import Path

WORKSPACE = Path(__file__).resolve().parents[2]
sys.path.insert(0, str(WORKSPACE / "script"))
from randoop_timing import track_script_run


def run_round(number, phase, argv=None):
    arguments = list(sys.argv[1:] if argv is None else argv)
    if any(arg == "--round" or arg.startswith("--round=") for arg in arguments):
        raise SystemExit(f"This script is for round {number}; use the other round folder to switch")
    summary = {"entrypoint": f"script/Randoop/round{number}/{phase}.py",
               "phase": phase, "round": number, "arguments": arguments}
    with track_script_run(summary):
        if phase == "generate":
            # The shared implementation receives this timer, avoiding a second batch timer.
            from run_randoop_parallel import _main
            result = _main(["--round", str(number), *arguments], summary)
        else:
            sys.path.insert(0, str(WORKSPACE / "Feedback-Directed Random Test Generation" / "Code"))
            from run_feedback_directed_tests import main
            summary["script"] = "run_feedback_directed_tests"
            if not any(arg in ("--dry-run", "--help", "-h") for arg in arguments):
                summary["log_dir"] = (WORKSPACE / "Feedback-Directed Random Test Generation" /
                                      "rounds" / f"Round{number}" / "script_runs")
                summary["state_file"] = str(summary["log_dir"].parent / "generation_state.json")
                from randoop_timing import start_runtime_in_state
                start_runtime_in_state(summary)
            result = main(["--round", str(number), *arguments])
        summary["status"] = "COMPLETED" if result == 0 else ("INTERRUPTED" if result == 130 else "FAILED")
        return result
