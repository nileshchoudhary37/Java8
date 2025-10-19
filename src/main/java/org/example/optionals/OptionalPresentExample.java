package org.example.optionals;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable("hello optional");
        System.out.println("isPresent: "+optionalString.isPresent());

        //ifPresent
        optionalString.ifPresent((s)-> System.out.println("ifPresent: "+s));
    }
}
