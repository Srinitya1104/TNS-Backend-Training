package com.avn.oopsdemo;

public class ConditionalStatements {
	 int score; // instance variable

	    // Constructor
	    ConditionalStatements(int s) {
	        score = s;
	    }

	    // Method to check grade using if, if-else, if-else-if
	    void checkGrade() {

	        System.out.println("=== Conditional & Control Statements Example ===\n");
	        System.out.println("Student Score: " + score);

	        // Using simple if
	        if (score == 100) {
	            System.out.println("Perfect Score! 🎉");
	        }

	        // Using if-else
	        if (score >= 50) {
	            System.out.println("Result: PASS");
	        } else {
	            System.out.println("Result: FAIL");
	        }

	        // Using if-else-if ladder
	        char grade;
	        if (score >= 90) {
	            grade = 'A';
	        } else if (score >= 80) {
	            grade = 'B';
	        } else if (score >= 70) {
	            grade = 'C';
	        } else if (score >= 60) {
	            grade = 'D';
	        } else if (score >= 50) {
	            grade = 'E';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("Grade: " + grade);
	    }
	
}
