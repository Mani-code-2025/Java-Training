package com.expert.demo;

import java.util.Arrays;
import java.util.List;

// 1. Record Class (Java 14+): A concise way to create data-only classes.
// Automatically generates private final fields, constructor, getters, equals, hashCode, and toString.
record User(int id, String name) {}

// 2. Sealed Classes (Java 17): Restricts which other classes can inherit from it.
sealed class Shape permits Circle, Square {}

final class Circle extends Shape {} // Permitted
final class Square extends Shape {} // Permitted
// class Triangle extends Shape {} // Error! Not in the 'permits' list.

public class ModernJava {
    public static void main(String[] args) {

        // 3. Local Variable Type Inference (LVTI - Java 10)
        // Using 'var' allows the compiler to figure out the type based on the value.
        var score = 95; // Compiler knows this is an 'int'
        var message = "Learning Modern Java";
        System.out.println("LVTI: " + message + " with score " + score);

        // 4. Method Reference (Java 8+)
        // Shorthand for a Lambda that just calls an existing method.
        List<String> names = Arrays.asList("Mani", "Navin", "Java");

        // Instead of: names.forEach(n -> System.out.println(n));
        System.out.print("Method Reference output: ");
        names.forEach(System.out::println);

        // 5. Constructor Reference
        // Shorthand to create objects via a Functional Interface.
        UserCreator creator = User::new;
        User myUser = creator.create(101, "Mani-Code");
        System.out.println("Record & Constructor Reference: " + myUser);
    }
}

@FunctionalInterface
interface UserCreator {
    User create(int id, String name);
}