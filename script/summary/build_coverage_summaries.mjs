import fs from 'node:fs/promises';
import path from 'node:path';
import { FileBlob, SpreadsheetFile } from '@oai/artifact-tool';
import { buildIntegratedReports } from './report_sections.mjs';

export function columnName(index) {
  let name = '';
  for (let n = index + 1; n; n = Math.floor((n - 1) / 26)) name = String.fromCharCode(65 + (n - 1) % 26) + name;
  return name;
}

// Coalesce adjacent source rows to avoid Excel's 255-argument limit.
export function references(indices, column) {
  const spans = [];
  for (const index of indices) {
    const last = spans.at(-1);
    if (last && last[1] + 1 === index) last[1] = index;
    else spans.push([index, index]);
  }
  return spans.map(([start, end]) => `'Data'!$${column}$${start}:$${column}$${end}`).join(',');
}

export function groupsFor(data) {
  const headers = data[0];
  const field = name => headers.indexOf(name);
  const records = data.slice(1).map((values, index) => ({
    values, index: index + 2,
    round: String(values[field('round')]).replace(/^([12])$/, 'Round$1'),
    project: field('project') >= 0 ? values[field('project')] : String(values[field('target')]).split('_')[0],
  }));
  const projects = [...new Set(records.map(row => row.project))].sort();
  const groups = [];
  for (const project of [null, ...projects]) {
    for (const round of [null, 'Round1', 'Round2']) {
      groups.push({ project: project ?? 'All projects', round: round ?? 'All rounds',
        rows: records.filter(row => (!project || row.project === project) && (!round || row.round === round)) });
    }
  }
  return groups;
}

export function metricStats(rows, column, scale) {
  const values = rows.map(row => row.values[column]).filter(value => typeof value === 'number' && Number.isFinite(value));
  const sum = values.reduce((total, value) => total + value, 0) / scale;
  return { count: values.length, recorded: values.length ? sum / values.length : null,
    all: rows.length ? sum / rows.length : null };
}

function formatTable(sheet, header, last, end='L') {
  sheet.getRange(`B${header}:${end}${last}`).format.font = {name:'Arial',size:11,color:'#18263b'};
  sheet.getRange(`B${header}:${end}${header}`).format = {fill:'#172b49',font:{name:'Arial',size:11,bold:true,color:'#ffffff'},wrapText:true,rowHeight:42};
  sheet.getRange(`B${header+1}:${end}${last}`).format.rowHeight = 23;
  sheet.getRange(`B${header}:B${last}`).format.columnWidth = 27;
  sheet.getRange(`C${header}:D${last}`).format.columnWidth = 17;
  sheet.getRange(`E${header}:${end}${last}`).format.columnWidth = 15;
  if(end==='L'||end==='M') {
    sheet.getRange(`E${header+1}:I${last}`).setNumberFormat('#,##0');
    sheet.getRange(`J${header+1}:L${last}`).setNumberFormat('0.00%');
  }
}

function sheetFor(workbook,name) {
  try {return workbook.worksheets.getItem(name);} catch {return workbook.worksheets.add(name);}
}

function aggregateFormula(name, indices, column, criterion) {
  const refs=references(indices,column).replaceAll("'Data'!","'CoverageCases'!").split(',').filter(Boolean);
  if(!refs.length)return '0';
  if(criterion)return refs.map(ref=>`${name}(${ref},"${criterion}")`).join('+');
  // Also support fragmented datasets exceeding Excel's 255 function arguments.
  const expressions=[];
  for(let i=0;i<refs.length;i+=200) expressions.push(`${name}(${refs.slice(i,i+200).join(',')})`);
  return expressions.join('+');
}

