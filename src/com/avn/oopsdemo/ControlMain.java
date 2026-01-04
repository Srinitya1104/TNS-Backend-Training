package com.avn.oopsdemo;

import java.util.Scanner;

public class ControlMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (for loop limit): ");
        int n = sc.nextInt();

        // Creating object for ControlStatements class
        ControlStatements cs = new ControlStatements(n);

        // Calling the method
        cs.showControlStatements();

        sc.close();
    
	}

}
