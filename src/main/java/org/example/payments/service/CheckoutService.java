package org.example.payments.service;

import org.example.payments.CheckOutStatus;
import org.example.payments.OrderDetails;
import org.example.payments.PaymentResponse;

public class CheckoutService {
    private final PaymentService paymentService;
    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public CheckOutStatus checkOutOrder(OrderDetails orderDetails){
        var paymentResponse = paymentService.makePaymentv2(orderDetails);
        if(paymentResponse.equals(PaymentResponse.SUCCESS)){
            return CheckOutStatus.SUCCESS;
        }
        return CheckOutStatus.FAILURE;
    }
}
