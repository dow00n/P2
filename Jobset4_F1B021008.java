class Kendaraan4 {
private String nama;
    private int jumlah;

    public Kendaraan4(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getjumlah() {
        return jumlah;
    }

    public void setjumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}


public class Jobset4_F1B021008{
    public static void main(String[] args) {
        Kendaraan4 avanza = new Kendaraan4("Avanza", 5);
        System.out.println("Nama : " + avanza.getNama());
        System.out.println("jumlah : " + avanza.getjumlah());
    }
}

