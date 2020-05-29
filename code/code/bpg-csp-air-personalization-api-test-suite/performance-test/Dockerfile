FROM openjdk:8-jre-alpine

ARG JMETER_VERSION="4.0"
ENV JMETER_HOME /opt/apache-jmeter-${JMETER_VERSION}
ENV JMETER_BIN      ${JMETER_HOME}/bin
ARG JMETER_DOWNLOAD_URL="https://archive.apache.org/dist/jmeter/binaries/apache-jmeter-${JMETER_VERSION}.tgz"
ARG JMETER_PLUGIN_URL="https://jmeter-plugins.org/files/packages/bzm-random-csv-0.6.zip"

RUN echo ${JMETER_VERSION}

RUN apk update \
        && apk upgrade \
        && apk add python \
        && apk add py-pip \
        && apk add tar \
        && apk add --no-cache curl \
        && mkdir -p /tmp/dependencies  \
        && wget ${JMETER_DOWNLOAD_URL} -P  /tmp/dependencies/  \
        && wget ${JMETER_PLUGIN_URL} -P  /tmp/dependencies/  \
        && mkdir -p /opt  \
        && mkdir -p /opt/scripts/ \
        && tar -xzf /tmp/dependencies/apache-jmeter-${JMETER_VERSION}.tgz -C /opt  \
        && unzip /tmp/dependencies/bzm-random-csv-0.6.zip -d ${JMETER_HOME}  \
        && rm -rf /tmp/dependencies

RUN pip install boto3

ENV PATH $PATH:$JMETER_BIN

COPY entrypoint.sh /

RUN chmod 755 /entrypoint.sh

WORKDIR ${JMETER_HOME}
COPY ./ /opt/scripts/
COPY outputpush.py /opt/scripts/

RUN ls ${JMETER_HOME}/

ENTRYPOINT ["/entrypoint.sh"]