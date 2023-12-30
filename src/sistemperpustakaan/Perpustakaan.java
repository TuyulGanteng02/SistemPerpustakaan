package sistemperpustakaan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Perpustakaan {
    private static ArrayList<Buku> daftarBuku = new ArrayList<>();
    private static ArrayList<Anggota> daftarAnggota = new ArrayList<>();
    private static ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        initData();
        while (true) {
            showMenu();
            int menu = input.nextInt();
            if (menu == 1) {
                // Pendaftaran anggota
                tambahAnggota(); 
            } else if (menu == 2) {
                // Peminjaman buku
                pinjamBuku();
            } else if (menu == 3) {
                // Pengembalian buku  
                kembalikanBuku();
            } else if (menu == 4) {
                break;
            }
        }       
    }

    public static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Pendaftaran Anggota");
        System.out.println("2. Pinjam Buku"); 
        System.out.println("3. Kembalikan Buku");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
    }
    
    private static void initData() {
        // Inisiasi data buku, anggota, dll
    }
    
    private static void tambahAnggota() {
        // Kode tambah anggota
    }
    
    private static void pinjamBuku() {
        // Kode pinjam buku oleh anggota 
    }
    
    private static void kembalikanBuku() {
        // Kode pengembalian buku 
    }
}