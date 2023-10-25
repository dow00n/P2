import java.util.Scanner; 

class Kendaraan6 {
String nama;
    int jumlah;

    public Kendaraan6() {
        this.nama = nama;
    }

    public Kendaraan6(String nama, int jumlah) { 
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public void tampil(){
        System.out.println("Nama : " + nama );
        System.out.println("Jumlah : " + jumlah );
    }
}

public class Jobset6_F1B021008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nama Kendaraan6: ");
        String nama = input.nextLine();

        System.out.println("jumlah Kendaraan6: ");
        int jumlah = input.nextInt();

        Kendaraan6 Kendaraan = new Kendaraan6(nama, jumlah);  
        
        Kendaraan.tampil();
}

}
