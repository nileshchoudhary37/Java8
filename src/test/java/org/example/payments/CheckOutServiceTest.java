package org.example.payments;

import org.example.payments.service.CheckoutService;
import org.example.payments.service.PaymentService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutServiceTest {

    PaymentService paymentService = new PaymentService();
    CheckoutService checkoutService = new CheckoutService(paymentService);

    @EnumSource(CardType.class)
    @ParameterizedTest(name="Checkout for card type: {0}")
    void checkout(CardType cardType){
        var orderDetails = orderDetails(cardType);
        var checkoutResponse = checkoutService.checkOutOrder(orderDetails);

        assertEquals(CheckOutStatus.SUCCESS, checkoutResponse);

    }

    static OrderDetails orderDetails(CardType cardType){
        var card = new Card("ABC", "938752975344932",
                "4334", "09/99", cardType);
        return new OrderDetails(card, 99.0);
    }
}
