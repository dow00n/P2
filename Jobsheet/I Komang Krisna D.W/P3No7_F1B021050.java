import java.util.Scanner;

class debit {
    int volume;
    int waktu;
    int hitungDebit;

    public debit(int volume, int waktu){
        hitungDebit = volume/waktu;
    }
    
    public int hitungDebit(){
        return hitungDebit;
    }
}

public class P3No7_F1B021050{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Volume Air: ");
        int volume = input.nextInt();

        System.out.println("Waktu     : ");
        int waktu = input.nextInt();
        
        debit nilai = new debit(volume, waktu);
        System.out.println("Debit Air : " +nilai.hitungDebit);
    }
} 