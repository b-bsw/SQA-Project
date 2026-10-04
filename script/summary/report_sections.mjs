export function buildIntegratedReports(workbook, config, overview, coverageLast, sheetFor, formatTable) {
  if (!config.summaryStats) return;
  const notes=sheetFor(workbook,'ReportNotes');
  notes.getUsedRange()?.unmerge();
  notes.getUsedRange()?.clear({applyTo:'contents'});
  notes.showGridLines=false;
  notes.getRange('B2').values=[['Coverage and verdict definitions']];
  notes.getRange('B2').format.font={name:'Arial',size:16,bold:true,color:'#18263b'};
  const rules=[
    `One bug per round. Resource: ${config.resourceInventory[0].referenceCount} bugs; this workbook pools ${config.records.length} results.`,
    'Recorded only: sum of applicable numeric coverage / numeric count, including 0%.',
    'All applicable: same sum / (total minus successful zero-total N/A). Failed measurements count as 0%.',
    'Coverage uses buggy measurements. Verdicts require both buggy/fixed runs; measured buggy coverage remains when fixed is unavailable.',
    'FAIL: no usable tests or latest whole-bug generation failed. Partial class failures with usable tests follow execution evidence.',
    'Combined intersection averages numeric rounds per method/bug first. Round2 has no four-method intersection because Gemini has no Round2.',
  ];
  for(const [index,text] of rules.entries()) {
    const row=index+4;
    notes.getRange(`B${row}:H${row}`).merge();
    notes.getRange(`B${row}`).values=[[text]];
    notes.getRange(`B${row}:H${row}`).format={wrapText:true,rowHeight:34,font:{name:'Arial',size:11,color:'#4c627b'}};
  }
  notes.getRange('B12:H12').values=[['Metric','Coverage sum (percentage points)','n numeric','n applicable','Recorded only','All applicable','Runnable']];
  notes.getRange('B19:F19').values=[['Metric','Previous recorded','Current recorded','Previous all results','Current applicable']];
  let row=13,oldRow=20;
  for(const [metric,stats] of Object.entries(config.summaryStats)) {
    const label=metric==='line'?'Line':'Condition';
    const ref=overview.get(`All rounds/${metric}`);
    notes.getRange(`B${row}`).values=[[label]];
    notes.getRange(`C${row}:H${row}`).formulas=[[
      `=SUMIF('CoverageCases'!$E$2:$E${coverageLast},B${row},'CoverageCases'!$O$2:$O${coverageLast})`,
      `='Coverage'!F${ref}`,`='Coverage'!M${ref}`,
      `=IF(D${row}=0,"—",C${row}/D${row}/100)`,
      `=IF(ISNUMBER(E${row}),IF(E${row}=0,"—",C${row}/E${row}/100),"Pending")`,
      `='Coverage'!L${ref}`,
    ]];
    const calculated=notes.getRange(`C${row}:G${row}`).values[0];
    const expected=[stats.coverageSum,stats.recorded,stats.applicable??'Pending',stats.recordedOnly===null?'—':stats.recordedOnly/100,stats.allResults===null?(stats.unresolved?'Pending':'—'):stats.allResults/100];
    for(let i=0;i<expected.length;i++)if(typeof expected[i]==='number'?typeof calculated[i]!=='number'||Math.abs(calculated[i]-expected[i])>1e-9:calculated[i]!==expected[i])throw new Error('Integrated worked calculation mismatch');
    notes.getRange(`B${oldRow}:F${oldRow}`).values=[[label,stats.oldRecordedOnly===null?'—':stats.oldRecordedOnly/100,null,stats.oldAllResults===null?'—':stats.oldAllResults/100,null]];
    notes.getRange(`D${oldRow}`).formulas=[[`='Coverage'!J${ref}`]];
    notes.getRange(`F${oldRow}`).formulas=[[`='Coverage'!K${ref}`]];
    row++;oldRow++;
  }
  formatTable(notes,12,row-1,'H');
  formatTable(notes,19,oldRow-1,'F');
  notes.getRange(`C13:C${row-1}`).setNumberFormat('#,##0.00');
  notes.getRange(`D13:E${row-1}`).setNumberFormat('#,##0');
  notes.getRange(`F13:H${row-1}`).setNumberFormat('0.00%');
  notes.getRange(`C20:F${oldRow-1}`).setNumberFormat('0.00%');
  notes.getRange('B17:H17').merge();
  notes.getRange('B17').values=[['Previous coverage rules counted missing values as 0% without excluding N/A. These are rule comparisons, not a reconstruction of the old slide cohort.']];
  notes.getRange('B17:H17').format={wrapText:true,rowHeight:34,font:{name:'Arial',size:10,color:'#4c627b'}};
  const method=config.records[0].method;
  const slides={ga:{FAIL:0.02,NOT_AVAILABLE:0.041},randoop:{FAIL:0.0205,NOT_AVAILABLE:0.0218},gemini:{NOT_AVAILABLE:0.4274},deepseek:{NOT_AVAILABLE:0.7488}};
  const scope=['gemini','deepseek'].includes(method)?'Round1':'All rounds';
  const end=config.records.length+1;
  notes.getRange('B25:H25').values=[['Verdict','Scope','Slide (%)','Current count','n results','Current (%)','Change (pp)']];
  let slideRow=26;
  for(const [verdict,old] of Object.entries(slides[method])) {
    notes.getRange(`B${slideRow}:D${slideRow}`).values=[[verdict,scope,old]];
    const count=scope==='All rounds'?`COUNTIF('BugResults'!$D$2:$D${end},B${slideRow})`:`COUNTIFS('BugResults'!$D$2:$D${end},B${slideRow},'BugResults'!$C$2:$C${end},C${slideRow})`;
    const n=scope==='All rounds'?`COUNTA('BugResults'!$A$2:$A${end})`:`COUNTIF('BugResults'!$C$2:$C${end},C${slideRow})`;
    notes.getRange(`E${slideRow}:H${slideRow}`).formulas=[[`=${count}`,`=${n}`,`=E${slideRow}/F${slideRow}`,`=(G${slideRow}-D${slideRow})*100`]];
    slideRow++;
  }
  formatTable(notes,25,slideRow-1,'H');
  notes.getRange('B25:B27').format.columnWidth=27;
  notes.getRange('C12:H27').format.columnWidth=22;
  notes.getRange('B12:H12').format.rowHeight=56;
  notes.getRange('B19:F19').format.rowHeight=42;
  notes.getRange(`D26:D${slideRow-1}`).setNumberFormat('0.00%');
  notes.getRange(`E26:F${slideRow-1}`).setNumberFormat('#,##0');
  notes.getRange(`G26:G${slideRow-1}`).setNumberFormat('0.00%');
  notes.getRange(`H26:H${slideRow-1}`).setNumberFormat('0.00');

  const changes=sheetFor(workbook,'StatusChanges');
  changes.tables.items.forEach(table=>table.delete());
  changes.getUsedRange()?.clear({applyTo:'contents'});
  changes.showGridLines=false;
  const selected=config.records.filter(r=>r.previousVerdict!==r.verdict);
  changes.getRange('B2').values=[['Saved versus derived verdict changes']];
  changes.getRange('B3:J3').merge();
  changes.getRange('B3').values=[[`${selected.length} changed bug/rounds. Generation failures, stale suites and missing class evidence are filterable in BugResults.`]];
  changes.getRange('B3:J3').format={wrapText:true,rowHeight:32,font:{name:'Arial',size:10,color:'#4c627b'}};
  changes.getRange('B6:J6').values=[['Project','Bug','Round','Saved verdict','Current verdict','Reason','Generation source','Validation source','Coverage source']];
  if(selected.length)changes.getRange('B7').write(selected.map(r=>[r.project,r.bug_id,r.round,r.previousVerdict,r.verdict,r.verdictReason,r.generationSource,r.verdictSource,r.result_source]));
  const last=Math.max(7,selected.length+6);
  formatTable(changes,6,last,'J');
  changes.getRange(`E6:F${last}`).format.columnWidth=24;
  changes.getRange(`G6:J${last}`).format.columnWidth=70;
  changes.getRange(`G7:J${last}`).format={wrapText:true,rowHeight:80};
  const table=changes.tables.add(`B6:J${last}`,true,'StatusChangesTable');
  table.style='TableStyleMedium2';
  table.showFilterButton=true;
  changes.freezePanes.freezeRows(6);
}
