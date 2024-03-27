package org.example.views;

import org.example.controllers.KaryawanController;

import java.util.Scanner;

public class MainMenu {
    public void displayMainMenu(){
        System.out.println("""
                1. Tampilkan Semua
                2. Tambah Karyawan
                3. Ubah Karyawan
                4. Hapus Karyawan
                """);
        System.out.print("Silakan Pilih Menu: ");
        Scanner scanner = new Scanner(System.in);
        int selectedMenu =  scanner.nextInt();
        KaryawanController kc = new KaryawanController();
        kc.menuSelection(selectedMenu);
    }
}
