package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.example.models.KantorCabang;
import org.example.models.Karyawan;

public class Data {
    // public static List<Karyawan> employeeList = new ArrayList<>();
    // public static void initiateEmployee(){
    //     KantorCabang cabang1 = new KantorCabang(001, "Bandung", "Jl. Di mana mana hatiku senang");
    //     Karyawan budi = new Karyawan().setId(001).setNama("Budi")
    //         .setDob(LocalDate.now()).setAlamat("Jl. alamat palsu").setStatus("Aktif").setCabang(cabang1);

    //     employeeList.add(budi);
    // }

    public static List<Karyawan> karyawanList = new ArrayList<>();
    public static List<KantorCabang> cabangList = new ArrayList<>();
}
