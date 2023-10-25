class nilai{
    String mk;
    int nilai_mk;

    nilai(String mk,int nilai_mk){
        this.mk = mk;
        this.nilai_mk = nilai_mk;
    }
}

public class P3No3_F1B021050 {
    public static void main(String[] args){
        nilai mk1 = new nilai("Matematika Diskrit", 79);

        System.out.println("===================================");
        System.out.println("Mata Kuliah    : "+mk1.mk);
        System.out.println("Nilai          : "+mk1.nilai_mk);
        System.out.println("===================================");
    }
}
