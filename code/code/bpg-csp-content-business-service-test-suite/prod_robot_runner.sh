${ROBOT_BIN} -o v2.2_sanity.xml -l None -r None --nostatusrc -v env:prod -v version:v2.2 -i sanity -e not-ready sanity-test/
${ROBOT_BIN} -o v2_sanity.xml -l None -r None --nostatusrc -v env:prod -v version:v2 -i sanityANDpersonalization -e not-ready sanity-test/
${ROBOT_BIN} -o v1_sanity.xml -l None -r None --nostatusrc -v env:prod -v version:v1 -i sanityANDpersonalization -e not-ready sanity-test/
${ROBOT_BIN}.rebot --nostatusrc -o output.xml -l log.html -r report.html *.xml
