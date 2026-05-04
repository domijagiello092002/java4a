package com.university.techcorp.domain;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private int requiredWork;
    private int progress;
    private List<Employee> team = new ArrayList<>();
    private ProjectStatus status = ProjectStatus.PLANNED;

    public Project(String name, int requiredWork) {
        this.name = name;
        this.requiredWork = requiredWork;
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public void start() {
        status = ProjectStatus.IN_PROGRESS;
    }

    public void putOnHold() {
        if (status == ProjectStatus.IN_PROGRESS) {
            status = ProjectStatus.ON_HOLD;
        }
    }

    public void resume() {
        if (status == ProjectStatus.ON_HOLD) {
            status = ProjectStatus.IN_PROGRESS;
        }
    }

    public void workOneTurn() {
        if (status != ProjectStatus.IN_PROGRESS) return;

        for (Employee e : team) {
            progress += e.work();
        }

        if (progress >= requiredWork) {
            progress = requiredWork;
            status = ProjectStatus.FINISHED;
        }
    }

    public boolean isFinished() {
        return status == ProjectStatus.FINISHED;
    }

    public String getName() {
        return name;
    }

    public int getRequiredWork() {
        return requiredWork;
    }

    public int getProgress() {
        return progress;
    }

    public ProjectStatus getStatus() {
        return status;
    }
}