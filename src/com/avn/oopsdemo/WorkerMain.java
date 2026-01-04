package com.avn.oopsdemo;

public class WorkerMain {

	public static void main(String[] args) {
		Worker e = new Worker();
        Worker e1 = new Developer();
        Worker e2 = new UIDeveloper();

        e.work();  // Worker class method
        e1.work(); // Developer's class method  
        e2.work(); // UI Developer's class method
    
	}

}
