package com.mycompany.app;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {
    private final EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void consumeEmailRequest(EmailRequest request) {
        System.out.println("📩 Email request received: " + request);
        emailService.sendEmail(request.getTo(), request.getSubject(), request.getBody());
    }
}
