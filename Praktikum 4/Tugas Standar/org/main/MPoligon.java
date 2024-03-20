//Nama: Al Ferro Putra Y
//NIM:24060122140164
//Nama File: PersegiPanjang.java
//Desc: class main untuk menjalankan program dan memanggil class method


package prak4.org.main;
import prak4.org.bangundatar.*;

public class MPoligon {
    public static void main(String [] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 15, 4);
        Segitiga segitiga = new Segitiga(5, 9, 3);

        persegi.printInfo();
        System.out.println("Luas persegi adalah: " + persegi.hitungLuas());

        segitiga.InfoSegitiga();
        System.out.println("Luas segitiga adalah: " + segitiga.hitungLuas());


    }   
}
