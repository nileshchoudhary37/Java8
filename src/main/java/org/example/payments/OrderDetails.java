package org.example.payments;

public record OrderDetails (
        Card card,
        double finalAmount
){
}
