package org.example.views;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.management.RuntimeErrorException;
import javax.swing.text.StyledEditorKit.BoldAction;

import org.example.controllers.KaryawanController;
import org.example.models.Karyawan;

public class KaryawanView {
    public void displayProducts(Map<Long, Karyawan> karyawanMap){
        Set<Long> setId = karyawanMap.keySet();
        displayHeader();
        for (Long key : setId) {
            displayProduct(karyawanMap.get(key));
        }
    }

    private void displayHeader(){
        System.out.println("ID | Nama | Alamat | Status | Tanggal Lahir");
        System.out.println("===========================================");
    }

    private void displayProduct(Karyawan karyawan){
        System.out.println(karyawan.getId()+" | "+karyawan.getNama()+" | "+karyawan.getAlamat()+" | "+karyawan.getStatus()+" | "+karyawan.getDob()+" | "); //+karyawan.getCabang().getKota()
    }

    public void karyawanForm() {
        Karyawan karyawan = new Karyawan();
        LocalDate birthdate;

        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        long id =  scanner.nextLong();
        scanner.nextLine();

        System.out.print("Nama: ");
        String name = scanner.nextLine();

        System.out.print("Alamat: ");
        String alamat  = scanner.nextLine();

        System.out.print("Status (AKTIF, TIDAKAKTIF, CUTI): ");
        String status = scanner.nextLine();
        Karyawan.Status sts = Karyawan.Status.valueOf(status);

        System.out.print("Tanggal Lahir (YYYY-MM-DD): ");
        String tanggalLahir = null;
        try {
            tanggalLahir = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input format. Please enter the date in YYYY-MM-DD format.");
        } finally {
            birthdate = LocalDate.parse(tanggalLahir);
        }

        //TODO: Add Kantor Cabang untuk karyawan
//        System.out.print("Penempatan: ");
//        String cabang  = scanner.nextLine();
//        try {
//            cabang = scanner.nextLine();
//            //search cabang berdasarkan input
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally{
//            if (cabang != null) {
//                // return cabang;
//                scanner.close();
//            }else{
//
//            }
//        }


        karyawan.setId(id)
                .setNama(name)
                .setAlamat(alamat)
                .setStatus(sts)
                .setDob(birthdate);

         KaryawanController karyawanController  = new KaryawanController();
         karyawanController.add(karyawan);
    }
}
