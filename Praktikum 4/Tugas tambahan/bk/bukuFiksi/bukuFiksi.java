//nama: Al Ferro Putra Y
//NIM:24060122140164
//Nama File: Buku.java
//Desc: superclass 2 yang mengkonstruksi tipe data nuku fiksi 

package bk.bukuFiksi;
import bk.buku.Buku;

public class bukuFiksi extends Buku{
    protected String genre;
    protected int jumlahHalaman;
    protected double harga;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
    super(genre, penulis, tahunTerbit);
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
