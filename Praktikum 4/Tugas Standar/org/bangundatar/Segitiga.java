//Nama: Al Ferro Putra Y
//NIM:24060122140164
//Nama File: PersegiPanjang.java
//Desc: class construct bangun segitiga

package prak4.org.bangundatar;
import prak4.org.poligon.Poligon;


public class Segitiga extends Poligon {
    private double alas, tinggi;

        public Segitiga(double alas, double tinggi, int JumlahSisi) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.JumlahSisi = JumlahSisi;
        }

        public double getAlas() {
            return alas;
        }

        public double getTinggi() {
            return tinggi;
        }

        public double hitungLuas(){
            return (alas*tinggi)/2;
        }

        public void InfoSegitiga(){
            System.out.println("Alas : " + alas);
            System.out.println("Tinggi : " + tinggi);
            System.out.println("Luas : " + hitungLuas());
            System.out.println("Bangun Segitiga bersisi "+ this.getJumlahSisi());

        }
}
