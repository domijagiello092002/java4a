package com.example.techcorp;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechCorp", 50_000);
        
        Employee anna = new Developer("Anna", 9, 8_000);
        Employee piotr = new Tester("Piotr", 6, 6_500);
        Employee ewa = new Manager("Ewa", 7, 9_000);
        
        company.hire(anna);
        company.hire(piotr);
        company.hire(ewa);
        
        Project mobileApp = new Project("Mobile App", 30);
        mobileApp.addEmployee(anna);
        mobileApp.addEmployee(piotr);
        mobileApp.addEmployee(ewa);
        
        company.startProject(mobileApp);
        company.showStatus();
        
        // Exercise 1-4: Test status changes
        mobileApp.start();
        
        mobileApp.workOneTurn();  // 1 tura pracy
        System.out.println("\n--- Putting project on hold ---");
        mobileApp.putOnHold();    // Exercise 1
        mobileApp.workOneTurn();  // nie zrobi nic (ON_HOLD)
        
        System.out.println("\n--- Resuming project ---");
        mobileApp.resume();       // Exercise 2
        
        while (!mobileApp.isFinished()) {
            mobileApp.workOneTurn();
            company.showStatus();
        }
        
        System.out.println("\n🎉 All done!");
    }
}
