import fs from 'node:fs/promises';
import path from 'node:path';
import { FileBlob, SpreadsheetFile } from '@oai/artifact-tool';

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

function formatTable(sheet, header, last) {
  sheet.getRange(`B${header}:H${last}`).format.font = {name:'Arial',size:11,color:'#18263b'};
  sheet.getRange(`B${header}:H${header}`).format = {fill:'#172b49',font:{name:'Arial',size:11,bold:true,color:'#ffffff'},wrapText:true,rowHeight:42};
  sheet.getRange(`B${header+1}:H${last}`).format.rowHeight = 23;
  sheet.getRange(`E${header+1}:F${last}`).setNumberFormat('#,##0');
  sheet.getRange(`G${header+1}:H${last}`).setNumberFormat('0.00%');
  sheet.getRange(`B${header}:B${last}`).format.columnWidth = 29;
  sheet.getRange(`C${header}:D${last}`).format.columnWidth = 18;
  sheet.getRange(`E${header}:F${last}`).format.columnWidth = 15;
  sheet.getRange(`G${header}:H${last}`).format.columnWidth = 23;
}

async function build(config) {
  const workbook = await SpreadsheetFile.importXlsx(await FileBlob.load(config.path));
  const dashboard = workbook.worksheets.getItem('Dashboard');
  const source = workbook.worksheets.getItem('Data');
  const base = path.basename(path.dirname(config.path));
  if (config.previewDir) {
    await fs.mkdir(config.previewDir, {recursive:true});
    const before = await workbook.render({sheetName:'Dashboard',range:config.ga?'A1:G12':'B2:E16',scale:1,format:'png'});
    await fs.writeFile(path.join(config.previewDir,`${base}-before.png`), new Uint8Array(await before.arrayBuffer()));
  }
  const data = config.data;
  if (config.ga) {
    source.getUsedRange().clear({applyTo:'contents'});
    source.getRange('A1').write(data);
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
    }
    dashboard.getRange('A2').values = [['Saved V2 results from Round1 and Round2']];
  }
  let coverage;
  try { coverage = workbook.worksheets.getItem('Coverage'); }
  catch { coverage = workbook.worksheets.add('Coverage'); }
  coverage.getUsedRange()?.clear({applyTo:'contents'});
  coverage.showGridLines = false;
  coverage.getRange('B2').values = [['Coverage by project and round']];
  coverage.getRange('B2').format.font = {name:'Arial',size:16,bold:true,color:'#18263b'};
  coverage.getRange('B3:H3').merge();
  coverage.getRange('B3').values = [['Recorded: numeric values only. All results: missing coverage counts as 0%.']];
  coverage.getRange('B4:H4').merge();
  coverage.getRange('B4').values = [['Each saved result is one case. A target in two rounds counts twice. Raw blanks remain blank.']];
  const labels = [['Project','Round','Metric','Results','Recorded values','Recorded only','All results (missing = 0%)']];
  coverage.getRange('B6:H6').values = labels;
  const headers = data[0];
  const metricFields = [
    ['Coverage','coverage'],['Line','line_coverage'],['Line','line_cov'],['Condition','condition_coverage'],
  ].filter(([,field])=>headers.includes(field));
  const scale = config.ga ? 100 : 1;
  const targetColumn = columnName(headers.indexOf('target'));
  let outputRow = 7;
  for (const group of groupsFor(data)) {
    for (const [label,field] of metricFields) {
      const column = headers.indexOf(field);
      const indices = group.rows.map(row=>row.index);
      const refs = references(indices,columnName(column));
      const targets = references(indices,targetColumn);
      const stats = metricStats(group.rows,column,scale);
      coverage.getRange(`B${outputRow}:D${outputRow}`).values = [[group.project,group.round,label]];
      coverage.getRange(`E${outputRow}:H${outputRow}`).formulas = [[
        indices.length ? `=COUNTA(${targets})` : '=0',
        indices.length ? `=COUNT(${refs})` : '=0',
        indices.length ? `=IF(F${outputRow}=0,"—",SUM(${refs})/F${outputRow}/${scale})` : '="—"',
        indices.length ? `=IF(E${outputRow}=0,"—",SUM(${refs})/E${outputRow}/${scale})` : '="—"',
      ]];
      // Verify runtime calculation against a separate arithmetic implementation.
      const calculated = coverage.getRange(`E${outputRow}:H${outputRow}`).values[0];
      const expected = [group.rows.length,stats.count,stats.recorded??'—',stats.all??'—'];
      for (let i=0;i<4;i++) {
        if (typeof expected[i]==='number' ? Math.abs(calculated[i]-expected[i])>1e-9 : calculated[i]!==expected[i])
          throw new Error(`Coverage calculation mismatch at row ${outputRow}: ${calculated} vs ${expected}`);
      }
      outputRow++;
    }
  }
  formatTable(coverage,6,outputRow-1);
  coverage.freezePanes.freezeRows(6);
  dashboard.getRange('B48:H48').merge();
  dashboard.getRange('B48').values = [['Coverage — recorded values and all saved results']];
  dashboard.getRange('B48').format.font = {name:'Arial',size:14,bold:true,color:'#18263b'};
  dashboard.getRange('B49:H49').merge();
  dashboard.getRange('B49').values = [['Recorded only excludes blanks. All results counts blanks as 0%. See Coverage for every project.']];
  dashboard.getRange('B51:H51').values = labels;
  const summaryLength = 3 * metricFields.length;
  for (let i=0;i<summaryLength;i++) dashboard.getRange(`B${52+i}:H${52+i}`).formulas = [[...Array(7)].map((_,j)=>`='Coverage'!${columnName(j+1)}${7+i}`)];
  formatTable(dashboard,51,51+summaryLength);
  if (config.previewDir) {
    for (const [sheetName,range,suffix] of [['Dashboard',`B48:H${51+summaryLength}`,'dashboard'],['Coverage','B2:H18','projects'],['Data',config.ga?'A1:L5':'A1:N5','data']]) {
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
