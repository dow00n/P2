class mobil {
    private String nama;
    private int tahun;

    public mobil() {
        nama = "Avanza";
    }
 
    public mobil(int tahun) {
        this.tahun = tahun;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getTahun(){
        return tahun;
    }

    public void setTahun(int tahun){
        this.tahun = tahun;
    }
}


public class P3No4_F1B021050 {
        public static void main(String[] args){
        mobil mobil1 = new mobil();
        mobil mobil2 = new mobil(2017);

        System.out.println("====================");
        System.out.println("Jenis Mobil: " +mobil1.getNama());
        System.out.println("Tahun Mobil: " +mobil2.getTahun());
        System.out.println("====================");
    }
} 