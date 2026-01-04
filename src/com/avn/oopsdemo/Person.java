package com.avn.oopsdemo;

public class Person {
	private int pid;
    private String name; // String should be capitalized
    private int age;

    // Setter methods
    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
