public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTInggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }
}