package com.oop.demo;

import java.util.ArrayList;
import java.util.List;

public class OopConcepts {

    public static void main(String[] args) {
        System.out.println("=== 1. Variables, Object Creation, & Encapsulation ===");
        // Object Creation: new keyword allocates memory
        Student student1 = new Student();

        // Encapsulation: Using methods to access private variables
        student1.setAge(25);
        student1.setName("Mani");
        System.out.println("Name: " + student1.getName() + ", Age: " + student1.getAge());

        System.out.println("\n=== 2. Static Keyword (Global-like) ===");
        System.out.println("School Name (Static): " + Student.schoolName);

        System.out.println("\n=== 3. Method Overloading ===");
        Student.study();          // No parameters
        Student.study("Java");    // One String parameter

        System.out.println("\n=== 4. Arrays (1D, 2D, Jagged, Objects) ===");
        demonstrateArrays();

        System.out.println("\n=== 5. Strings (Mutable vs Immutable) ===");
        demonstrateStrings();

        System.out.println("\n=== 6. Collections (ArrayList) ===");
        demonstrateCollections();

        System.out.println("\n=== 7. Inheritance & Anonymous Objects ===");
        // Anonymous Object: Object created without assigning it to a reference variable
        new Animal().show();

        // Inheritance: Dog inherits from Animal
        Dog myDog = new Dog();
        myDog.show(); // Inherited method
        myDog.bark(); // Dog's own method
    }

    private static void demonstrateArrays() {
        // 1. Standard 1D Array
        int[] num = new int[5];

        // Math.random() returns a double between 0.0 and 1.0. We cast it to int.
        num[0] = (int) (Math.random() * 100);
        num[1] = 2;
        num[2] = 3;

        System.out.print("1D Array using For-Each loop: ");
        // Enhanced For Loop (For-each)
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 2. 2D Array (Fixed size)
        int[][] num2D = new int[2][3];
        num2D[0][0] = 5;

        // 3. Jagged Array (Columns vary per row)
        int[][] jagged = new int[3][];
        jagged[0] = new int[3]; // Row 0 has 3 columns
        jagged[1] = new int[4]; // Row 1 has 4 columns
        jagged[2] = new int[2]; // Row 2 has 2 columns
        System.out.println("Jagged array created with variable column lengths.");

        // 4. Array of Objects
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setName("Alice");
        System.out.println("First student in Object Array: " + students[0].getName());
    }

    private static void demonstrateStrings() {
        // Immutable String (Cannot be changed, a new object is made in memory)
        String s = "Hello";
        s = s + " World"; // Creates an entirely new String object

        // Mutable String (Thread-safe, can be changed without creating new memory objects)
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println("StringBuffer original: " + sb);
        System.out.println("StringBuffer capacity: " + sb.capacity());
        sb.append(" Reddy");
        System.out.println("StringBuffer altered: " + sb);
    }

    private static void demonstrateCollections() {
        // Collections grow dynamically, unlike standard Arrays
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("Collection (ArrayList): " + list);
    }
}

// === HELPER CLASSES ===

/**
 * Class: A blueprint.
 * Object: Instance of the class having Property (variables) and Behavior (methods).
 * Naming Conventions: Class names are PascalCase, methods/variables are camelCase.
 */
class Student {
    // 1. Instance Variables (Belong to the specific object)
    private int age;
    private String name;

    // 2. Global/Static Variable (Belongs to the Class, shared by all objects)
    public static String schoolName = "Tech Academy";

    // Constructor: Called automatically when object is created
    public Student() {
        System.out.println("Inside Student Constructor");
    }

    // Encapsulation: Public getters and setters to protect private variables
    public void setAge(int age) {
        // 'this' keyword refers to the current instance variable, resolving shadowing
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Method Overloading: Same method name, different parameters
    public static void study() {
        // Local Variable (Exists only inside this method)
        int hours = 2;
        System.out.println("Studying for " + hours + " hours.");
    }

    public static void study(String subject) {
        System.out.println("Studying " + subject);
    }
}

// Inheritance base class
class Animal {
    public void show() {
        System.out.println("I am an Animal");
    }
}

// Inheritance derived class ('extends' keyword)
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking!");
    }
}