package org.example.payments;

public record Card(
        String name,
        String cardNumber,
        String verficationCode,
        String expiryDate,
        CardType cardType
) {
}
