package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1, s2) -> s1.getGpa() >= s2.getGpa() ? s1 : s2);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> nums){
        return nums
                .stream()
                .reduce((a, b) -> a * b);
    }

    public static int performMultiplication(List<Integer> nums){
        return nums
                .stream()
                .reduce(1, (a, b) -> a * b);
    //first param of reduce is defult or initial value.
    //in first iteration it takes a=1 and b=1(from the stream) multiply and return the result as 1.
    // in second iteration it takes a=result=1 and b=2(from the stream) multiply and return the result as 2.
    //in third iteration it takes a=result=2 and b=3(from the stream) multiply and return the result as 6.
    //in fourth iteration it takes a=result=6 and b=4(from the stream) multiply and return the result as 24.
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> nums1= new ArrayList<>();
        System.out.println(performMultiplication(nums));
        System.out.println("Stream API : reduce operation without identity:");
        System.out.println(performMultiplicationWithoutIdentity(nums));
        System.out.println(performMultiplicationWithoutIdentity(nums).isPresent());
        System.out.println(performMultiplicationWithoutIdentity(nums).get());
        System.out.println("Stream API : reduce operation without identity and passing empty arraylist:");
        System.out.println(performMultiplicationWithoutIdentity(nums1).isPresent());
//        System.out.println(performMultiplicationWithoutIdentity(nums1).get());  //will throw a NoSuchElementException
        System.out.println("Stream API : reduce operation without identity and getting highestGPA student:");
        if(getHighestGPAStudent().isPresent()){
            System.out.println(getHighestGPAStudent().get());
        }
    }
}
