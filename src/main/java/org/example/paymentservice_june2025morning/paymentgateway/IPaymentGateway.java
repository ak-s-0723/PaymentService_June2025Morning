package org.example.paymentservice_june2025morning.paymentgateway;

public interface IPaymentGateway {

    String generatePaymentLink(Long amount, String orderId, String phoneNumber, String name, String email);
}
