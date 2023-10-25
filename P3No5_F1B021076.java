class birthday {
    String hari;
    String bulan;
    int tanggal;
    int tahun;

    public birthday(String harii, String bulan){ 
        this.hari = harii;
        this.bulan = bulan;
    }

    public birthday(int tanggal,int tahun) {
        this.tanggal = tanggal;
        this.tahun = tahun;
    }
}

public class P3No5_F1B021076 {    
    public static void main(String[] args){
        birthday lahir1 = new birthday("Senin","Desember");
        birthday lahir2 = new birthday(20, 2021);

        System.out.println(" BIRTHDAY ");
        System.out.println("Hari    : " +lahir1.hari);
        System.out.println("Tanggal : " +lahir2.tanggal);
        System.out.println("Bulan   : " +lahir1.bulan);
        System.out.println("Tahun   : " +lahir2.tahun);
    
    }
} 