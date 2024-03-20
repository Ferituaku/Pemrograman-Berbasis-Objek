//Nama: Al Ferro Putra Y
//NIM:24060122140164
//Nama File: PersegiPanjang.java
//Desc: class construct bangun persegi panjang

package prak4.org.bangundatar;
import prak4.org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang,lebar;
    
    public PersegiPanjang(double panjang, double lebar, int JumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.JumlahSisi = JumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi bersisi "+ this.getJumlahSisi());
        System.out.println("Panjang: "+ this.getPanjang() + "Lebar: "+ this.getLebar());
    }
}
