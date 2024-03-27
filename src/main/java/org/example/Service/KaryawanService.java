package org.example.Service;

import org.example.models.Karyawan;

import java.util.List;

public interface KaryawanService {
    List<Karyawan> getKaryawanList(Karyawan karyawan);

    Karyawan create(Karyawan karyawan);
}
