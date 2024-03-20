//nama: Al Ferro Putra Y
//NIM:24060122140164
//Nama File: bukunonFiksi.java
//Desc: superclass 2 yang mengkonstruksi tipe data buku no fiksi

package bk.bukunonFiksi;

import bk.buku.Buku;

public class bukunonFiksi extends Buku {
    protected String genre;
    protected int jumlahHalaman;
    protected double harga;

    public bukunonFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
    super(judul, penulis, tahunTerbit);
    setGenre(genre);
    setJumlahHalaman(jumlahHalaman);
    this.harga = harga;
    }

    
    public String getGnere(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }
    
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    
    public double getHarga(){
        return this.harga;
    }
    
    @Override
    public void view(){
        super.view();
        System.out.println("Genre : " + this.genre);
        System.out.println("Jumlah Halaman : " + this.jumlahHalaman); 
        System.out.println("Harga : " + this.harga);
    }
    
}