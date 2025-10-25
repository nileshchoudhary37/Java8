package org.example.records;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class ProductTest {

    @Test
     void recordProductTest(){
        Product product = new Product("Bhindi", 40.99, "Vegetable");
        System.out.println("product: " + product);
        assertEquals(40.99, product.cost());
        assertEquals("Vegetable", product.type());
    }
}
