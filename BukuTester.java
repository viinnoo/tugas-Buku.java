public class BukuTester {
 public static void main(String[] args) {
        Buku jualBeli = new Buku(1, "howToJualBeliLikeAPro", "choqie", 1987);
        Buku ternak = new Buku(2, "tipsAndTrickTernak", "gusLurus", 2025);
        Buku akbarGoyang = new Buku(3, "caraAkbarGoyang", "akbarBangkuDepan", 800);
        Buku ariSukaAnu = new Buku(4, "menceritakanAriYangAnu", "ariHawari", 1945);
        Buku belajarBahasaMadura = new Buku(5, "belajarBahasaMadura", "adlyBangkuTengah", 2009);

        //jualBeli

        System.out.println(jualBeli.id);
        System.out.println(jualBeli.judul);
        System.out.println(jualBeli.pengarang);
        System.out.println(jualBeli.tahunTerbit);

        //ternak
        
        System.out.println(ternak.id);
        System.out.println(ternak.judul);
        System.out.println(ternak.pengarang);
        System.out.println(ternak.tahunTerbit);

        //akbarGoyang

        System.out.println(akbarGoyang.id);
        System.out.println(akbarGoyang.judul);
        System.out.println(akbarGoyang.pengarang);
        System.out.println(akbarGoyang.tahunTerbit);

        //ariSukaAnu

        System.out.println(ariSukaAnu.id);
        System.out.println(ariSukaAnu.judul);
        System.out.println(ariSukaAnu.pengarang);
        System.out.println(ariSukaAnu.tahunTerbit);

        //belajarBahasaMadura

        System.out.println(belajarBahasaMadura.id);
        System.out.println(belajarBahasaMadura.judul);
        System.out.println(belajarBahasaMadura.pengarang);
        System.out.println(belajarBahasaMadura.tahunTerbit);
    }
    
}
