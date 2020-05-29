${ROBOT_BIN} --nostatusrc -v env:test -v lambda_version:LATEST -i regression -e not-ready acceptance-test/
${ROBOT_BIN}.rebot --nostatusrc -o output.xml -l log.html -r report.html *.xml