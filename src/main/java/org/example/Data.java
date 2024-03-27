package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.models.KantorCabang;
import org.example.models.Karyawan;

public class Data {
     public static List<Karyawan> employeeList = new ArrayList<>();
    public static Map<Long, Karyawan> karyawanMap = new HashMap<>();
     public static void initiateEmployee(){
         KantorCabang bandung = new KantorCabang(001, "Bandung", "Jl. Di mana mana hatiku senang");
         KantorCabang surabaya = new KantorCabang(002, "Surabaya", "Jl. Di mana mana hatiku senang 2");

         Karyawan budi = new Karyawan().setId(001).setNama("Budi")
             .setDob(LocalDate.of(2001, 01,01))
             .setAlamat("Jl. alamat palsu 1")
             .setStatus(Karyawan.Status.AKTIF)
             .setCabang(bandung);

         Karyawan heru = new Karyawan().setId(002).setNama("Heru")
                 .setDob(LocalDate.of(2002, 02,02))
                 .setAlamat("Jl. alamat palsu 2")
                 .setStatus(Karyawan.Status.AKTIF)
                 .setCabang(bandung);

         employeeList.add(budi);
         employeeList.add(heru);


         karyawanMap.put(budi.getId(), budi);
         karyawanMap.put(heru.getId(), heru);
     }

}
