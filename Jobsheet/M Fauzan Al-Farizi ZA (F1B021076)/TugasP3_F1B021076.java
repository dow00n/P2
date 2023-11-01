public class TugasP3_F1B021076 {
    private String nama;
    private String alamat;
    private String npwp;
    private double penghasilanTahunan;
    private double potonganPajak;


    public TugasP3_F1B021076(String nama) {
        this.nama = nama;

    }


    public TugasP3_F1B021076(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;

    }


    public TugasP3_F1B021076(String nama, String alamat, String npwp) {
        this.nama = nama;
        this.alamat = alamat;
        this.npwp = npwp;

    }


    public TugasP3_F1B021076(String nama, String alamat, String npwp, double penghasilanTahunan) {
        this.nama = nama;
        this.alamat = alamat;
        this.npwp = npwp;
        this.penghasilanTahunan = penghasilanTahunan;

    }


    public TugasP3_F1B021076(String nama, String alamat, String npwp, double penghasilanTahunan, double potonganPajak) {
        this.nama = nama;
        this.alamat = alamat;
        this.npwp = npwp;
        this.penghasilanTahunan = penghasilanTahunan;
        this.potonganPajak = potonganPajak;
    }


    public void tampilkanInformasi() {
        System.out.println("Informasi Pendataan Pajak:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NPWP: " + npwp);
        System.out.println("Penghasilan Tahunan: " + penghasilanTahunan);
        System.out.println("Potongan Pajak: " + potonganPajak);
    }

    public static void main(String[] args) {
        TugasP3_F1B021076 pendataan1 = new TugasP3_F1B021076("Fauzan");
        TugasP3_F1B021076 pendataan2 = new TugasP3_F1B021076("Krisna", "Jl. Raya No. 123");
        TugasP3_F1B021076 pendataan3 = new TugasP3_F1B021076("Surya", "Jl. Sudirman No. 456", "1234567890");
        TugasP3_F1B021076 pendataan4 = new TugasP3_F1B021076("Rafli", "Jl. Thamrin No. 789", "0987654321", 5000000.0);
        TugasP3_F1B021076 pendataan5 = new TugasP3_F1B021076("Jack", "Jl. Kebon Sirih No. 101", "1357924680", 2000000.0, 10000.0);

        pendataan1.tampilkanInformasi();
        System.out.println();

        pendataan2.tampilkanInformasi();
        System.out.println();

        pendataan3.tampilkanInformasi();
        System.out.println();

        pendataan4.tampilkanInformasi();
        System.out.println();

        pendataan5.tampilkanInformasi();
      
    }
}

