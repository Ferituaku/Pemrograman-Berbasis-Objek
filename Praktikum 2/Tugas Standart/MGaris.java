//Nama: Al Ferro Putra 
//NIM: 24060122140164
//Nama File: MGaris.java
//Description: Main function untuk output Garis / run program Garis

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(1,4);
        Titik t2 = new Titik(3,5);
        Garis g1 = new Garis(t1, t2);
        Titik tAwal = g1.getTitikAwal();
        Titik tAkhir = g1.getTitikAkhir();

        //System.out.println("t1 : (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");

        System.out.println("titik Awal : (" + tAwal.getAbsis() + "," + tAwal.getOrdinat() + ")");
        System.out.println("titik Akhir : (" + tAkhir.getAbsis() + "," + tAkhir.getOrdinat() + ")");

        System.out.println("Panjam Garis g1 : (" + g1.getPanjang() +")");
        System.out.println("Panjam Garis g1 : (" + g1.getGradien() +")");
        
        Garis GRefleksiY = g1.getRefleksiY();
        Titik tAwalRefleksiY = GRefleksiY.getTitikAwal();
        Titik tAkhirRefleksiY = GRefleksiY.getTitikAkhir();

        System.out.println("Titik Awal Refleksed: (" + tAwalRefleksiY.getAbsis() + "," + tAwalRefleksiY.getOrdinat() + ")");
        System.out.println("Titik Akhir Refleksed: (" + tAkhirRefleksiY.getAbsis() + "," + tAkhirRefleksiY.getOrdinat() + ")");

        //t1.refleksiX();
        //System.out.println("Refleksi X : (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");

        System.out.println("Garis g1 Tegak Lurus dengan garis GRefleksiY : (" + g1.isTegakLurus(GRefleksiY) + ")");
        
    
    }
}

//Kesimpulan: pada main function ini, digunakan untuk menampilkan output beberapa fungsi garis sesuai dengan garis yang telah diinput dan ter-build dengan fungsi titik sebelumnya yang memiliki access modify public, sehingga fungsi main yang mana berbeda class dapat mengaksesnya, namun jika di ubah ke private maka tidak dapat di akses dan muncul error: getGradien() has private access in Garis.
 