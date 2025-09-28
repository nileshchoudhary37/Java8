package org.example.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        //prior Java-8
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();
//        runnable.run();

        //java 8 lambda
        Runnable runnableLambda = () ->{
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnableLambda).start();

        //More simpler lambda
        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnableLambda2).start();

        //Without 3rd variable - Legacy way
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 4");
            }
        }).start();
        //Without 3rd variable - Using lambda
        new Thread(()-> System.out.println("Inside Runnable 5")).start();
    }
}
