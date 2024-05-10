package Tugasprak8;



/**
 * Nama: Al Ferro Putra Yusanda
 * NIM: 24060122140164
 * Nama File: MainTest.java
 */

public class MainTest {
    public static void main(String[] args){
        Kupu K = new Ulat();
        Data<Kupu> anu = new Data<Kupu>();
        
        anu.setIsi(K);
        System.out.println("Gerak Ulat: " + anu.getIsi().gerak());
        
        anu.setIsi(new Kepompong());
        System.out.println("Gerak Kepompong: " + anu.getIsi().gerak());
        
        anu.setIsi(new KupuDewasa());
        System.out.println("Gerak Kupu Dewasa: " + anu.getIsi().gerak());
        
    }
}
