package com.university.techcorp.domain;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private double cash;
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public Company(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }

    public void hire(Employee e) {
        employees.add(e);
    }

    public void startProject(Project p) {
        projects.add(p);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public double getCash() {
        return cash;
    }

    public void reduceCash(double amount) {
        cash -= amount;
    }

    public void showStatus() {
        System.out.println("Company: " + name);
        System.out.println("Cash: " + cash);
        System.out.println("Employees: " + employees.size());
        System.out.println("Projects: " + projects.size());
    }
}