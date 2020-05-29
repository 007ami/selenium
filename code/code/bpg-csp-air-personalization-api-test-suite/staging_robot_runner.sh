${ROBOT_BIN} -o v1_pers.xml -l None -r None --nostatusrc -v env:staging -v version:v1 -i personalization_scoreANDsanity -e not-ready sanity-test/
${ROBOT_BIN} -o v_pers.xml -l None -r None --nostatusrc -v env:staging -v version: -i personalization_scoreANDsanity -e not-ready sanity-test/
${ROBOT_BIN} -o v2_pers.xml -l None -r None --nostatusrc -v env:staging -v version:v2 -i personalization_scoreANDsanity -e not-ready sanity-test/
${ROBOT_BIN} -o v2.2_pers.xml -l None -r None --nostatusrc -v env:staging -v version:v2.2 -i personalization_scoreANDsanity -e not-ready sanity-test/
${ROBOT_BIN} -o v3_sanity.xml -l None -r None --nostatusrc -v env:staging -v version:v3 -i sanity -e not-ready sanity-test/
${ROBOT_BIN}.rebot --nostatusrc -o output.xml -l log.html -r report.html *.xml