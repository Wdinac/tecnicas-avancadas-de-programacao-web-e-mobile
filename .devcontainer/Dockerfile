FROM ubuntu:24.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y \
    chromium-browser \
    curl \
    git \
    git-lfs \
    openjdk-21-jdk \
    maven \
    mysql-server \
    unzip \
    && rm -rf /var/lib/apt/lists/*

RUN echo "CREATE USER 'welliton'@'localhost' IDENTIFIED BY 'a1s2d3f4'; \
        GRANT ALL PRIVILEGES ON *.* TO 'welliton'@'localhost' WITH GRANT OPTION; \
        FLUSH PRIVILEGES;" > /tmp/script.sql

RUN service mysql start && \
    sleep 5 && \
    mysql -uroot < /tmp/script.sql && \
    service mysql stop

ENV FLUTTER_VERSION=3.35.0

RUN git clone https://github.com/flutter/flutter.git /opt/flutter \
    && cd /opt/flutter \
    && git checkout $FLUTTER_VERSION

ENV PATH="/opt/flutter/bin:/opt/flutter/bin/cache/dart-sdk/bin:${PATH}"

RUN flutter doctor

WORKDIR /workspace/tecnicas-avancadas-de-programacao-web-e-mobile

CMD [ "bash" ]