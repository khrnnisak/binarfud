package org.example.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Karyawan {
    private long id;
    private String nama, alamat;
    private Status status;
    private LocalDate dob;
    private KantorCabang cabang;

    public enum Status{
        AKTIF(1), TIDAKAKTIF(2), CUTI(3);

        private int value;

        Status(int value) {
            this.value=value;
        }
    }

}
