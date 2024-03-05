//Nama: AL Ferro Putra Y
//NIM: 24060122140164
//Nama File: Asersi.java
//Desc: class pengecekan angka positif atau negatif dengan assersi

public class Asersi {
    public static void main (String[] args){
        int x = 0;
        if(x > 0){
            System.out.println("nilai x bilangan positif = " + x);
        }else{
            assert(x < 0) : "Kesalahan Kode";
            System.out.println("x bilangan negatif");
        }
    }
}
