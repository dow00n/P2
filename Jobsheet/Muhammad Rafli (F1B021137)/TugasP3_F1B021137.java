package Tugasp3;

public class Pegawai {
    String nama;
    String pekerjaan;
    int usia ;
    double gaji;
    double nip;
    
    //dengan parameter
    Pegawai(String nama, String pekerjaan, int usia, double gaji, double nip){
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.usia = usia;
        this.gaji = gaji;
        this.nip = nip;
    }
    
    //tanpa parameter
    Pegawai(){
        nama = "Muhammad Rafli";
        pekerjaan = "Tambang";
        usia = 21;
        gaji = 13000000;
        nip=868628686;
    }
    public static void main(String[] args){
        Pegawai Pegawai1 = new Pegawai();
        Pegawai Pegawai2 = new Pegawai("Ronaldo", "Sepakbola", 38, 2100000, 7326463);
        
        System.out.println("nama=  "+ Pegawai1.nama);
        System.out.println("pekerjaan=  "+ Pegawai1.pekerjaan);
        System.out.println("usia=  "+ Pegawai1.usia);
        System.out.println("gajji=  "+ Pegawai1.gaji); 
        System.out.println("nip=  "+ Pegawai1.nip);
        System.out.println("=======================================\n");
        System.out.println("nama=  "+ Pegawai2.nama);
        System.out.println("pekerjaan=  "+ Pegawai2.pekerjaan);
        System.out.println("usia=  "+ Pegawai2.usia);
        System.out.println("gajji=  "+ Pegawai2.gaji); 
        System.out.println("nip=  "+ Pegawai2.nip);
    }
}
    