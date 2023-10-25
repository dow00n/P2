import java.util.Scanner;

class Potensial {
    private double energiPotensial;
    final double gravitasi = 9.81;

    public Potensial(double massa, double tinggi) {
        energiPotensial = massa * gravitasi * tinggi;
    }

    public double getEnergiPotensial() {
        return energiPotensial;
    }
}

public class Jobset9_F1B021008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Massa benda: ");
        double massa = input.nextDouble();
        System.out.println("Tinggi: ");
        double tinggi = input.nextDouble();
        Potensial energi = new Potensial(massa, tinggi);
        double hasilEnergiPotensial = energi.getEnergiPotensial();
        System.out.println("Energi Potensial: " + hasilEnergiPotensial);
    }
}


