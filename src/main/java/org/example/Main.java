package org.example;

import org.example.controllers.KaryawanController;

public class Main {
    public static void main(String[] args) {
        
         Data.initiateEmployee();
         KaryawanController kc = new KaryawanController();
         kc.mainMenu();




//         for(Karyawan k:Data.employeeList){
//             System.out.println("Id Karyawan : "+k.getId());
//             System.out.println("Nama Karyawan : "+k.getNama());
//             System.out.println("Alamat Karyawan : "+k.getAlamat());
//             System.out.println("Status Karyawan : "+k.getStatus());
//             System.out.println("Tanggal Lahir Karyawan : "+k.getDob());
//             System.out.println("Penempatan: "+k.getCabang().getAlamat());
//         }
    }
}