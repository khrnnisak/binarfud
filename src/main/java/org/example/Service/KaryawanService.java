package org.example.Service;

import org.example.models.KantorCabang;
import org.example.models.Karyawan;

import java.util.List;
import java.util.Map;

public interface KaryawanService {
    int getTotalKaryawan();
    int getTotalKaryawan(KantorCabang kantorCabang);

    Map<Long, Karyawan> getKaryawanList();

    List<Karyawan> getKaryawanList(KantorCabang kantorCabang);

    Karyawan create(Karyawan karyawan);
}
