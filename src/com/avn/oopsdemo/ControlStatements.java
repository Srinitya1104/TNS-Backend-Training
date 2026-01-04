package com.avn.oopsdemo;

public class ControlStatements {
	   int n;

	    // Constructor
	    ControlStatements(int n) {
	        this.n = n;
	    }

	    // Method to demonstrate control statements
	    void showControlStatements() {

	        System.out.println("\n=== CONTROL STATEMENTS EXAMPLES ===\n");

	        // 1️⃣ FOR LOOP
	        System.out.println("For Loop: Printing numbers from 1 to " + n);
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println("\n");

	        // 2️⃣ WHILE LOOP
	        System.out.println("While Loop: Printing even numbers up to " + n);
	        int i = 2;
	        while (i <= n) {
	            System.out.print(i + " ");
	            i += 2;
	        }
	        System.out.println("\n");

	        // 3️⃣ DO-WHILE LOOP
	        System.out.println("Do-While Loop: Printing numbers from " + n + " down to 1");
	        int j = n;
	        do {
	            System.out.print(j + " ");
	            j--;
	        } while (j >= 1);
	        System.out.println("\n");

	        // 4️⃣ BREAK STATEMENT
	        System.out.println("Break Statement Example: Stop loop when i == 5");
	        for (int k = 1; k <= 10; k++) {
	            if (k == 5) {
	                System.out.println("Breaking at k = " + k);
	                break;
	            }
	            System.out.print(k + " ");
	        }
	        System.out.println("\n");

	        // 5️⃣ CONTINUE STATEMENT
	        System.out.println("Continue Statement Example: Skip printing number 5");
	        for (int k = 1; k <= 10; k++) {
	            if (k == 5) {
	                continue;
	            }
	            System.out.print(k + " ");
	        }
	        System.out.println("\n");
	    }
	}
