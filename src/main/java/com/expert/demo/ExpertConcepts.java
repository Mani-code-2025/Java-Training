package com.expert.demo;

import java.util.*;

// 1. Interface: A blueprint for a class. Defines WHAT a class must do, not HOW.
// Types: Normal, Functional (1 method), and Marker (0 methods).
@FunctionalInterface
interface Computer {
    void compile(); // Abstract method
}

// 2. Enumeration: A special "class" representing a group of constants.
enum Status {
    Running, Failed, Pending, Success;
}

public class ExpertConcepts {
    public static void main(String[] args) {

        // 3. Anonymous Inner Class & Lambda Expressions
        // Instead of creating a whole class, we define the logic on the fly.
        Computer obj = () -> System.out.println("Compiling with Lambda...");
        obj.compile();

        // 4. Exceptions & Throwable
        try {
            int result = 10 / 0; // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }

        // 5. Collections & Generics
        // Generics <Integer> ensure type safety.
        List<Integer> nums = new ArrayList<>();
        nums.add(5);

        // Map: Key-Value pairs
        Map<String, Integer> students = new HashMap<>();
        students.put("Mani", 95);
        students.put("Navin", 88);
        System.out.println("Map content: " + students);

        // 6. Threads & Race Conditions
        Counter c = new Counter();

        // Runnable is a Functional Interface used for Threads
        Runnable r1 = () -> {
            for(int i=0; i<1000; i++) c.increment();
        };
        Runnable r2 = () -> {
            for(int i=0; i<1000; i++) c.increment();
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join(); // Wait for threads to finish
            t2.join();
        } catch (InterruptedException e) {}

        System.out.println("Counter value (Synchronized): " + c.count);
    }
}

// 7. Synchronized Keyword: Prevents "Race Conditions" by allowing only one
// thread to access the method at a time.
class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}