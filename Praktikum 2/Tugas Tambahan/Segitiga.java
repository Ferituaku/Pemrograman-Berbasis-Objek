//Nama: Al Ferro Putra Yusanda
//NIM: 24060122140164
//Nama File: Segitiga.java
//Desc: Fungsi method dan atribut yang menyusun segitiga (hitung luas alas)

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
