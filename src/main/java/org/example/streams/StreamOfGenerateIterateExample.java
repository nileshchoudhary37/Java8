package org.example.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {
    public static void main(String[] args) {

        //of method
        Stream<String> stringStream = Stream.of("adam", "dam", "julie");
        stringStream.forEach(System.out::println);

        //iterate method
        Stream.iterate(1,x -> x*2)
                .limit(10)
                .forEach(System.out::println);

        //generic method
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
