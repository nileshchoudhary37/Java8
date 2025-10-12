package org.example.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        //sum
        int sum = IntStream.range(1,50).sum();
        System.out.println("Sum using sum() of NumericStream Aggregate: "+sum);
        //max
        OptionalInt optionalInt = IntStream.rangeClosed(1,50).max();
        System.out.println("\nMax using max() of NumericStream Aggregate: "+(optionalInt.isPresent()?
                optionalInt.getAsInt():0));
        //min
        OptionalLong optionalLong = LongStream.rangeClosed(1,50).min();
        System.out.println("\nMin using min() of NumericStream Aggregate: "+(optionalLong.isPresent()?
                optionalLong.getAsLong():0));
        //average
        OptionalDouble optionalDouble= IntStream.rangeClosed(1,50).average();
        System.out.println("\nAverage using average() of NumericStream Aggregate: "+(optionalDouble.isPresent()?
                optionalDouble.getAsDouble():0.0));

    }
}
