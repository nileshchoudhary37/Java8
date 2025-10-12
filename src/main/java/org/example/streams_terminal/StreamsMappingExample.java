package org.example.streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toList;

public class StreamsMappingExample {

    public static void main(String[] args) {
        List<String> nameList=  StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList()));

        Set<String> nameSet=  StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet()));

        System.out.println("nameList: " + nameList);
        System.out.println("nameSet: " + nameSet);
    }
}
