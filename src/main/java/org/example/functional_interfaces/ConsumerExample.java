package org.example.functional_interfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Consumer<Student> c3 = (s) -> System.out.print(s.getName());
    static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());
    static Consumer<Student> c2 = (s) -> System.out.println(s);

    public static void printStudent(){
        System.out.println("printStudent");
        studentList.forEach(c2);
    }

    public static void printNameAndActivities(){
        System.out.println("printNameAndActivities");
        studentList.forEach(c3.andThen(c4)); //consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition");
        studentList.forEach((student -> {
            if(student.getGradeLevel() >=3 && student.getGpa() >=3.9){
                c3.andThen(c4).accept(student);
            }
        })); //consumer chaining
    }

    public static void main(String[] args) {

        //Lambda example
        Consumer<String> consumer1 = (a) -> System.out.println(a.toUpperCase());
        consumer1.accept("Hello");
        printStudent();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();

    }
}
