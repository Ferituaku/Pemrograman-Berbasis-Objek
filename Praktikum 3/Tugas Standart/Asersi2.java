//Nama: AL Ferro Putra Y
//NIM: 24060122140164
//Nama File: Asersi2.java
//Desc: class untuk menghitung keliling lingkaran menggunakan assersi jika jari jari 0 atau diatas nol


import static java.lang.Math.PI;

class Lingkaran {
    private double jejari;
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungkeliling(){
        double keliling = 2 * PI * jejari * jejari;
        return keliling;
    }
}


public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0) : "jariJari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari); 
        double kelilingLingkaran = l.hitungkeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
