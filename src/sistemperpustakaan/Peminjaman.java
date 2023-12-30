package sistemperpustakaan;

import java.util.Date;

public class Peminjaman {
    private Buku buku;
    private Anggota anggota; 
    private Date tanggalPinjam;
    private Date tanggalJatuhTempo;
    private int denda;
    
    public Peminjaman(Buku buku, Anggota anggota, Date tanggalPinjam, Date tanggalJatuhTempo, int denda) {
        this.buku = buku;
        this.anggota = anggota;
        this.tanggalPinjam = tanggalPinjam; 
        this.tanggalJatuhTempo = tanggalJatuhTempo;
        this.denda = denda;
    }
    
    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }
    
    public Date getTanggalJatuhTempo() {
        return tanggalJatuhTempo;
    }

    public void setTanggalJatuhTempo(Date tanggalJatuhTempo) {
        this.tanggalJatuhTempo = tanggalJatuhTempo;
    }
    
    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        long diff = tanggalJatuhTempo.getTime() - tanggalPinjam.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        int diffBulan = (int)diffDays/30; 
        if(diffBulan > 3) {
            // Keterlambatan lebih dari 3 bulan
            int bulanTerlambat = diffBulan - 3;
            denda = bulanTerlambat * 5000;
        } else {
            denda = 0;
        }
        this.denda = denda;
    }
}