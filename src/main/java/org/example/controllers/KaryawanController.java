package org.example.controllers;

import org.example.Service.KaryawanService;
import org.example.Service.KaryawanServiceImpl;
import org.example.views.KaryawanView;
import org.example.views.MainMenu;

public class KaryawanController {
    public void mainMenu() {
//        displayKaryawan();

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
            //todo ubah
        } else if (selectedMenu==4) {
            //todo hapus
        }
    }

//    public void displayKaryawan(){
//        KaryawanService ps = new KaryawanServiceImpl();
//        Map<Long, Product> productMap = ps.getProductList();
//
//        ProductView pv = new ProductView();
//        pv.displayProducts(productMap);
//    }

}
