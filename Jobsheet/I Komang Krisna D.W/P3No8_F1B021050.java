import java.util.Scanner;

class kecepatan {
    int jarak;
    int waktu;
    int hitungKecepatan;

    public kecepatan(int jarak, int waktu){
        hitungKecepatan = jarak/waktu;
    }

    public int hitungKecepatan(){
        return hitungKecepatan;
    }
}

public class P3No8_F1B021050 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Jarak tempuh: ");
        int jarak = input.nextInt();

        System.out.println("Waktu tempuh: ");
        int waktu = input.nextInt();

        kecepatan hasil = new kecepatan(jarak,waktu);
        System.out.println("Kecepatan tempuh: " +hasil.hitungKecepatan());
    }
} 