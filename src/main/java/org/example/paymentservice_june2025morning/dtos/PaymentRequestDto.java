package org.example.paymentservice_june2025morning.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentRequestDto {
    Long amount;
    String orderId;
    String phoneNumber;
    String name;
    String email;
}
