package com.university.techcorp.engine;

import com.university.techcorp.domain.Company;
import com.university.techcorp.domain.Project;
import com.university.techcorp.ui.ConsoleUI;

public class GameEngine {

    private Company company;
    private ConsoleUI ui;
    private int turn = 1;
    private boolean running = true;

    public GameEngine(Company company, ConsoleUI ui) {
        this.company = company;
        this.ui = ui;
    }

    public void run() {
        while (running) {

            ui.showTurn(turn);
            ui.showCompanyStatus(company);
            ui.showMenu();

            int choice = ui.readChoice();

            switch (choice) {
                case 1:
                    workOneTurn();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    break;
            }

            turn++;
        }
    }

    private void workOneTurn() {
        for (Project p : company.getProjects()) {
            p.workOneTurn();
        }
    }
}