
class Kendaraan2 {
    int jumlah;
    String merek;

    public Kendaraan2(int jumlah, String merek) {
        this.jumlah = jumlah;
        this.merek = merek;
    }
}

public class Jobset2_F1B021008 {
    public static void main(String[] args) {
        Kendaraan2 avanza = new Kendaraan2(5, "toyota");
        System.out.println("Jumlah : " + avanza.jumlah);
        System.out.println("Merek : " + avanza.merek);
    }
}


