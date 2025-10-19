package org.example.defaults;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    static  Consumer<Student> studentConsumer = (s)-> System.out.println(s);
    static Comparator<Student> comparatorGpa = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> comparatorName = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByGPA(List<Student> list){


        list.sort(comparatorGpa);
        System.out.println("\nAfter SortByGPA:");
        list.forEach(studentConsumer);
    }

    public static void sortByName(List<Student> list){

        list.sort(comparatorName);
        System.out.println("\nAfter SortByName:");
        list.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList){
        System.out.println("\nAfter comparatorChaining:");
        studentList.sort(gradeComparator.thenComparing(comparatorName));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList){
//        Comparator<Student> studentComparator = Comparator.nullsFirst(comparatorName);
        Comparator<Student> studentComparator = Comparator.nullsLast(comparatorName);
        studentList.sort(studentComparator);
        System.out.println("\nAfter sortWithNullValues:");
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("\nBefore sorting: ");
        studentList.forEach(studentConsumer);

//        sortByName(studentList);
//        sortByGPA(studentList);
//        comparatorChaining(studentList);
        sortWithNullValues(studentList);
    }
}
