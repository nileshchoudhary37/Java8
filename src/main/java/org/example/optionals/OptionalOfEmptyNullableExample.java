package org.example.optionals;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){
        return Optional.ofNullable("Harry Potter");
    }

    public static Optional<String> of(){
        return Optional.of("Harry Potter");
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(ofNullable().orElse(null)); //expects null or non-null values
        System.out.println(of().get()); //expects always non-null values
        System.out.println(empty()); //returns empty
    }
}
