import java.util.Scanner; 


class Kecepatan {
private int hitungKecepatan;

    public Kecepatan(int jarak, int waktu) { 
        hitungKecepatan = jarak / waktu;
    }

    public int hitungKecepatan() {
        return hitungKecepatan;
    }
}


public class Jobset8_F1B021008 {
    

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Jarak tempuh: ");
        int jarak = input.nextInt();
        System.out.println("Waktu tempuh: ");
        int waktu = input.nextInt();
        Kecepatan hasil = new Kecepatan(jarak, waktu);
        System.out.println("Kecepatan tempuh: " + hasil.hitungKecepatan());
    }
}

