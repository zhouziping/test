	
FROM java:8
#作者
MAINTAINER zhouziping

VOLUME /tmp

ADD /target/demo-0.0.1-SNAPSHOT.jar demo.jar

ENTRYPOINT ["java","-jar","/demo.jar"]