function buildBugVerdicts(workbook, dashboard, config, data) {
  if (!['ga','randoop','gemini','deepseek'].includes(config.records[0]?.method)) return;
  const method=config.records[0].method;
  const availableRounds=config.resourceInventory.map(r=>r.round);
  const verdicts=['REVEALING','NOT_REVEALING','NOT_AVAILABLE','INCONCLUSIVE','FAIL'];
  const bugs=sheetFor(workbook,'BugResults');
  bugs.getUsedRange()?.clear({applyTo:'contents'});
  bugs.showGridLines=false;
  bugs.tables.items.forEach(table=>table.delete());
  bugs.getRange('A1:V1').values=[['project','bug_id','round','status','partial_generation','notes','partial_generation_known','previous_status','buggy_result','fixed_result','java_files','latest_generation_failed','generation_source','validation_source','coverage_source','not_available_cause','generation_failed_tasks','failed_generation_classes','missing_generation_classes','stale_generation_failure','has_test_methods','status_changed']];
  const flag=value=>typeof value==='boolean'?String(value):value;
  // COUNTIF on native Boolean cells is not calculated by the authoring runtime.
  // Explicit true/false labels keep Excel formulas and exported caches identical.
  bugs.getRange('A2').write(config.records.map(r=>[r.project,r.bug_id,r.round,r.verdict,flag(r.partial_generation),r.notes,flag(r.partial_generation_known),r.previousVerdict,r.buggy_result??null,r.fixed_result??null,r.java_files,r.latest_generation_failed,r.generationSource??null,r.verdictSource??null,r.result_source,r.not_available_cause??null,(r.generation_failed_tasks??[]).join('; '),(r.failed_generation_classes??[]).join('; '),(r.missing_generation_classes??[]).join('; '),flag(r.stale_generation_failure),flag(r.has_test_methods),flag(r.previousVerdict!==r.verdict)]));
  const last=config.records.length+1;
  bugs.getRange(`A1:O${last}`).format={font:{name:'Arial',size:11,color:'#18263b'},columnWidth:18};
  const bugTable=bugs.tables.add(`A1:V${last}`,true,'BugResultsTable');
  bugTable.showFilterButton=true;
  bugTable.style='TableStyleMedium2';
  bugs.getRange('A1:V1').format={fill:'#172b49',font:{name:'Arial',size:11,bold:true,color:'#ffffff'},wrapText:true,rowHeight:44};
  bugs.getRange(`D1:D${last}`).format.columnWidth=24;
  bugs.getRange(`F1:F${last}`).format.columnWidth=94;
  bugs.getRange(`F2:F${last}`).format={wrapText:true,rowHeight:80};
  bugs.getRange(`A2:O${last}`).format.verticalAlignment='center';
  bugs.getRange(`M1:O${last}`).format.columnWidth=70;
  bugs.getRange(`P1:P${last}`).format.columnWidth=28;
  bugs.getRange(`Q1:S${last}`).format={columnWidth:55,wrapText:true,font:{name:'Arial',size:11,color:'#18263b'}};
  bugs.getRange(`T1:V${last}`).format={columnWidth:24,font:{name:'Arial',size:11,color:'#18263b'}};
  bugs.freezePanes.freezeRows(1);
  const sheet=sheetFor(workbook,'Verdicts');
  sheet.getUsedRange()?.unmerge();
  sheet.getUsedRange()?.clear({applyTo:'contents'});
  sheet.showGridLines=false;
  sheet.getRange('B2').values=[['Bug verdicts by project and round']];
  sheet.getRange('B2').format.font={name:'Arial',size:16,bold:true,color:'#18263b'};
  sheet.getRange('B3:I3').merge();
  sheet.getRange('B3').values=[['One bug per round. FAIL = no usable tests or latest whole-bug generation failed. Partial class failures use execution results. NOT_AVAILABLE = compile, run, coverage or paired validation unavailable.']];
  sheet.getRange('B4:I4').merge();
  sheet.getRange('B4').values=[[`All rounds pools ${availableRounds.length} recorded round(s), ${config.records.length.toLocaleString('en-US')} cases. See BugResults for evidence and StatusChecks for totals.`]];
  sheet.getRange('B3:I4').format={wrapText:true,rowHeight:32,font:{name:'Arial',size:10,color:'#4c627b'}};
  sheet.getRange('B6:F6').values=[['Project','Round','Verdict','Count','Share']];
  const checks=sheetFor(workbook,'StatusChecks');
  checks.getUsedRange()?.clear({applyTo:'contents'});
  checks.showGridLines=false;
  checks.getRange('B2').values=[['Five-status reconciliation']];
  checks.getRange('B6:I6').values=[['Project','Round','Resource cases','Bug rows','Status sum','Difference','Partial','Class evidence missing']];
  const byRow=new Map(config.records.map(r=>[r.dataRow,r]));
  const locations=new Map();
  let outputRow=7,checkRow=7;
  for (const group of groupsFor(data)) {
    const rows=group.rows.map(r=>byRow.get(r.index));
    const refs=column=>references(group.rows.map(r=>r.index),column).replaceAll("'Data'!","'BugResults'!").split(',').filter(Boolean);
    const count=(column,criterion)=>refs(column).map(ref=>`COUNTIF(${ref},${criterion})`).join('+')||'0';
    const start=outputRow;
    for (const verdict of verdicts) {
      sheet.getRange(`B${outputRow}:D${outputRow}`).values=[[group.project,group.round,verdict]];
      sheet.getRange(`E${outputRow}:F${outputRow}`).formulas=[[`=${count('D',`"${verdict}"`)}`,rows.length?`=E${outputRow}/${rows.length}`:'="—"']];
      const expected=rows.filter(r=>r.verdict===verdict).length;
      if (sheet.getRange(`E${outputRow}`).values[0][0]!==expected)throw new Error(`Verdict count mismatch ${group.project}/${group.round}/${verdict}`);
      locations.set(`${group.project}/${group.round}/${verdict}`,outputRow++);
    }
    const roundCount=group.round==='All rounds'?availableRounds.length:Number(availableRounds.includes(group.round));
    const expected=group.project==='All projects'
      ?config.resourceInventory[0].referenceCount*roundCount
      :new Set(config.records.filter(r=>r.project===group.project).map(r=>r.target)).size*roundCount;
    checks.getRange(`B${checkRow}:D${checkRow}`).values=[[group.project,group.round,expected]];
    checks.getRange(`E${checkRow}:I${checkRow}`).formulas=[[
      `=${refs('A').map(ref=>`COUNTA(${ref})`).join('+')||'0'}`,
      `=SUM('Verdicts'!E${start}:E${outputRow-1})`,
      `=F${checkRow}-D${checkRow}`,
      config.ga?`=${count('E','"true"')}`:'="N/A"',
      config.ga?`=${count('G','"false"')}`:'="N/A"']];
    const calculated=checks.getRange(`E${checkRow}:I${checkRow}`).values[0];
    const intended=[rows.length,rows.length,rows.length-expected,
      config.ga?rows.filter(r=>r.partial_generation===true).length:'N/A',
      config.ga?rows.filter(r=>!r.partial_generation_known).length:'N/A'];
    if (JSON.stringify(calculated)!==JSON.stringify(intended))throw new Error(`Status reconciliation mismatch: ${calculated} vs ${intended}`);
    if(rows.length!==expected)console.warn(`${group.project}/${group.round}: status difference ${rows.length-expected}`);
    checkRow++;
  }
  formatTable(sheet,6,outputRow-1,'F');
  sheet.getRange(`F7:F${outputRow-1}`).setNumberFormat('0.00%');
  sheet.getRange(`F7:F${outputRow-1}`).format.horizontalAlignment='right';
  sheet.getRange(`D6:D${outputRow-1}`).format.columnWidth=24;
  sheet.freezePanes.freezeRows(6);
  formatTable(checks,6,checkRow-1,'I');
  checks.freezePanes.freezeRows(6);
  const causes=sheetFor(workbook,'UnavailableCauses');
  causes.getUsedRange()?.clear({applyTo:'contents'});
  causes.showGridLines=false;
  causes.getRange('B2').values=[['NOT_AVAILABLE by cause']];
  causes.getRange('B2').format.font={name:'Arial',size:16,bold:true,color:'#18263b'};
  causes.getRange('B3:H3').merge();
  causes.getRange('B3').values=[['Exclusive causes: buggy/fixed execution or compile unavailable first; coverage-only failure when both sides ran.']];
  causes.getRange('B3:H3').format={wrapText:true,rowHeight:34,font:{name:'Arial',size:10,color:'#4c627b'}};
  causes.getRange('B6:H6').values=[['Project','Round','Cause','Count','Share of unavailable','NOT_AVAILABLE','Difference']];
  let causeRow=7;
  for(const group of groupsFor(data)) {
    const rows=group.rows.map(r=>byRow.get(r.index));
    const refs=references(group.rows.map(r=>r.index),'P').replaceAll("'Data'!","'BugResults'!").split(',').filter(Boolean);
    const start=causeRow;
    const na=locations.get(`${group.project}/${group.round}/NOT_AVAILABLE`);
    for(const cause of ['BUGGY_NOT_RUN','FIXED_NOT_RUN','BOTH_NOT_RUN','COVERAGE_UNAVAILABLE']) {
      causes.getRange(`B${causeRow}:D${causeRow}`).values=[[group.project,group.round,cause]];
      const expression=refs.map(ref=>`COUNTIF(${ref},"${cause}")`).join('+')||'0';
      causes.getRange(`E${causeRow}:G${causeRow}`).formulas=[[`=${expression}`,`=IF('Verdicts'!E${na}=0,"—",E${causeRow}/'Verdicts'!E${na})`,`='Verdicts'!E${na}`]];
      if(causes.getRange(`E${causeRow}`).values[0][0]!==rows.filter(r=>r.not_available_cause===cause).length)throw new Error('Unavailable cause count mismatch');
      causeRow++;
    }
    causes.getRange(`H${start}`).formulas=[[`=SUM(E${start}:E${causeRow-1})-G${start}`]];
    if(causes.getRange(`H${start}`).values[0][0]!==0)throw new Error('Unavailable causes do not reconcile');
  }
  formatTable(causes,6,causeRow-1,'H');
  causes.getRange(`D6:D${causeRow-1}`).format.columnWidth=30;
  causes.getRange(`G6:G${causeRow-1}`).format.columnWidth=26;
  causes.getRange(`F7:F${causeRow-1}`).setNumberFormat('0.00%');
  causes.getRange(`F7:F${causeRow-1}`).format.horizontalAlignment='right';
  causes.freezePanes.freezeRows(6);
  if (config.ga) {
    dashboard.getRange('J4:M4').values=[['Verdict','Round1','Round2','All rounds']];
    dashboard.getRange('J4:M4').format={fill:'#172b49',font:{name:'Arial',size:11,bold:true,color:'#ffffff'},wrapText:true,rowHeight:32};
    dashboard.getRange('J4:J9').format.columnWidth=25;
    dashboard.getRange('K4:M9').format.columnWidth=15;
    for (const [index,verdict] of verdicts.entries()) {
      dashboard.getRange(`J${index+5}`).values=[[verdict]];
      dashboard.getRange(`K${index+5}:M${index+5}`).formulas=[['Round1','Round2','All rounds'].map(round=>`='Verdicts'!E${locations.get(`All projects/${round}/${verdict}`)}`)];
    }
    dashboard.getRange('J11:M11').merge();
    dashboard.getRange('J11').values=[['One bug per round; latest generation and coverage failure take precedence. See BugResults for paired sources and partial flags.']];
    dashboard.getRange('J11:M11').format={wrapText:true,rowHeight:45,font:{name:'Arial',size:10,color:'#4c627b'}};
  } else if(method==='randoop') {
    for (const [column,round] of [['C','Round1'],['D','Round2'],['E','All rounds']]) {
      for (const [index,verdict] of verdicts.entries())dashboard.getRange(`${column}${index+22}`).formulas=[[`='Verdicts'!E${locations.get(`All projects/${round}/${verdict}`)}`]];
      dashboard.getRange(`${column}10`).formulas=[[`='Verdicts'!E${locations.get(`All projects/${round}/REVEALING`)}`]];
      dashboard.getRange(`${column}11`).formulas=[[`=${column}10/${column}6`]];
    }
  } else {
    // AI condition coverage is at row 8. Its four-status table starts at row
    // 19; replace the note at row 23 with FAIL and move the note below it.
    dashboard.getRange('B23:E23').unmerge();
    dashboard.getRange('B23').values=[['FAIL']];
    dashboard.getRange('B23:E23').format={font:{name:'Arial',size:11,color:'#18263b'},rowHeight:24};
    dashboard.getRange('G18:J23').clear({applyTo:'contents'});
    dashboard.getRange('G18:J23').format.fill='#ffffff';
    for(const [index,verdict] of verdicts.entries()) {
      const row=index+19;
      for(const [column,round] of [['C','Round1'],['D','Round2'],['E','All rounds']])dashboard.getRange(`${column}${row}`).formulas=[[`='Verdicts'!E${locations.get(`All projects/${round}/${verdict}`)}`]];
    }
    for(const [column,round] of [['C','Round1'],['D','Round2'],['E','All rounds']]) {
      dashboard.getRange(`${column}9`).formulas=[[`='Verdicts'!E${locations.get(`All projects/${round}/REVEALING`)}`]];
      dashboard.getRange(`${column}10`).formulas=[[`=IF(${column}6=0,"—",${column}9/${column}6)`]];
    }
    dashboard.getRange('B26:J26').merge();
    dashboard.getRange('B26').values=[['One bug per round. Data retains original values; BugResults contains final verdicts. UnavailableCauses separates execution and coverage failures.']];
    dashboard.getRange('B26:J26').format={wrapText:true,rowHeight:32,font:{name:'Arial',size:10,color:'#4c627b'}};
  }
}

