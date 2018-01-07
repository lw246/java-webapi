# java-webapi 
Base project for a restful web api built in Java using the Spring Boot framework and MySQL


Requires the below information adding in an application.properties file in path /src/main/resoures 

spring.datasource.url=jdbc:mysql://localhost:3306/testdb?useSSL=false \
spring.datasource.username=xxxxx \
spring.datasource.password=xxxxxx \
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
spring.jpa.database-platform=org.hibernate``.dialect.MySQL5Dialect \
spring.jpa.hibernate.ddl-auto=update 
