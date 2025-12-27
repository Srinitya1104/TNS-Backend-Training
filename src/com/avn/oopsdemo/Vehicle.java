package com.avn.oopsdemo;
//Demo for inheritance --> code Reuseability
//parent,child-- superclass and subclass -- base class and derived class
//Types of inheritance --> single,multilevel,hierarchy (not accepted multiple)
public class Vehicle {
  public String brand;
  public String model;
  
  public Vehicle(String brand, String model) {
      super();
      this.brand = brand;
      this.model = model;
  }
  
  void startEngine() {
      System.out.println("When engine is started the vehicle moves");
  }
}