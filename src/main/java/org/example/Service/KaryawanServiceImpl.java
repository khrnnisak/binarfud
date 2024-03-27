package org.example.Service;

import org.example.Data;
import org.example.models.KantorCabang;
import org.example.models.Karyawan;

import java.util.List;
import java.util.Map;

public class KaryawanServiceImpl implements KaryawanService {

    @Override
    public int getTotalKaryawan() {
        return Data.karyawanMap.size();
    }

    @Override
    public int getTotalKaryawan(KantorCabang kantorCabang) {
        return 0;
    }

    @Override
    public Map<Long, Karyawan> getKaryawanList() {
        return Data.karyawanMap;
    }

    @Override
    public List<Karyawan> getKaryawanList(KantorCabang kantorCabang) {
        return null;
    }

    @Override
    public Karyawan create(Karyawan karyawan) {
        return Data.karyawanMap.put(karyawan.getId(), karyawan);
    }
}
