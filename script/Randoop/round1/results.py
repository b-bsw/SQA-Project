"""Run buggy/fixed validation and collect round 1 coverage/results."""
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parents[3] /
                      "Feedback-Directed Random Test Generation" / "Code"))
from run_feedback_directed_tests import main

if __name__ == "__main__":
    if any(arg == "--round" or arg.startswith("--round=") for arg in sys.argv[1:]):
        raise SystemExit("This script is for round 1")
    raise SystemExit(main(["--round", "1", *sys.argv[1:]]))
