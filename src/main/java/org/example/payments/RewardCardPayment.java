package org.example.payments;

public final class RewardCardPayment extends PaymentGateway{


    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Acquire Rewards Card Payment for the amount " + amount);
        return PaymentResponse.SUCCESS;
    }
}
