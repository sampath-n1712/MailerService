package com.mycompany.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailProducer emailProducer;

    public EmailController(EmailProducer emailProducer) {
        this.emailProducer = emailProducer;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
        emailProducer.sendEmailRequest(request);
        return ResponseEntity.ok("Email request sent successfully!");
    }
}
