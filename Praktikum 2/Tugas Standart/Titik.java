//Nama: Al Ferro Putra 
//NIM: 24060122140164
//Nama File: Titik.java
//Description: Main function class untuk build access modify dari Titik

public class Titik {
    public double absis;
    public double ordinat;
    //static double counterTitik;

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public Titik() {
        this(0 ,0);
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public double getAbsis() {
        return this.absis;
    }

    public double getOrdinat() {
        return this.ordinat;
    }

    public double getJarakAwal(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
}