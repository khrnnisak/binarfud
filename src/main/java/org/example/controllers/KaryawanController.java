package org.example.controllers;

import org.example.Service.KaryawanService;
import org.example.Service.KaryawanServiceImpl;
import org.example.models.Karyawan;
import org.example.views.KaryawanView;
import org.example.views.MainMenu;

import java.util.Map;

public class KaryawanController {
    public void mainMenu() {
        MainMenu menuView = new MainMenu();
        menuView.displayMainMenu();
    }

    public void menuSelection(int selectedMenu){
        if (selectedMenu==1) {
            displayKaryawan();
        } else if(selectedMenu==2){
            KaryawanView karyawanView = new KaryawanView();
            karyawanView.karyawanForm();
        } else if (selectedMenu==3) {
            //TODO: Fitur ubah data
        } else if (selectedMenu==4) {
            //TODO: Fitur hapus data
        }
    }

    public void displayKaryawan(){
        KaryawanService ks = new KaryawanServiceImpl();
        Map<Long, Karyawan> karyawanMap = ks.getKaryawanList();

        KaryawanView kv = new KaryawanView();
        kv.displayProducts(karyawanMap);
    }

    public void add(Karyawan karyawan) {
        KaryawanService karyawanService = new KaryawanServiceImpl();
        karyawanService.create(karyawan);

        mainMenu();
    }
}
