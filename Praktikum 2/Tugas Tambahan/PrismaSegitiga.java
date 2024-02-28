public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma){
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume(){
        return alas.hitungLuas() * this.tinggiPrisma;
    }

    public double hitungLuasPermukaan(){
        return 2 * alas.hitungLuas() + Math.sqrt((alas.getAlas() * alas.getAlas()) + (alas.getTInggiSegitiga() * alas.getTInggiSegitiga()))* this.tinggiPrisma * 3;
    }
}