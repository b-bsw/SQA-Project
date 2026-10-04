// Local browser verification. Start: python -m http.server 8765 --bind 127.0.0.1
const assert = require('node:assert/strict');
const path = require('node:path');
const fs = require('node:fs/promises');
const modules = process.env.ARTIFACT_TOOL_MODULES || path.join(process.env.USERPROFILE || process.env.HOME,'.cache/codex-runtimes/codex-primary-runtime/dependencies/node/node_modules');
const {chromium} = require(path.join(modules,'playwright'));

(async()=>{
  const browser = await chromium.launch({headless:true,...(process.platform==='win32'?{channel:'msedge'}:{})});
  try {
    const page = await browser.newPage({viewport:{width:1280,height:1000}});
    const errors=[];
    page.on('pageerror',error=>errors.push(error.message));
    await page.goto(process.env.SQA_REPORT_URL || 'http://127.0.0.1:8765');
    let selections=0;
    for(const method of ['all','gemini','deepseek','randoop','ga']) {
      for(const round of ['all','Round 1','Round 2']) {
        await page.selectOption('#method-filter',method);
        await page.selectOption('#round-filter',round);
        const state=await page.evaluate(()=>{
          const entries=selectedEntries();
          const total=combine(entries.map(e=>e.summary));
          return {actual:[el('kpi-coverage').textContent,el('kpi-coverage-all').textContent,el('kpi-branch').textContent,el('kpi-branch-all').textContent],
            expected:[total.lineCoverage,total.lineCoverageAllResults,total.branchCoverage,total.branchCoverageAllResults].map(percent),
            rows:[...el('method-table').rows].map(row=>row.cells.length),count:entries.length,
            projects:[...el('project-table').rows].map(row=>row.cells.length)};
        });
        assert.deepEqual(state.actual,state.expected,`${method}/${round}`);
        assert.ok(state.rows.every(count=>count===(state.count?10:1)));
        assert.ok(state.projects.every(count=>count===10));
        const averages=await page.evaluate(()=>({
          actual:[...el('method-table').rows].filter(row=>row.cells.length===10).map(row=>[...row.cells].slice(4,8).map(cell=>cell.textContent)),
          expected:selectedEntries().map(({summary:s})=>[
            [s.lineCoverage,s.coverageRecords],[s.lineCoverageAllResults,s.results-s.metrics.line.notApplicable],
            [s.branchCoverage,s.branchCoverageRecords],[s.branchCoverageAllResults,s.results-s.metrics.condition.notApplicable]
          ].map(([value,n])=>value==null?'—':`${percent(value)} (n=${integer(n)})`))
        }));
        assert.deepEqual(averages.actual,averages.expected,'Average denominators differ');
        const classification=await page.evaluate(()=>[...el('coverage-classification').rows].map(row=>[...row.cells].map(cell=>cell.textContent)));
        assert.equal(classification.length,state.count*2);
        for(const row of classification){
          assert.equal(row.length,11);
          const counts=row.slice(2,7).map(value=>Number(value.replaceAll(',','')));
          assert.equal(counts[0],counts.slice(1).reduce((a,b)=>a+b,0),'Classification counts do not reconcile');
          assert.equal(Number(row[10].replaceAll(',','')),counts[0]-counts[3],'Applicable denominator differs');
        }
        const shared=await page.evaluate(()=>[...el('intersection-table').rows].map(row=>[...row.cells].map(cell=>cell.textContent)));
        assert.equal(shared.length,2);
        if(round==='Round 2')for(const row of shared){assert.equal(row[1],'0');assert.ok(row.slice(2).every(value=>value==='—'));}
        selections++;
      }
    }
    await page.selectOption('#method-filter','all');
    await page.selectOption('#round-filter','all');
    await page.fill('#project-search','Math');
    assert.equal(await page.locator('#project-table tr').count(),1);
    assert.equal(await page.locator('#project-table tr td').first().textContent(),'Math');
    await page.fill('#project-search','');
    const preview=process.env.SQA_REPORT_PREVIEW;
    if(preview){await fs.mkdir(preview,{recursive:true});await page.screenshot({path:path.join(preview,'report-desktop.png'),fullPage:true});}
    await page.setViewportSize({width:390,height:844});
    assert.ok(await page.evaluate(()=>document.documentElement.scrollWidth<=innerWidth),'Mobile page overflows viewport');
    if(preview)await page.screenshot({path:path.join(preview,'report-mobile.png'),fullPage:true});
    assert.deepEqual(errors,[]);
    console.log(`Verified ${selections} method/round selections, project search, four KPI averages and mobile layout.`);
  } finally {await browser.close();}
})().catch(error=>{console.error(error);process.exitCode=1;});
