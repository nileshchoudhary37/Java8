package org.example.functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    //when input and output types are same then use UnaryOperator
    static UnaryOperator<String > unaryOperator = (s) -> s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Hello"));
    }
}
