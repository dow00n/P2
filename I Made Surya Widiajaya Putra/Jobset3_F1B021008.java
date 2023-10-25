
class Kendaraan3 {
    String merek;
    int jumlah;

    public Kendaraan3(String merek, int jumlah) {
        this.merek = merek;
        this.jumlah = jumlah;
    }

}

public class Jobset3_F1B021008 {
    
    public static void main(String[] args) {
        Kendaraan3 kendaraan = new Kendaraan3("Xenia", 8);
        System.out.println("Nama: " + kendaraan.merek);
        System.out.println("Jumlah: " + kendaraan.jumlah);
    }
}
