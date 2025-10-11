package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter( s -> "female".equals(s.getGender()))
                .filter(s -> 3.9 <= s.getGpa())
                .toList();
    }

    public static void main(String[] args) {
        System.out.println("Filter female students only based on the gpa>=3.9: ");
        filterStudents().forEach(System.out::println);
    }
}
