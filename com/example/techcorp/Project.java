package com.example.techcorp;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private int requiredWork;
    private int progress;
    private List<Employee> team;
    private ProjectStatus status;

    public Project(String name, int requiredWork) {
        validateName(name);
        validateRequiredWork(requiredWork);
        this.name = name;
        this.requiredWork = requiredWork;
        this.progress = 0;
        this.team = new ArrayList<>();
        this.status = ProjectStatus.PLANNED;
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null.");
        }
        team.add(employee);
    }

    // Exercise 1: putOnHold()
    public void putOnHold() {
        if (status == ProjectStatus.IN_PROGRESS) {
            status = ProjectStatus.ON_HOLD;
            System.out.println("⏸️ Project '" + name + "' put on hold.");
        }
    }

    // Exercise 2: resume()
    public void resume() {
        if (status == ProjectStatus.ON_HOLD) {
            status = ProjectStatus.IN_PROGRESS;
            System.out.println("▶️ Project '" + name + "' resumed.");
        }
    }

    public void start() {
        if (status == ProjectStatus.PLANNED) {
            status = ProjectStatus.IN_PROGRESS;
            System.out.println("📢 Project '" + name + "' started.");
        }
    }

    public void cancel() {
        if (status != ProjectStatus.FINISHED) {
            status = ProjectStatus.CANCELLED;
            System.out.println("❌ Project '" + name + "' cancelled.");
        }
    }

    // Exercise 3: workOneTurn() with status check
    public void workOneTurn() {
        if (status != ProjectStatus.IN_PROGRESS) {
            return;  // Exercise 3: Prevent illegal work
        }

        for (Employee employee : team) {
            progress += employee.work();
        }

        if (progress >= requiredWork) {
            progress = requiredWork;
            status = ProjectStatus.FINISHED;
            System.out.println("✅ Project '" + name + "' finished!");
        }
    }

    public boolean isFinished() {
        return status == ProjectStatus.FINISHED;
    }

    public String getName() { return name; }
    public int getRequiredWork() { return requiredWork; }
    public int getProgress() { return progress; }
    public List<Employee> getTeam() { return team; }
    public ProjectStatus getStatus() { return status; }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Project name cannot be null or blank.");
        }
    }

    private void validateRequiredWork(int requiredWork) {
        if (requiredWork <= 0) {
            throw new IllegalArgumentException("Required work must be greater than 0.");
        }
    }
}
