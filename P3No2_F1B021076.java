class identitas{
    String nama;
    int kelompok;

    public identitas(String nama, int kelompok){
        this.nama = nama;
        this.kelompok = kelompok;
    }
}

/**
 *
 * @author fauza
 */
public class P3No2_F1B021076{
    public static void main(String[] args){
    identitas fzn = new identitas("Fauzan",2);

    System.out.println("Nama           : "+fzn.nama);
    System.out.println("Kelompok       : "+fzn.kelompok);
   
    }
}