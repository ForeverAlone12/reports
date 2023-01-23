WORKDIR /app
COPY . /app

RUN mvn clean install -T 4 -DskipTests

FROM openjdk:17.0.0 as app
WORKDIR /app
COPY --from=maven /app/target/reports*.war /app/app.war