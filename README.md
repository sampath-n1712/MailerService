## To Run in CodeSpace
### Step 1: Run RabbitMQ
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:management
5672 → RabbitMQ connection port
15672 → RabbitMQ UI (http://localhost:15672)
Username: guest
Password: guest
### Step 2: Run MailerService
cd MailerService/mailer-service
mvn dependency:tree
mvn spring-boot:run
### Step 3: Run MailProducer
cd MailProducer/MailProducer
mvn dependency:tree
mvn spring-boot:run
