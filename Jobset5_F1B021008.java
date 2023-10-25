
class Kendaraan5 {
    String nama;
    String merek;
    int jumlah;
    int tahun;
public Kendaraan5(String nama, String merek) {
        this.merek = merek;
        this.nama = nama;
    }

    public Kendaraan5(int jumlah, int tahun) {
        this.jumlah = jumlah;
        this.tahun = tahun;
    }
}

public class Jobset5_F1B021008 {

    public static void main(String[] args) {
        Kendaraan5 lahir1 = new Kendaraan5("Xenia", "Daihatsu");
        Kendaraan5 lahir2 = new Kendaraan5(6, 2019);
        System.out.println("nama: " + lahir1.nama);
        System.out.println("jumlah: " + lahir2.jumlah);
        System.out.println("merek: " + lahir1.merek);
        System.out.println("Tahun: " + lahir2.tahun);
    }
}

