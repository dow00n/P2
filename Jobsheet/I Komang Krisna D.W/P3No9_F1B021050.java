import java.util.Scanner;

class potensial {
    double massa;
    double tinggi;
    double energiPotensial;
    final double gravitasi = 9.81;
 
    public potensial(double massa, double tinggi){
        energiPotensial = massa*gravitasi*tinggi;
    }

    public double getEnergiPotensial(){
        return energiPotensial;
    }
}

public class P3No9_F1B021050 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Massa benda: ");
        double massa = input.nextDouble();

        System.out.println("Tinggi     : ");
        double tinggi = input.nextDouble();

        potensial energi = new potensial(massa, tinggi);
        double hasilEnergiPotensial =energi.getEnergiPotensial();

        System.out.println("Energi Potensial: " +hasilEnergiPotensial);
    }
}     