async function build(config) {
  const workbook = await SpreadsheetFile.importXlsx(await FileBlob.load(config.path));
  const dashboard = workbook.worksheets.getItem('Dashboard');
  const source = workbook.worksheets.getItem('Data');
  const base = path.basename(path.dirname(config.path));
  if (config.resourceInventory?.length) {
    const inventory=sheetFor(workbook,'ResourceCheck');
    inventory.getUsedRange()?.clear({applyTo:'contents'});
    inventory.showGridLines=false;
    inventory.getRange('B2').values=[['Resoucre inventory checked before summary']];
    inventory.getRange('B3:J3').merge();
    inventory.getRange('B3').values=[['Only Resoucre targets are counted. Extra saved results are preserved but excluded. Each bug/round counts separately.']];
    inventory.getRange('B6:J6').values=[['Round','Resource targets','Saved results','Java test folders','Missing results','Extra results','Missing tests','Extra tests','Check']];
    inventory.getRange('B7').write(config.resourceInventory.map(c=>[c.round,c.referenceCount,c.resultCount,c.testCount,c.missingResults.join(', ')||'—',c.extraResults.join(', ')||'—',c.missingTests.join(', ')||'—',c.extraTests.join(', ')||'—',c.missingResults.length?'Missing results':'Complete reference results']));
    formatTable(inventory,6,6+config.resourceInventory.length,'J');
    inventory.getRange('F:J').format.columnWidth=40;
    inventory.getRange(`F7:J${6+config.resourceInventory.length}`).format.wrapText=true;
  }
  if (config.previewDir) {
    await fs.mkdir(config.previewDir, {recursive:true});
    const before = await workbook.render({sheetName:'Dashboard',range:config.ga?'A1:G12':'B2:E16',scale:1,format:'png'});
    await fs.writeFile(path.join(config.previewDir,`${base}-before.png`), new Uint8Array(await before.arrayBuffer()));
  }
  const data = config.data;
  source.getUsedRange().clear({applyTo:'contents'});
  source.getRange('A1').write(data);
  buildBugVerdicts(workbook,dashboard,config,data);
  if (config.ga) {
    // Keep the original GA summary current when the V2 CSV files change.
    const groups = groupsFor(data);
    const legacy = [groups.find(g=>g.project==='All projects'&&g.round==='Round1'),groups.find(g=>g.project==='All projects'&&g.round==='Round2'),
      ...groups.filter(g=>g.project!=='All projects'&&g.round!=='All rounds')];
    for (const [index, group] of legacy.entries()) {
      const row = index < 2 ? index + 5 : index + 8;
      const statuses = group.rows.map(r=>r.values[4]);
      dashboard.getRange(`A${row}:G${row}`).values = [[group.project==='All projects'?group.round:`${group.project} / ${group.round}`,
        group.rows.length, statuses.filter(s=>s==='OK').length,statuses.filter(s=>s==='TESTS_FAILED').length,statuses.filter(s=>s==='NOT_AVAILABLE').length,
        metricStats(group.rows,10,1).recorded,metricStats(group.rows,7,1).recorded]];
      dashboard.getRange(`H${row}`).values=[[statuses.filter(s=>s==='FAIL').length]];
    }
    dashboard.getRange('H4').values=[['Generation failed']];
    dashboard.getRange('H4').format={fill:'#246670',font:{name:'Arial',size:11,bold:true,color:'#ffffff'},wrapText:true,columnWidth:23};
    dashboard.getRange('B4').values=[['Saved results']];
    dashboard.getRange('E4').values=[['Coverage unavailable']];
    dashboard.getRange('E4').format.wrapText=true;
    dashboard.getRange('A2').values = [['Saved V2 attempts from Round1 and Round2; generation failures are FAIL, existing suites without measurements are NOT_AVAILABLE.']];
  }
  const coverage=sheetFor(workbook,'Coverage');
  coverage.getUsedRange()?.clear({applyTo:'contents'});
  coverage.getUsedRange()?.unmerge();
  coverage.showGridLines = false;
  coverage.getRange('B2').values = [['Coverage by project and round']];
  coverage.getRange('B2').format.font = {name:'Arial',size:16,bold:true,color:'#18263b'};
  coverage.getRange('B3:L3').merge();
  coverage.getRange('B3').values = [['A = failed measurement (0%). B = successful zero-total metric (N/A), excluded from both averages.']];
  coverage.getRange('B4:L4').merge();
  coverage.getRange('B4').values = [['Buggy coverage is retained when fixed or paired validation is unavailable. Latest FAIL excludes stale values. Runnable = (total − A) / total.']];
  coverage.getRange('B4:L4').format={wrapText:true,rowHeight:32,font:{name:'Arial',size:10,color:'#4c627b'}};
  const labels = [['Project','Round','Metric','Total','Numeric','A: failure','B: N/A','Unresolved','Recorded only','All applicable','Runnable','n all (total − B)']];
  coverage.getRange('B6:M6').values = labels;
  const headers = data[0];
  const metricFields = [
    ['Coverage','coverage','coverage'],['Line','line_coverage','line'],['Line','line_cov','line'],['Condition','condition_coverage','condition'],
  ].filter(([,field])=>headers.includes(field));
  const audit=sheetFor(workbook,'CoverageCases');
  audit.tables.items.forEach(table=>table.delete());
  audit.getUsedRange()?.clear({applyTo:'contents'});
  audit.showGridLines=false;
  audit.getRange('A1:Q1').values=[['Method','Project','Round','Target','Metric','Measurable total','Class','Raw coverage (%)','Coverage status','Compile','Test compile','Buggy result','Reason','Coverage source','Eligible coverage (%)','Latest verdict','Verdict source']];
  const classified=new Map();
  let auditRow=2;
  for(const [label,field,metric] of metricFields) {
    const matrix=[],rawFormulas=[],eligible=[];
    for(const record of config.records) {
      const m=record.metrics[metric],details=record.details;
      const totalFields=metric==='line'?['lines_total','lines']:metric==='condition'?['conditions_total','total_branches','branches']:['total_goals'];
      const totalKey=totalFields.find(key=>key in details);
      const total=totalKey&&details[totalKey]!=null&&details[totalKey]!==''?Number(details[totalKey]):null;
      matrix.push([record.method,record.project,record.round,record.target,label,total,m.kind,null,
        details.coverage_status??null,details.compile??null,details.test_compile??null,
        details.result??details.buggy_result??null,m.reason,record.result_json_present===false?record.source:record.result_source,null,record.verdict??null,record.verdictSource??null]);
      const ref=`'Data'!${columnName(headers.indexOf(field))}${record.dataRow}`;
      rawFormulas.push([`=IF(ISNUMBER(${ref}),${ref}${config.ga?'':'*100'},"")`]);
      eligible.push([`=IF(AND(G${auditRow}="RECORDED",ISNUMBER(H${auditRow})),H${auditRow},"")`]);
      classified.set(`${metric}/${record.dataRow}`,{index:auditRow,classification:m});
      auditRow++;
    }
    const start=auditRow-matrix.length;
    if(matrix.length){
      audit.getRange(`A${start}`).write(matrix);
      audit.getRange(`H${start}:H${auditRow-1}`).formulas=rawFormulas;
      audit.getRange(`O${start}:O${auditRow-1}`).formulas=eligible;
    }
  }
  audit.getRange(`A1:Q${auditRow-1}`).format.font={name:'Arial',size:10,color:'#18263b'};
  audit.getRange('A1:Q1').format={fill:'#172b49',font:{name:'Arial',size:10,bold:true,color:'#ffffff'},wrapText:true,rowHeight:42};
  audit.getRange(`A1:L${auditRow-1}`).format.columnWidth=17;
  audit.getRange(`M1:N${auditRow-1}`).format.columnWidth=64;
  audit.getRange(`O1:O${auditRow-1}`).format.columnWidth=22;
  audit.getRange(`P1:P${auditRow-1}`).format.columnWidth=24;
  audit.getRange(`Q1:Q${auditRow-1}`).format.columnWidth=64;
  audit.getRange(`H2:H${auditRow-1}`).setNumberFormat('0.00');
  audit.getRange(`O2:O${auditRow-1}`).setNumberFormat('0.00');
  audit.freezePanes.freezeRows(1);
  const coverageTable=audit.tables.add(`A1:Q${auditRow-1}`,true,'CoverageCasesTable');
  coverageTable.showFilterButton=true;
  coverageTable.style='TableStyleMedium2';
  let outputRow = 7;
  const overview=new Map();
  const locations=new Map();
  for (const group of groupsFor(data)) {
    for (const [label,field,metric] of metricFields) {
      const cases=group.rows.map(row=>classified.get(`${metric}/${row.index}`));
      const indices=cases.map(row=>row.index);
      const sums=aggregateFormula('SUM',indices,'O');
      coverage.getRange(`B${outputRow}:D${outputRow}`).values = [[group.project,group.round,label]];
      coverage.getRange(`E${outputRow}:L${outputRow}`).formulas = [[
        `=${aggregateFormula('COUNTA',indices,'D')}`,
        `=${aggregateFormula('COUNT',indices,'O')}`,
        `=${aggregateFormula('COUNTIF',indices,'G','A')}`,
        `=${aggregateFormula('COUNTIF',indices,'G','B')}`,
        `=${aggregateFormula('COUNTIF',indices,'G','UNRESOLVED')}`,
        `=IF(F${outputRow}=0,"—",(${sums})/F${outputRow}/100)`,
        `=IF(I${outputRow}>0,"Pending",IF(E${outputRow}-H${outputRow}=0,"—",(${sums})/(E${outputRow}-H${outputRow})/100))`,
        `=IF(I${outputRow}>0,"Pending",IF(E${outputRow}=0,"—",(E${outputRow}-G${outputRow})/E${outputRow}))`,
      ]];
      coverage.getRange(`M${outputRow}`).formulas=[[`=IF(I${outputRow}>0,"Pending",E${outputRow}-H${outputRow})`]];
      // Verify runtime calculation against a separate arithmetic implementation.
      const numeric=cases.filter(row=>row.classification.kind==='RECORDED').map(row=>row.classification.value);
      const sum=numeric.reduce((a,b)=>a+b,0)/100;
      const a=cases.filter(row=>row.classification.kind==='A').length,b=cases.filter(row=>row.classification.kind==='B').length,u=cases.filter(row=>row.classification.kind==='UNRESOLVED').length;
      const calculated = coverage.getRange(`E${outputRow}:L${outputRow}`).values[0];
      const expected=[cases.length,numeric.length,a,b,u,numeric.length?sum/numeric.length:'—',u?'Pending':cases.length-b?sum/(cases.length-b):'—',u?'Pending':cases.length?(cases.length-a)/cases.length:'—'];
      if(coverage.getRange(`M${outputRow}`).values[0][0]!==(u?'Pending':cases.length-b))throw new Error('All-results denominator mismatch');
      for (let i=0;i<expected.length;i++) {
        if (typeof expected[i]==='number' ? typeof calculated[i]!=='number'||Math.abs(calculated[i]-expected[i])>1e-9 : calculated[i]!==expected[i])
          throw new Error(`Coverage calculation mismatch at row ${outputRow}: ${calculated} vs ${expected}`);
      }
      if(group.project==='All projects')overview.set(`${group.round}/${metric}`,outputRow);
      locations.set(`${group.project}/${group.round}/${metric}`,outputRow);
      outputRow++;
    }
  }
  formatTable(coverage,6,outputRow-1,'M');
  coverage.getRange(`M6:M${outputRow-1}`).format.columnWidth=20;
  coverage.getRange(`M7:M${outputRow-1}`).setNumberFormat('#,##0');
  coverage.freezePanes.freezeRows(6);
  dashboard.getRange('B48:H48').unmerge();
  dashboard.getRange('B49:H49').unmerge();
  dashboard.getRange('B48:L48').merge();
  dashboard.getRange('B48').values = [['Coverage — failures counted as zero; N/A excluded']];
  dashboard.getRange('B48').format.font = {name:'Arial',size:14,bold:true,color:'#18263b'};
  dashboard.getRange('B49:L49').merge();
  dashboard.getRange('B49').values = [['Buggy coverage: sum / (total − N/A). Latest FAIL counts as zero; measured buggy coverage remains when paired verdict is NOT_AVAILABLE.']];
  dashboard.getRange('B49:L49').format={wrapText:true,rowHeight:32,font:{name:'Arial',size:10,color:'#4c627b'}};
  dashboard.getRange('B51:M51').values = labels;
  const summaryLength = 3 * metricFields.length;
  for (let i=0;i<summaryLength;i++) dashboard.getRange(`B${52+i}:M${52+i}`).formulas = [[...Array(12)].map((_,j)=>`='Coverage'!${columnName(j+1)}${7+i}`)];
  formatTable(dashboard,51,51+summaryLength,'M');
  dashboard.getRange(`M51:M${51+summaryLength}`).format.columnWidth=20;
  dashboard.getRange(`M52:M${51+summaryLength}`).setNumberFormat('#,##0');
  if(!config.ga) {
    for(const [column,round] of [['C','Round1'],['D','Round2'],['E','All rounds']]) {
      const legacy=metricFields.length===3?[[7,'coverage'],[8,'line'],[9,'condition']]:[[7,'line'],[8,'condition']];
      for(const [row,metric] of legacy)dashboard.getRange(`${column}${row}`).formulas=[[`='Coverage'!J${overview.get(`${round}/${metric}`)}`]];
    }
  } else {
    const groups=groupsFor(data);
    const legacy=[groups.find(g=>g.project==='All projects'&&g.round==='Round1'),groups.find(g=>g.project==='All projects'&&g.round==='Round2'),
      ...groups.filter(g=>g.project!=='All projects'&&g.round!=='All rounds')];
    for(const [index,group] of legacy.entries()) {
      const row=index<2?index+5:index+8;
      for(const [column,metric] of [['F','condition'],['G','line']]) {
        const ref=`'Coverage'!J${locations.get(`${group.project}/${group.round}/${metric}`)}`;
        dashboard.getRange(`${column}${row}`).formulas=[[`=IF(ISNUMBER(${ref}),${ref}*100,${ref})`]];
      }
    }
    dashboard.getRange('A7').values=[['Applicable measured metrics only; successful zero-total metrics are N/A.']];
  }
  if(config.intersection) {
    const intersection=sheetFor(workbook,'Intersection');
    intersection.getUsedRange()?.clear({applyTo:'contents'});
    intersection.showGridLines=false;
    intersection.getRange('B2').values=[['Coverage on bugs measured by all four methods']];
    intersection.getRange('B3:L3').unmerge();
    intersection.getRange('B3:L3').merge();
    intersection.getRange('B3').values=[['All rounds: average numeric rounds per method/bug first. Same-round intersections are reported separately.']];
    intersection.getRange('B4:L4').merge();
    intersection.getRange('B4').values=[['Mean denominator = shared bugs for each method. Results columns count numeric rounds contributing to per-bug means.']];
    intersection.getRange('B3:L4').format={wrapText:true,rowHeight:28,font:{name:'Arial',size:10,color:'#4c627b'}};
    const intersectionMethods=['ga','randoop','deepseek','gemini'];
    const resultLabels=['GA results','FRT results','DeepSeek results','Gemini results'];
    intersection.getRange('B6:L6').values=[['Scope','Metric','Shared bugs','GA (V2)','FRT/Randoop','DeepSeek','Gemini',...resultLabels]];
    intersection.getRange('B16:L16').values=[['Scope','Metric','Bug','GA (V2)','FRT/Randoop','DeepSeek','Gemini',...resultLabels]];
    let detailRow=17,summaryRow=7;
    for(const [scope,metrics] of Object.entries(config.intersection)) {
      for(const [metric,item] of Object.entries(metrics)) {
        const start=detailRow;
        if(item.entries.length) {
          intersection.getRange(`B${detailRow}`).write(item.entries.map(entry=>[scope,metric,entry.target,...intersectionMethods.map(method=>entry.values[method]/100),...intersectionMethods.map(method=>entry.rounds[method].length)]));
          detailRow+=item.entries.length;
        }
        intersection.getRange(`B${summaryRow}:D${summaryRow}`).values=[[scope,metric,item.bugs]];
        intersection.getRange(`E${summaryRow}:H${summaryRow}`).formulas=[['E','F','G','H'].map(column=>item.bugs?`=AVERAGE(${column}${start}:${column}${detailRow-1})`:'="—"')];
        intersection.getRange(`I${summaryRow}:L${summaryRow}`).formulas=[['I','J','K','L'].map(column=>item.bugs?`=SUM(${column}${start}:${column}${detailRow-1})`:'=0')];
        for(const [index,method] of intersectionMethods.entries())if(intersection.getRange(`${columnName(index+8)}${summaryRow}`).values[0][0]!==item.recordedResults[method])throw new Error('Intersection contributing results mismatch');
        summaryRow++;
      }
    }
    formatTable(intersection,6,summaryRow-1,'L');
    formatTable(intersection,16,Math.max(detailRow-1,17),'L');
    intersection.getRange(`E7:H${detailRow-1}`).setNumberFormat('0.00%');
    intersection.getRange(`I7:L${detailRow-1}`).setNumberFormat('#,##0');
    intersection.getRange('E16:H16').setNumberFormat('General');
    intersection.freezePanes.freezeRows(16);
  }
  buildIntegratedReports(workbook,config,overview,auditRow-1,sheetFor,formatTable);
  if (config.previewDir) {
    if (config.summaryStats) {
      for (const [sheetName,range,suffix] of [['ReportNotes','B2:H27','report-notes'],['StatusChanges','B2:G9','status-changes']]) {
        const preview = await workbook.render({sheetName,range,scale:1,format:'png'});
        await fs.writeFile(path.join(config.previewDir,`${base}-${suffix}.png`),new Uint8Array(await preview.arrayBuffer()));
      }
    }
    for (const [sheetName,range,suffix] of [['Dashboard',`B48:M${51+summaryLength}`,'dashboard'],...['gemini','deepseek'].includes(config.records[0]?.method)?[['Dashboard','B18:J26','verdict-dashboard']]:[],...['ga','randoop','gemini','deepseek'].includes(config.records[0]?.method)?[['Verdicts','B2:I21','verdict-details'],['BugResults','A1:F6','bug-results'],['StatusChecks','B2:I10','status-checks'],['UnavailableCauses','B2:H18','unavailable-causes']]:[],['Coverage','B2:M18','projects'],['CoverageCases','A1:M5','cases'],['CoverageCases','M1:Q5','cases-verdict'],...config.intersection?[['Intersection','B2:L12','intersection']]:[],['Data',config.ga?'A1:L5':'A1:N5','data']]) {
      const preview = await workbook.render({sheetName,range,scale:1,format:'png'});
      await fs.writeFile(path.join(config.previewDir,`${base}-${suffix}.png`),new Uint8Array(await preview.arrayBuffer()));
    }
  }
  const errors = await workbook.inspect({kind:'match',searchTerm:'#REF!|#DIV/0!|#VALUE!|#NAME\\?|#NUM!|#NULL!',options:{useRegex:true,maxResults:10},maxChars:1500});
  console.log(`${base}: ${outputRow-7} paired coverage rows; ${errors.ndjson}`);
  const output = await SpreadsheetFile.exportXlsx(workbook);
  const staged = `${config.path}.paired.tmp.xlsx`;
  await output.save(staged);
}

if (process.argv[2]) await build(JSON.parse(await fs.readFile(process.argv[2],'utf8')));
