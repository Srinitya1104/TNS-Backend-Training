package com.avn.oopsdemo;

import java.util.Scanner;

public class ConditionalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        // Creating object for ConditionalStatements class
        ConditionalStatements obj = new ConditionalStatements(score);

        // Calling the method to display grade
        obj.checkGrade();

        sc.close();
   
	}

}
