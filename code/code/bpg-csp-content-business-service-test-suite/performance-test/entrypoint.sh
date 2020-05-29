#!/bin/ash
# This script expects the standard JMeter command parameters.
#
set -e
freeMem=`awk '/MemFree/ { print int($2/1024) }' /proc/meminfo`
s=$(($freeMem/10*8))
x=$(($freeMem/10*8))
n=$(($freeMem/10*2))
export JVM_ARGS="-Xms${s}m -Xmx${x}m"

echo "START Running Jmeter on `date`"
echo "JVM_ARGS=${JVM_ARGS}"
echo "jmeter args=${ARGS}"

jmeter ${ARGS}
echo "END Running Jmeter on `date`"

echo "Collecting Results"
jmeter ${DASHBOARD_ARGS}

tar -cf dashboard.tar /opt/scripts/dashboard

tar -cvzf perf-logs.tar.gz /opt/scripts/${OUTDIR}

echo "Uploading file to S3 ${BUCKETNAME} ${FILENAME}"
python /opt/scripts/outputpush.py ${BUCKETNAME} /opt/scripts/${OUTDIR}/${FILENAME} content-business-svc-perf/${FILENAME}

python /opt/scripts/outputpush.py ${BUCKETNAME} dashboard.tar content-business-svc-perf/dashboard.tar

python /opt/scripts/outputpush.py ${BUCKETNAME} perf-logs.tar.gz content-business-svc-perf/perf-logs.tar.gz

echo "END of File Upload"