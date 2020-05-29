${ROBOT_BIN} -o v1_pers.xml -l None -r None --nostatusrc -v env:dev -v version:v1 -i regressionANDpersonalizationANDV1 -e not-ready acceptance-test/
${ROBOT_BIN} -o v2_pers.xml -l None -r None --nostatusrc -v env:dev -v version:v2 -i regressionANDpersonalizationANDV2 -e not-ready acceptance-test/
${ROBOT_BIN} -o v2.2_pers.xml -l None -r None --nostatusrc -v env:dev -v version:v2.2 -i regressionANDpersonalizationANDV2.2 -e not-ready acceptance-test/
${ROBOT_BIN} -o v3_pers.xml -l None -r None --nostatusrc -v env:dev -v version:v3 -i regressionANDpersonalizationANDV3 -e not-ready acceptance-test/
${ROBOT_BIN} -o v3_ccr.xml -l None -r None --nostatusrc -v env:dev -v version:v3 -i regressionANDccr -e not-ready acceptance-test/
${ROBOT_BIN} -o v3_portrait.xml -l None -r None --nostatusrc -v env:dev -v version:v3 -i regressionANDportrait -e not-ready acceptance-test/
${ROBOT_BIN} -o v2.2_agg.xml -l None -r None --nostatusrc -v env:dev -v version:v2.2 -i regressionANDaggregate -e not-ready acceptance-test/
${ROBOT_BIN}.rebot -o output.xml -l log.html -r report.html *.xml
