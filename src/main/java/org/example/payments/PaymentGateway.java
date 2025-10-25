package org.example.payments;

public abstract sealed class PaymentGateway permits DebitCardPayment, CreditCardPayment, RewardCardPayment  {

    public abstract PaymentResponse makePayment(Card card, double amount);
}
