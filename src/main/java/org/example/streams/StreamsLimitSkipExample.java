package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers){
        return integers
                .stream()
                //6
                //7
                //8
                //9
                //10
                .limit(3)
                .reduce( (a, b) -> a+b);
    }
    public static Optional<Integer> skip(List<Integer> integers){
        return integers
                .stream()
                //6
                //7
                //8
                //9
                //10
                .skip(3)//9,10
                .reduce( (a, b) -> a+b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
         Optional<Integer> limitResult = limit(integerList);
         Optional<Integer> skipResult = skip(integerList);
         if(limitResult.isPresent()){
             System.out.println("The limit result is :"+limitResult.get());
         }else{
             System.out.println("No input is passed");
         }

         if(skipResult.isPresent()){
             System.out.println("\nThe skip result is :"+skipResult.get());
         }else{
             System.out.println("\nNo input is passed");
         }
    }
}
