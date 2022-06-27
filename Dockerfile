FROM openjdk:11

#COPY my-break-booking.crt  /etc/ssl/certs/

#CMD keytool -importcert -file /etc/ssl/certs/my-break-booking.crt -cacerts -alias "my-booking-certificate" -storepass changeit

ADD target/roombooking-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080

ENV TZ Australia/Sydney
