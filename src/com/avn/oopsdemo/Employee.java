package com.avn.oopsdemo;

public class Employee {
	// instance variables
    int empId;
    String empName;
    String department;
    
    // static variable
    static String companyName = "Salesforce Hyderabad";
    
    // method
    void display() {
        // local variable
        String msg = "These are Employee Details";
        System.out.println(msg);
        System.out.println(" Employee Information:" + "\nName: " + empName + "\nEmployee ID: " + empId + "\nDepartment: " + department + "\nCompany: " + companyName);
    }


}
