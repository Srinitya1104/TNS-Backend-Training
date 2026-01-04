package com.avn.oopsdemo;

public class Operators {
	int a = 10, b = 5, c;
    boolean x = true, y = false;
    String str = "Hello";

    // Method to demonstrate all operators
    void showOperators() {

        System.out.println("=== Java Operators Example ===\n");

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // 2. Unary Operators
        System.out.println("Unary Operators:");
        System.out.println("++a = " + (++a)); // pre-increment
        System.out.println("--b = " + (--b)); // pre-decrement
        System.out.println();

        // 3. Assignment Operators
        System.out.println("Assignment Operators:");
        c = a;
        System.out.println("c = a ➜ " + c);
        c += 3;
        System.out.println("c += 3 ➜ " + c);
        c -= 2;
        System.out.println("c -= 2 ➜ " + c);
        c *= 2;
        System.out.println("c *= 2 ➜ " + c);
        c /= 3;
        System.out.println("c /= 3 ➜ " + c);
        System.out.println();

        // 4. Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println();

        // 5. Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));
        System.out.println();

        // 6. Bitwise & Shift Operators
        System.out.println("Bitwise & Shift Operators:");
        int p = 5, q = 3; // 5 = 0101, 3 = 0011
        System.out.println("p & q = " + (p & q));   // AND
        System.out.println("p | q = " + (p | q));   // OR
        System.out.println("p ^ q = " + (p ^ q));   // XOR
        System.out.println("p << 1 = " + (p << 1)); // Left shift
        System.out.println("p >> 1 = " + (p >> 1)); // Right shift
        System.out.println();

        // 7. Ternary Operator
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
        System.out.println();

        // 8. instanceof Operator
        System.out.println("instanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}
