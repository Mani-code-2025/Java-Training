package com.java.training;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
 * JVM: Not independent, but the bytecode (.class) it runs is. (WORA: Write Once Run Anywhere)
 * Source Code (.java) -> Compiler -> Bytecode (.class) -> JVM Executes
 * JRE: Java Runtime Environment (contains JVM + library classes).
 */

public class JavaConceptsDemo {

    public static void main(String[] args) {
        System.out.println("=== 1. Data Types ===");
        demonstrateDataTypes();

        System.out.println("\n=== 2. Type Conversion & Casting ===");
        demonstrateTypeConversion();

        System.out.println("\n=== 3. Type Promotion ===");
        demonstrateTypePromotion();

        System.out.println("\n=== 4. Operators (Pre/Post Increment) ===");
        demonstrateOperators();

        System.out.println("\n=== 5. Conditional Statements ===");
        // We pass the values in here now so the IDE doesn't complain about hardcoded logic!
        demonstrateConditionals(75, 3);

        System.out.println("\n=== 6. Looping Statements ===");
        demonstrateLoops();
    }

    private static void demonstrateDataTypes() {
        // Primitive Data Types
        byte b = 127;       // 1 byte
        short s = 32767;    // 2 bytes
        int i = 2147483647; // 4 bytes
        long l = 9223372036854775807L; // 8 bytes

        float f = 3.14f;    // 4 bytes
        double d = 3.14159; // 8 bytes

        char c = 'A';       // 2 bytes (Unicode)
        boolean bool = true; // 1 bit of info

        // Printing them out so IntelliJ registers them as "used"
        System.out.println("Whole Numbers: " + b + ", " + s + ", " + i + ", " + l);
        System.out.println("Decimals & Others: " + f + ", " + d + ", " + c + ", " + bool);
    }

    private static void demonstrateTypeConversion() {
        int a = 34;
        byte b;

        // Explicit conversion (Casting) - potential data loss
        b = (byte) a;
        System.out.println("Explicit cast to byte: " + b);

        // Implicit conversion - automatic widening
        int a2 = b;
        System.out.println("Implicit cast back to int: " + a2);
    }

    private static void demonstrateTypePromotion() {
        byte a = 10;
        byte b = 30;

        // Type promotion: During evaluation, byte * byte is promoted to int.
        int c = a * b;
        System.out.println("Promoted result of byte * byte: " + c);
    }

    private static void demonstrateOperators() {
        int n = 7;

        // Pre-increment: increment first, then use the value
        int result = ++n;
        System.out.println("Pre-increment (++n): " + result + " | Current n: " + n);

        n = 7; // reset
        // Post-increment: use the value first, then increment
        int result1 = n++;
        System.out.println("Post-increment (n++): " + result1 + " | Current n: " + n);
    }

    // Accepting parameters fixes the "always true/false" warnings
    private static void demonstrateConditionals(int score, int day) {

        // 1. if/else
        if (score >= 80) {
            System.out.println("if/else: Grade A");
        } else {
            System.out.println("if/else: Grade B or lower");
        }

        // 2. Ternary Operator: (condition) ? true_value : false_value;
        String status = (score >= 50) ? "Pass" : "Fail";
        System.out.println("Ternary: " + status);

        // 3. Switch Statement
        switch (day) {
            case 1:
                System.out.println("Switch: Monday");
                break;
            case 3:
                System.out.println("Switch: Wednesday");
                break;
            default:
                System.out.println("Switch: Other day");
        }
    }

    private static void demonstrateLoops() {
        // 1. While Loop
        int i = 0;
        System.out.print("While: ");
        while (i < 3) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 2. Do-While Loop (runs at least once)
        int j = 0;
        System.out.print("Do-While: ");
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 3);
        System.out.println();

        // 3. For Loop
        System.out.print("For: ");
        for (int k = 0; k < 3; k++) {
            System.out.print(k + " ");
        }
        System.out.println();

        // 4. Nested Loops (Nested For/While)
        System.out.println("Nested Loops:");
        for (int row = 1; row <= 2; row++) {
            int col = 1;
            while (col <= 2) {
                System.out.println("  Row " + row + " Col " + col);
                col++;
            }
        }
    }
}