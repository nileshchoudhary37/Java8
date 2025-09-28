package org.example.functional_interfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.concat("default");

    public static void main(String[] args) {
        System.out.println("Uppercase version is: "+function.apply("java8"));
        System.out.println("Uppercase andThen add someString: "+ function.andThen(addSomeString).apply("java8"));
        System.out.println("Uppercase compose version: "+ function.compose(addSomeString).apply("java8"));
    }
}
