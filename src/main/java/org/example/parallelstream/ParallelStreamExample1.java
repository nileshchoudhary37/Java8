package org.example.parallelstream;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities(){
        long startTime= System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        long endTime= System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential:"+(endTime-startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities(){
        long startTime= System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        long endTime= System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel:"+(endTime-startTime));
        return studentActivities;
    }
    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
