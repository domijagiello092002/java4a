package com.university.techcorp;

import com.university.techcorp.domain.*;
import com.university.techcorp.engine.GameEngine;
import com.university.techcorp.ui.ConsoleUI;

public class Main {

    public static void main(String[] args) {

        Company company = new Company("TechCorp", 50000);

        Employee a = new Developer("Anna", 9, 8000);
        Employee b = new Tester("Piotr", 6, 6500);
        Employee c = new Manager("Ewa", 7, 9000);

        Project p = new Project("Mobile App", 30);

        p.addEmployee(a);
        p.addEmployee(b);
        p.addEmployee(c);

        company.hire(a);
        company.hire(b);
        company.hire(c);

        company.startProject(p);
        p.start();

        ConsoleUI ui = new ConsoleUI();
        GameEngine engine = new GameEngine(company, ui);

        engine.run();
    }
}