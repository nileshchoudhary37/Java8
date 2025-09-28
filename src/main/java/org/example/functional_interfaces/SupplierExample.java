package org.example.functional_interfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    static Supplier<String> supplier = () -> "default".toUpperCase();

    static Supplier<List<Student>> studentSupplier = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        System.out.println(supplier.get());
        System.out.println("students from studentDatabase: "+ studentSupplier.get());
    }
}
