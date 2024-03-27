package org.example.views;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.management.RuntimeErrorException;
import javax.swing.text.StyledEditorKit.BoldAction;

import org.example.models.Karyawan;

public class KaryawanView {
    public void displayProducts(Map<Long, Karyawan> karyawanMap){
        // Set<Long> setId = Data.productMap.keySet();
        // displayHeader();
        // for (Long key : setId) {
        //     displayProduct(Data.productMap.get(key));
        // }
    }
    public void productForm() {
        Karyawan karyawan = new Karyawan();
        LocalDate birthdate;

        Scanner scanner = new Scanner(System.in);
        System.out.print("ID:");
        long id =  scanner.nextLong();
        scanner.nextLine();

        System.out.print("Nama:");
        String name = scanner.nextLine();

        System.out.print("Alamat:");
        String alamat  = scanner.nextLine();

        System.out.print("Status:");
        String status = scanner.nextLine();
        Karyawan.Status sts = Karyawan.Status.valueOf(status);

        System.out.print("Tanggal Lahir:");
        String tanggalLahir = scanner.nextLine();
        try {
            birthdate = LocalDate.parse(tanggalLahir);
        } catch (Exception e) {
            System.out.println("Invalid input format. Please enter the date in YYYY-MM-DD format.");
        }

        System.out.print("Penempatan:");
        String cabang  = null;
        try {
            cabang = scanner.nextLine();
            //search cabang berdasarkan input
        } catch (Exception e) {
            throw new Exception(e);
        } finally{
            if (cabang != null) {
                // return cabang;
                scanner.close();
            }else{

            }
        }
        scanner.nextLine();

        
        karyawan.setId(id)
                .setNama(name)
                .setAlamat(alamat)
                .setStatus(sts)
                .setDob(birthdate)
                .setCabang(cabang);

        // ProductController productController  = new ProductController();
        // productController.add(product);
    }
}
