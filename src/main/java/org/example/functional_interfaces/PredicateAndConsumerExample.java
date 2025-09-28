package org.example.functional_interfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = s ->s.getGpa()>=3.9;
    Predicate<Student > p2 = s -> s.getGradeLevel()>=3;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activites) ->
            System.out.println(name+ " : "+ activites);

    BiPredicate<Integer, Double> studentBiPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;

    Consumer<Student> studentConsumer = student -> {
        /**Using Predicate and */
        if(p1.and(p2).test(student)){
            System.out.println("validating using Predicate.........");
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }

        /** Using BiPredicate */
        if(studentBiPredicate.test(student.getGradeLevel(), student.getGpa())){
            System.out.println("just to show illustration same thing validating using BiPredicate........");
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            new PredicateAndConsumerExample().studentConsumer.accept(student);
        });
    }
}
