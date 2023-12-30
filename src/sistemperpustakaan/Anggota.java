package sistemperpustakaan;

import java.util.Date;

public class Anggota {
    private String nama;
    private String alamat;
    private Date tanggalBergabung;
    
    public Anggota(String nama, String alamat, Date tanggalBergabung) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalBergabung = tanggalBergabung;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTanggalBergabung() {
        return tanggalBergabung;
    }

    public void setTanggalBergabung(Date tanggalBergabung) {
        this.tanggalBergabung = tanggalBergabung;
    }
}
