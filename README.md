Mission 8 - Actuator								
Recommended Duration								
0.5 day(s)								
								
Prerequisites								
1. Completed Mission 7								
2. Basic understanding of Spring Boot Actuator								
								
What you need to do								
1. Add Spring Boot Actuator dependency to your application.								
1. Run your application, verify GET /health endpoint using Postman.								
3. Add @RefreshScope to your Hello World API's controller that uses @Value to retrieve `message` value.								
4. Run your application, use POST /env actuator endpoint to update your `message` value (you might need to call POST /refresh to refresh the configuration change).								
5. Call your Hello World API and observe the change. If your hello world message does not change, troubleshoot and find out why.								
6. Once success, check in your source code in your GitHub repo.								
								
Extra								
Try creating a custom actuator endpoint using @Endpoint.								
								
Resources								
1. Introduction of Spring Boot Actuator, https://www.baeldung.com/spring-boot-actuators								
2. Spring Boot Actuator API, https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/actuator-api/html/								
