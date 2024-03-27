package org.example.controllers;

import org.example.views.KaryawanView;

public class Karyawan {
    public void menuSelection(int selectedMenu){
        if(selectedMenu==1){
            KaryawanView karyawanView = new KaryawanView();
            karyawanView.productForm();

        } else if (selectedMenu==2) {
            //todo ubah
        } else if (selectedMenu==3) {
            //todo hapus
        }
    }

}
