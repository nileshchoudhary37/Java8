package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;

public class StreamsMapExample {

    public static List<String> nameList(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(nameList());
    }
}
