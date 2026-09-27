"""Round paths and non-destructive import of legacy generation metadata."""
import json
from pathlib import Path


def round_paths(root: Path, number: int):
    suffix = "" if number == 1 else "_Round2"
    return root / "rounds" / f"Round{number}", root / f"TestCode{suffix}", root / f"Result{suffix}"


def write_json(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    temporary = path.with_suffix(".tmp")
    temporary.write_text(json.dumps(data, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    temporary.replace(path)


def prepare_round(root: Path, number: int, seed: int, budget: int):
    from run_randoop_parallel import load_state, prefer_newer
    state_root, _, _ = round_paths(root, number)
    config = state_root / "config.json"
    settings = {"round": number, "seed": seed, "time_limit": budget}
    other_config = round_paths(root, 3 - number)[0] / "config.json"
    other_seed = load_state(other_config).get("seed", 0 if number == 2 else 20260928)
    if seed == other_seed:
        raise ValueError("Round 1 and round 2 must use different seeds")
    if config.exists() and load_state(config) != settings:
        raise ValueError(f"Round settings differ from {config}; use the original seed/time limit")
    if not config.exists():
        write_json(config, settings)
    combined_path = state_root / "generation_state.json"
    if number == 1:
        combined = load_state(combined_path)
        # Keep all legacy files intact, reconcile global and per-project progress.
        legacy = load_state(root / "generation_state.json")
        for shard in (root / "state").glob("*.json"):
            for name, entry in load_state(shard).items():
                if prefer_newer(legacy.get(name), entry):
                    legacy[name] = entry
        for name, entry in legacy.items():
            if name in combined:
                continue
            entry = dict(entry, round=1)
            if "seed" not in entry:
                known = entry.get("source") != "DISK_SYNC" and "time_limit" in entry
                entry["seed"] = 0 if known else None
                entry["seed_source"] = "INFERRED_RANDOOP_DEFAULT" if known else "UNKNOWN"
            combined[name] = entry
        if not combined_path.exists() or combined != load_state(combined_path):
            write_json(combined_path, combined)
    elif not combined_path.exists():
        write_json(combined_path, {})
    return state_root
