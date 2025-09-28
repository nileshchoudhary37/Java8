package org.example.functional_interfaces;

public class FunctionExaple1 {

    public static String executeOtherClassFunction(String s){
        return FunctionExample.addSomeString.apply(s);
    }

    public static void main(String[] args) {
        String result = executeOtherClassFunction("hello_");
        System.out.println("concat operation from other class: "+result.toUpperCase());
    }
}
