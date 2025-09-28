package org.example.functional_interfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println("name: "+name+ " activities: "+activities);
        };

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<Integer,Integer> multiply = (a,b) -> System.out.println("Multiplication " +
                "of two numbers: "+ a*b);
        BiConsumer<Integer,Integer> division = (a,b) -> System.out.println("Division of two " +
                "numbers: "+ a/b);

        multiply.andThen(division).accept(2,9);
        nameAndActivities();
    }
}
