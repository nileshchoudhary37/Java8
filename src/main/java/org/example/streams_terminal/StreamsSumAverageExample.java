package org.example.streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAverageExample {

    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static double average(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("Total notebooks: "+sum());
        System.out.println("Average number of notebooks: "+average());
    }
}
