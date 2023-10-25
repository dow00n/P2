
import java.util.Scanner; 

class Debit1 {
private int hitungDebit; 
    public Debit1(int volume, int waktu) {
        hitungDebit = volume / waktu;
    }

    public int hitungDebit() {
        return hitungDebit;
    }
}



public class Jobset7_F1B021008 {
    

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Volume air: ");
        int volume = input.nextInt(); 
        System.out.println("Waktu: ");
        int waktu = input.nextInt();

        Debit1 nilai = new Debit1(volume, waktu);
        System.out.println("Debit air: " + nilai.hitungDebit());
    }
}
