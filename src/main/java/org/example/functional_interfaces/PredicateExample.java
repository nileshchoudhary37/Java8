package org.example.functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = (i) -> i%2 ==0;
    static Predicate<Integer> p1 = (i) ->i%2 ==0;
    static Predicate<Integer> p2 = (i) ->i%5 ==0;

    public static void predicateAnd(){
        System.out.println("Predicate and result : "+ p1.and(p2).test(10));
        System.out.println("Predicate and result : "+ p1.and(p2).test(9));
    }

    public static void predicateOr(){
        System.out.println("Predicate or result : "+ p1.or(p2).test(10));
        System.out.println("Predicate or result : "+ p1.or(p2).test(8));
    }

    public static void predicateNegate(){
        System.out.println("Predicate or result ka negate : "+ p1.or(p2).negate().test(10));
        System.out.println("Predicate or result ka negate : "+ p1.or(p2).negate().test(8));
    }

    public static void main(String[] args) {
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
