//Nama: AL Ferro Putra Y
//NIM: 24060122140164
//Nama File: AngkaSialException.java
//Desc: publik class yang digunakan class AngkaSial untuk mengeluarkan pesan jikalau menemui exception atau angka sama dengan 13

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan masukkan angka 13 angka sial!");
    }
}

//penjelasan: kode ini merupakan class untuk menampilkan pesan method jikalau angka inputan dari class AngkaSial merupakan angka 13