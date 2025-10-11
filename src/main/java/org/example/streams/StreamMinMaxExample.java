package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList
                .stream()
                .reduce(Integer::max);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList
                .stream()
                .reduce((a, b) -> a<b ? a : b);
    }

    public static int findMaxValue(List<Integer> integerList){  //issue with this is when list is empty
        return integerList
                .stream()
                .reduce(0,Integer::max);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
//        List<Integer> integerList = new ArrayList<>();
        System.out.println("Max value is "+findMaxValue(integerList));
        System.out.println("Max value is with empty list:"+findMaxValue(new ArrayList<>())); //still returning 0 which is wrong

        Optional<Integer> maxValueOptional =  findMaxValueOptional(integerList);
        Optional<Integer> minValueOptional =  findMinValueOptional(integerList);
        if(maxValueOptional.isPresent()) {
            System.out.println("Max Value optional :" + maxValueOptional.get()+"\n");
            System.out.println("Min Value optional :" + minValueOptional.get());
        }else{
            System.out.println("Max Value optional is empty\n");
            System.out.println("Min Value optional is empty");
        }

    }
}
