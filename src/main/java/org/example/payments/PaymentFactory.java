package org.example.payments;

public class PaymentFactory {

    public static PaymentGateway paymentGateway(CardType cardType) {
        return switch (cardType) {
            case DEBIT -> new DebitCardPayment();
            case CREDIT -> new CreditCardPayment();
            case REWARDS -> new RewardCardPayment();
            case null -> throw new IllegalArgumentException("Invalid card type");
        };
    }
}
