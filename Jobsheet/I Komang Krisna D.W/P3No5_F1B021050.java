class birthday {
    String hari;
    String bulan;
    int tanggal;
    int tahun;

    public birthday(String i, String bulan){ 
        this.hari = i;
        this.bulan = bulan;
    }

    public birthday(int tanggal,int tahun) {
        this.tanggal = tanggal;
        this.tahun = tahun;
    }
}

public class P3No5_F1B021050 {    
    public static void main(String[] args){
        birthday lahir1 = new birthday("Selasa","Oktober");
        birthday lahir2 = new birthday(2, 2023);

        System.out.println("=============HBD=============");
        System.out.println("Hari    : " +lahir1.hari);
        System.out.println("Tanggal : " +lahir2.tanggal);
        System.out.println("Bulan   : " +lahir1.bulan);
        System.out.println("Tahun   : " +lahir2.tahun);
        System.out.println("=============================");
    }
} 