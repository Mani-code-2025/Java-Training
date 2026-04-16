package com.advanced.demo;

// 1. Packages: Used to organize classes and prevent naming conflicts.
// This file is in the com.advanced.demo package.

public class AdvancedConcepts {

    public static void main(String[] args) {
        System.out.println("=== 1. Polymorphism & Dynamic Method Dispatch ===");
        // Parent reference, Child object (Upcasting)
        Computer obj = new Laptop();
        // Dynamic Method Dispatch: method called is decided at runtime
        obj.show();

        System.out.println("\n=== 2. Constructor Chaining (super & this) ===");
        new SmartLaptop();

        System.out.println("\n=== 3. Wrapper Classes (Boxing/Unboxing) ===");
        demonstrateWrappers();

        System.out.println("\n=== 4. Inner Classes ===");
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.display();

        System.out.println("\n=== 5. Final Keyword & Abstract ===");
        // Final: Cannot change value/inherit/override
        final int constant = 10;
        System.out.println("Final variable: " + constant);

        // Abstract: You cannot instantiate an abstract class
        // Processor p = new Processor(); // This would give an error
    }

    private static void demonstrateWrappers() {
        int num = 7;

        // Boxing: Manually wrapping a primitive into an object
        Integer num1 = Integer.valueOf(num);

        // Auto-Boxing: Automatic conversion by compiler
        Integer num2 = num;

        // Unboxing: Manually taking value out of object
        int n1 = num1.intValue();

        // Auto-Unboxing: Automatic conversion
        int n2 = num2;

        System.out.println("Auto-boxed Integer: " + num2);
        System.out.println("Auto-unboxed int: " + n2);
    }
}

// === CONCEPTUAL CLASSES ===

// 2. Object Class: Every class in Java implicitly extends the Object class.
class Computer {
    public void show() {
        System.out.println("In Computer Show");
    }
}

// 3. Inheritance & Method Overriding
class Laptop extends Computer {
    @Override // Overriding: Same method name/params as parent, different behavior
    public void show() {
        System.out.println("In Laptop Show (Overridden)");
    }
}

// 4. Constructor Chaining (super and this)
class SmartLaptop extends Laptop {
    public SmartLaptop() {
        this("Generic Brand"); // calls the parameterized constructor of same class
        System.out.println("In SmartLaptop Default Constructor");
    }

    public SmartLaptop(String brand) {
        super(); // calls the constructor of the parent (Laptop)
        System.out.println("In SmartLaptop Parameterized: " + brand);
    }
}

// 5. Abstract Keyword: A class that is declared abstract cannot be instantiated.
abstract class Processor {
    public abstract void compute(); // Abstract method (no body)

    public void config() {
        System.out.println("Standard configuration");
    }
}

// 6. Inner Class
class Outer {
    class Inner {
        public void display() {
            System.out.println("Inside Inner Class");
        }
    }
}