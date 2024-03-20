//nama: Al Ferro Putra Y
//NIM:24060122140164
//Nama File: Buku.java
//Desc: superclass 1 yang mengkonstruksi tipe data buku 
package bk.buku;

public class Buku {
    protected String judul, penulis, tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit) {
        setJudul(judul);
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    
    public void view(){
        System.out.println("Judul Buku: " + this.getJudul());
        System.out.println("Penulis Buku: " + this.getPenulis());
        System.out.println("tahun Terbit: " + this.getTahunTerbit());
    }

}