import java.util.Scanner;

class buku{
    String judul;
    int halaman;

    public buku(String judul) {
        this.judul = judul;
    }

    public buku(int halaman) {
        this.halaman = halaman;
    } 
}

public class P3No6_F1B021050{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Judul buku: ");
        String judul = input.nextLine();
        
        System.out.println("Halaman buku: ");
        int halaman = input.nextInt();

        System.out.println("=================================");
        System.out.println("Judul Buku  :"+judul);
        System.out.println("Halaman Buku:"+halaman);
        System.out.println("=================================");
    }
} 