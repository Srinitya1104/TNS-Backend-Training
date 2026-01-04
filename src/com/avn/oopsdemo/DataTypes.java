package com.avn.oopsdemo;

public class DataTypes {
	 // Instance variables (non-static, need an object to access)
    byte byteVar = 100;
    short shortVar = 20000;
    int intVar = 123456789;
    long longVar = 9876543210L;
    float floatVar = 3.14f;
    double doubleVar = 3.14159265359;
    boolean booleanVar = true;
    char charVar = 'A';

    // Method to display all data type values
    void displayValues() {
        System.out.println("=== Java Data Types Example ===");
        System.out.println("byte value: " + byteVar);
        System.out.println("short value: " + shortVar);
        System.out.println("int value: " + intVar);
        System.out.println("long value: " + longVar);
        System.out.println("float value: " + floatVar);
        System.out.println("double value: " + doubleVar);
        System.out.println("boolean value: " + booleanVar);
        System.out.println("char value: " + charVar);
    }

}
