${ROBOT_BIN} -o v1_pers.xml -l None -r None --nostatusrc -v env:test -v version:v1 -i personalization_scoreANDV1 -e not-ready acceptance-test/
${ROBOT_BIN} -o v_pers.xml -l None -r None --nostatusrc -v env:test -v version: -i personalization_scoreANDV1 -e not-ready acceptance-test/
${ROBOT_BIN} -o v2_pers.xml -l None -r None --nostatusrc -v env:test -v version:v2 -i personalization_scoreANDV2 -e not-ready acceptance-test/
${ROBOT_BIN} -o v2.2_pers.xml -l None -r None --nostatusrc -v env:test -v version:v2.2 -i personalization_scoreANDV2.2 -e not-ready acceptance-test/
${ROBOT_BIN} -o v3_pers.xml -l None -r None --nostatusrc -v env:test -v version:v3 -i personalization_scoreANDV3 -e not-ready acceptance-test/
${ROBOT_BIN} -o v3_regression.xml -l None -r None --nostatusrc -v env:test -v version:v3 -i regression -e not-readyORpersonalization_score acceptance-test/
${ROBOT_BIN}.rebot --nostatusrc -o output.xml -l log.html -r report.html *.xml