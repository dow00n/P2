import java.util.Scanner;

class game{
    String nama;
    int tahun_produksi;

    public game(String nama) {
        this.nama = nama;
    }

    public game(int tahun_produksi) {
        this.tahun_produksi = tahun_produksi;
    } 
}

public class P3No6_F1B021076{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama Game: ");
        String nama = input.nextLine();
        
        System.out.println("Tahun Produksi: ");
        int tahun_produksi = input.nextInt();

    
        System.out.println("Nama Game     :"+nama);
        System.out.println("Tahun Produksi:"+tahun_produksi);
    
    }
} 
