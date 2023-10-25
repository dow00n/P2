class identitas{
    String nama;
    int kelompok;

    public identitas(String nama, int kelompok){
        this.nama = nama;
        this.kelompok = kelompok;
    }
}

public class P3No2_F1B021050{
    public static void main(String[] args){
    identitas kris = new identitas("Krisna",2);

    System.out.println("=============================");
    System.out.println("Nama Mahasiswa : "+kris.nama);
    System.out.println("Kelompok       : "+kris.kelompok);
    System.out.println("=============================");
    }
}