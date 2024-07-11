FROM gradle:jdk11 as builder

WORKDIR /app

COPY build.gradle .
COPY settings.gradle .
COPY src src
COPY docker-entrypoint.sh .

RUN gradle dependencies

COPY . .

RUN gradle build -x test --info

FROM scratch as runner

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar /app/app.jar

ENTRYPOINT ["/docker-entrypoint.sh"]