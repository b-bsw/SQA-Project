"""Generate/resume round 1 (seed 0, budget 60s by default)."""
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parents[2]))
from run_randoop_parallel import main

if __name__ == "__main__":
    if any(arg == "--round" or arg.startswith("--round=") for arg in sys.argv[1:]):
        raise SystemExit("This script is for round 1; use round2/generate.py for round 2")
    raise SystemExit(main(["--round", "1", *sys.argv[1:]]))
