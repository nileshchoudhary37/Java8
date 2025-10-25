package org.example.payments.service;

import org.example.payments.OrderDetails;
import org.example.payments.PaymentFactory;
import org.example.payments.PaymentGateway;
import org.example.payments.PaymentResponse;

public class PaymentService {

    public PaymentResponse makePaymentv2(OrderDetails orderDetails){
        //Implement a payment gateway that can handle the different kinds of payment.
        PaymentGateway paymentGateway =PaymentFactory.paymentGateway(orderDetails.card().cardType());
        return paymentGateway.makePayment(orderDetails.card(), orderDetails.finalAmount());
    }
}
