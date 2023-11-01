/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp3_f1b021050;

import java.util.Scanner;

class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunTerbit;
    private int jumlahHalaman;
    
    public Buku(String judul, String pengarang, String penerbit, int tahunTerbit, int jumlahHalaman){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void tampilkanDetail() {
        System.out.println("Judul          : " + getJudul());
        System.out.println("Pengarang      : " + getPengarang());
        System.out.println("Penerbit       : " + getPenerbit());
        System.out.println("Tahun Terbit   : " + getTahunTerbit());
        System.out.println("Jumlah Halaman : " + getJumlahHalaman());
    }
}        

public class TugasP3_F1B021050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah buku yang ingin diinput:");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine();

        Buku[] daftarBuku = new Buku[jumlahBuku];

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan detail buku ke-" + (i+1) + ":");

            System.out.println("Masukkan judul buku:");
            String judul = scanner.nextLine();
        
            System.out.println("Masukkan nama pengarang:");
            String pengarang = scanner.nextLine();
        
            System.out.println("Masukkan nama penerbit:");
            String penerbit = scanner.nextLine();
        
            System.out.println("Masukkan tahun terbit:");
            int tahunTerbit = scanner.nextInt();
        
            System.out.println("Masukkan jumlah halaman:");
            int jumlahHalaman = scanner.nextInt();
            scanner.nextLine();

            Buku buku = new Buku(judul, pengarang, penerbit, tahunTerbit, jumlahHalaman);
            daftarBuku[i] = buku;
        }

        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println("\nDetail buku ke-" + (i+1) + ":");
            daftarBuku[i].tampilkanDetail();
        }
        
        scanner.close();
    }
}