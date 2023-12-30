package sistemperpustakaan;

public class Petugas {
    private String nama;
    private String nip;
    private String jabatan;
    
    public Petugas(String nama, String nip, String jabatan) {
        this.nama = nama;
        this.nip = nip; 
        this.jabatan = jabatan;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIP() {
        return nip;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
