package org.example.functional_interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b)-> a*b;
        System.out.println(binaryOperator.apply(2,7));

        //MinBy and MaxBy static method demos of BinaryOperator
        //MaxBy
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        //MinBy
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of maxBy BinaryOperator: "+ maxBy.apply(2,7));
        System.out.println("Result of minBy BinaryOperator: "+ minBy.apply(2,7));
    }
}
