package org.example;

import org.example.controllers.KaryawanController;

public class Main {
    public static void main(String[] args) {
        
         Data.initiateEmployee();
         KaryawanController kc = new KaryawanController();
         kc.mainMenu();

    }
}