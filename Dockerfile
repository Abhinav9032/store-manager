FROM java:8
COPY /target/store-manager-0.0.1-SNAPSHOT.jar Manager.jar
ENTRYPOINT ["java","-jar","Manager.jar"]