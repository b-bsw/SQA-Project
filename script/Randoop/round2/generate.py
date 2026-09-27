"""Generate/resume round 2 (seed 20260928, budget 60s by default)."""
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parents[1]))
from round_runner import run_round

if __name__ == "__main__":
    raise SystemExit(run_round(2, "generate"))
