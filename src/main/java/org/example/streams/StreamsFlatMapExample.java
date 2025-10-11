package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;

public class StreamsFlatMapExample {
    public static long getStudentActivitiesCount(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }
    public static List<String> printStudentActivities(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
    }

    public static void main(String[] args) {
        System.out.println("Print student activities(sorted): "+ printStudentActivities()   );
        System.out.println("print student activities count: "+ getStudentActivitiesCount());
    }
}
