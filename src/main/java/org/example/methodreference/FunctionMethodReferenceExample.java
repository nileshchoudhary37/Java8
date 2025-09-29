package org.example.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> toUpperCaseUsingLambda= (s) ->  s.toUpperCase();
    static Function<String,String> toUpperCaseUsingMethodReference= String::toUpperCase;

    public static void main(String[] args) {
        System.out.println("upper case of string using lambda: "+toUpperCaseUsingLambda.apply("java8"));
        System.out.println("upper case of string using method reference: "+toUpperCaseUsingMethodReference.apply("java8"));

    }

}
