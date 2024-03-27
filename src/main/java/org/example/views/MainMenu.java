package org.example.views;

import org.example.controllers.KaryawanController;

import java.util.Scanner;

public class MainMenu {
    public void displayMainMenu(){
        System.out.println("""
                \nEMPLOYEE APPLICATION
                ===========================
                1. Display All Employee Data
                2. Store Employee Data
                3. Change Employee Data
                4. Delete Employee Data
                """);
        System.out.print("> Select Menu: ");
        Scanner scanner = new Scanner(System.in);
        int selectedMenu =  scanner.nextInt();
        KaryawanController kc = new KaryawanController();
        kc.menuSelection(selectedMenu);
    }
}
