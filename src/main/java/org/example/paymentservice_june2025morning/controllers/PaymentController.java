package org.example.paymentservice_june2025morning.controllers;

import org.example.paymentservice_june2025morning.dtos.PaymentRequestDto;
import org.example.paymentservice_june2025morning.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody PaymentRequestDto paymentRequestDto) {
       return paymentService.getPaymentLink(paymentRequestDto.getAmount(), paymentRequestDto.getOrderId(),paymentRequestDto.getPhoneNumber(),paymentRequestDto.getName(),paymentRequestDto.getEmail());
    }
}
