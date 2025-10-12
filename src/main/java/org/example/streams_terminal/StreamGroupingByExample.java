package org.example.streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    public static void groupStudentByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void customizedGroupingBy(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(s -> s.getGpa()>=3.8 ? "OUTSTANDING": "AVERAGE"));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(s-> s.getGpa()>=3.8 ? "OUTSTANDING": "AVERAGE")));
        System.out.println(studentMap);
    }
    public static void twoLevelGrouping_2(){
        Map<Integer, Integer> gradeLevelNotebooksMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNoteBooks)));
        System.out.println(gradeLevelNotebooksMap);
    }

    public static void threeArgumentsGroupBy(){
        LinkedHashMap<Double, Set<Student>> studentSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGpa, LinkedHashMap::new, toSet()));
        System.out.println(studentSet);
    }
    public static void calculateTopGPAinEachGradeLevel(){
        Map<Integer, Optional<Student>> maxByStudent = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(maxByStudent);
    }
    public static void calculateLeastGPAinEachGradeLevel(){
        Map<Integer, Optional<Student>> minByStudent = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(minByStudent);
    }

    public static void main(String[] args) {
        System.out.println("\nGrouping By Gender: ");
        groupStudentByGender();
        System.out.println("\nGrouping By GPA: ");
        customizedGroupingBy();
        System.out.println("\nTwo level grouping of students based on GRADE LEVEL and GPA:");
        twoLevelGrouping_1();
        System.out.println("\nTwo level grouping of students based on Grade Level and summing Notebooks:");
        twoLevelGrouping_2();
        System.out.println("\nThree arguments groupingBy of students: ");
        threeArgumentsGroupBy();
        System.out.println("\nMaximum gpa student in each grade: ");
        calculateTopGPAinEachGradeLevel();
        System.out.println("\nLeast gpa student in each grade: ");
        calculateLeastGPAinEachGradeLevel();
    }
}
