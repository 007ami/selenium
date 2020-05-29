${ROBOT_BIN} -o skip.xml -l None -r None --nostatusrc -v env:dev -i skip -e not-ready acceptance-test/
${ROBOT_BIN}.rebot --nostatusrc -o output.xml -l log.html -r report.html *.xml