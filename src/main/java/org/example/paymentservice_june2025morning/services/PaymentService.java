package org.example.paymentservice_june2025morning.services;

import org.example.paymentservice_june2025morning.paymentgateway.IPaymentGateway;
import org.example.paymentservice_june2025morning.paymentgateway.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String getPaymentLink(Long amount, String orderId, String phoneNumber, String name, String email) {
       IPaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPerformingPaymentGateway();
       return paymentGateway.generatePaymentLink(amount, orderId, phoneNumber, name, email);

    }
}
