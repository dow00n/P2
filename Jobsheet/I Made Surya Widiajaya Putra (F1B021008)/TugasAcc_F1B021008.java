class Tanaman {
        String nama;
        String jenis;
        int usia;
        String habitat;
        boolean berbunga;

        Tanaman(String nama, String jenis, int usia, String habitat, boolean berbunga) {
            this.nama = nama;
            this.jenis = jenis;
            this.usia = usia;
            this.habitat = habitat;
            this.berbunga = berbunga;
        }
    
        void tampilkan() {
            System.out.println("Nama: " + nama);
            System.out.println("Jenis: " + jenis);
            System.out.println("Usia: " + usia + " tahun");
            System.out.println("Habitat: " + habitat);
            System.out.println("Berbunga: " + (berbunga ? "Ya" : "Tidak"));
        }
    }

public class TugasAcc_F1B021008 {
        public static void main(String[] args) {
            
            Tanaman tanaman1 = new Tanaman("Mawar", "Bunga", 2, "Taman", true);
            Tanaman tanaman2 = new Tanaman("Pohon Mangga", "Pohon Buah", 5, "Kebun", false);
    
            
            System.out.println("Tanaman 1:");
            tanaman1.tampilkan();
    
            System.out.println("\nTanaman 2:");
            tanaman2.tampilkan();
        }
}
    
