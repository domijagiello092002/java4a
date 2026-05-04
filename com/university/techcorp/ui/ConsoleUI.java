package com.university.techcorp.ui;

import com.university.techcorp.domain.Company;
import com.university.techcorp.domain.Project;
import java.util.Scanner;

public class ConsoleUI {

    private Scanner scanner = new Scanner(System.in);

    public void showTurn(int turn) {
        System.out.println("\n=== TURN " + turn + " ===");
    }

    public void showMenu() {
        System.out.println("1. Work one turn");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
    }

    public int readChoice() {
        return scanner.nextInt();
    }

    public void showCompanyStatus(Company company) {
        company.showStatus();
    }

    public void showProjects(Company company) {
        for (Project p : company.getProjects()) {
            System.out.println(p.getName() + " | " + p.getStatus());
        }
    }
}