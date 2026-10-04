"""Import an attributed manual AI response, preserving prior files and evidence."""
import argparse
from datetime import datetime, timezone
import hashlib
import importlib.util
import json
from pathlib import Path
import re
import shutil

ROOT=Path(__file__).resolve().parents[1]

def sha(data): return hashlib.sha256(data).hexdigest()

def write_json(path,value):
    path.parent.mkdir(parents=True,exist_ok=True)
    staged=path.with_suffix('.json.tmp')
    staged.write_text(json.dumps(value,ensure_ascii=False,indent=2)+'\n',encoding='utf-8')
    staged.replace(path)

def main():
    parser=argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--method',choices=['deepseek','gemini'],required=True)
    parser.add_argument('--round',type=int,choices=[1,2],required=True)
    parser.add_argument('--target',required=True)
    parser.add_argument('--source-class',required=True)
    parser.add_argument('--response',type=Path,required=True)
    parser.add_argument('--model',help='Exact model only if supplied by the user')
    args=parser.parse_args()
    if args.method=='gemini' and args.round!=1: parser.error('Gemini has Round1 only')
    if not re.fullmatch(r'[A-Za-z][A-Za-z0-9]*_[1-9][0-9]*',args.target): parser.error('Invalid target')
    if not re.fullmatch(r'[A-Za-z_$][A-Za-z0-9_$]*',args.source_class): parser.error('Invalid class name')
    sources=list((ROOT/'Resoucre'/args.target).rglob(args.source_class+'.java'))
    if len(sources)!=1: parser.error('Source class missing or ambiguous in Resource')
    source=sources[0]
    spec=importlib.util.spec_from_file_location('manual_validator',ROOT/'Deepseek-flash-v4/Code/deepseek/Round1/generate_deepseek_tests.py')
    generator=importlib.util.module_from_spec(spec); spec.loader.exec_module(generator)
    raw=args.response.read_bytes()
    code=raw.decode('utf-8-sig').replace('\r\n','\n').replace('\r','\n').strip()
    inline_fence=code.startswith('`') and not code.startswith('```') and code.endswith('`')
    if inline_fence: code=code[1:-1].strip()
    code=re.sub(r'\A```(?:java)?\s*\n','',code)
    code=re.sub(r'\n```\s*\Z','',code).strip()+'\n'
    # Pasted model responses can contain standalone Markdown fences inside
    # the Java body. Remove presentation delimiters, preserving the raw response.
    fences=len(re.findall(r'(?m)^\s*```(?:java)?\s*$',code))
    code=re.sub(r'(?m)^\s*```(?:java)?\s*$','',code).strip()+'\n'
    if not generator.is_valid_complete_java_test(code): parser.error('Incomplete Java; no TestCode or generation state changed')
    package=lambda text: re.search(r'(?m)^\s*package\s+([\w.]+)\s*;',text)
    expected=package(source.read_text(encoding='utf-8')); actual=package(code)
    if not actual or not expected or actual[1]!=expected[1]: parser.error('Test package differs from source')
    declaration=re.search(r'\bpublic\s+class\s+([\w$]+)\b',code)
    if not declaration: parser.error('Public test class missing')
    name=declaration[1]+'.java'
    group='Deepseek-flash-v4' if args.method=='deepseek' else 'Gemini-3.8-flash'
    base=ROOT/group
    destination=base/('TestCode2' if args.round==2 else 'TestCode')/(args.target+'_buggy')/name
    state_path=(base/'generation_state.json' if args.method=='gemini' else
                base/'state'/f'Round{args.round}'/('shards/'+args.target+'.json' if args.round==2 else 'generator_state.json'))
    now=datetime.now(timezone.utc)
    backup=ROOT/'.coverage-build/closure-backfill-20261004/manual-imports'/now.strftime('%Y%m%dT%H%M%S%fZ')
    result_folder=base/('Result2' if args.round==2 else 'Result')/args.target
    for existing in [destination,state_path,base/'state'/f'Round{args.round}'/'status'/(args.target+'.json'),
                     result_folder,(result_folder.parent/'report.csv')]:
        if not existing.exists(): continue
        saved=backup/existing.relative_to(ROOT); saved.parent.mkdir(parents=True,exist_ok=True)
        if existing.is_dir(): shutil.copytree(existing,saved)
        else: shutil.copy2(existing,saved)
    saved_input=backup/'response.txt'; saved_input.parent.mkdir(parents=True,exist_ok=True); saved_input.write_bytes(raw)
    destination.parent.mkdir(parents=True,exist_ok=True)
    staged=destination.with_suffix('.java.tmp'); staged.write_text(code,encoding='utf-8',newline='\n'); staged.replace(destination)
    task=f'{args.target}/{source.relative_to(ROOT/"Resoucre"/args.target).as_posix()}'
    record={'project':args.target,'source_file':str(source),'status':'GENERATED','test_file':str(destination),
            'file_size_bytes':destination.stat().st_size,'updated_at':now.isoformat(),'round':args.round,
            'generation_mode':'manual','model':args.model,'usage':None,'elapsed_seconds':None,'finish_reason':None,
            'attribution':'Method and round supplied by user; exact model, generation duration and token usage not supplied',
            'response_sha256':sha(raw),'test_sha256':sha(destination.read_bytes()),
            'removed_markdown_fences':fences,
            'removed_outer_inline_fence':inline_fence,
            'response_backup':saved_input.relative_to(ROOT).as_posix(),
            'test_annotations':len(re.findall(r'@(?:org\.junit\.)?Test\b',code))}
    state=json.loads(state_path.read_text(encoding='utf-8')) if state_path.is_file() else {}
    state[task]=record; write_json(state_path,state)
    manifest=backup/'import.json'; write_json(manifest,{'task':task,**record})
    print(json.dumps({'target':args.target,'round':args.round,'file':str(destination),
                      'status':'GENERATED','test_annotations':record['test_annotations'],
                      'backup':str(backup)},ensure_ascii=False))

if __name__=='__main__': main()
