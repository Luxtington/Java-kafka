# Java-kafka
Trying Kafka using Spring Boot. AppProducer send message about computer by selected id in POST request. AppConsumer just read string in json format and print it in logs

Instructions:
1) Go to C:\kafka_2.13-3.9.0
2) In cmd: bin\windows\zookeeper-server-start.bat config\zookeeper.properties
3) In cmd: bin\windows\kafka-server-start.bat config\server.properties
4) Run appProducer
5) Run appConsumer
6) In postman: http://localhost:8080/kafka/send/1 (id from DAO)
