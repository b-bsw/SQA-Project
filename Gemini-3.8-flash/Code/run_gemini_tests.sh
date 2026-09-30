#!/usr/bin/env bash
set -euo pipefail
code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)

if [[ -d "$HOME/.sdkman/candidates/java/11.0.32+1-ms" ]]; then
  export JAVA_HOME="$HOME/.sdkman/candidates/java/11.0.32+1-ms"
  export PATH="$JAVA_HOME/bin:$PATH"
fi

if [[ -z ${DEFECTS4J_BIN:-} && -x "$HOME/bb/defects4j/framework/bin/defects4j" ]]; then
  export DEFECTS4J_BIN="$HOME/bb/defects4j/framework/bin/defects4j"
fi

exec python3 "$code_dir/run_gemini_tests.py" "$@"
