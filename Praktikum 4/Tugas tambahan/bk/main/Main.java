//nama: Al Ferro Putra Y
//NIM:24060122140164
//Nama File: Main.java
//Desc: main class untuk memanggil method dan menjalankan program

package bk.main;

import bk.bukunonFiksi.*;
import bk.bukuFiksi.*;

public class Main {
    public static void main(String[] args) {

        bukuFiksi novel1 = new bukuFiksi("The Dystopian Brunette", "Jhonny Sins", "2020", "Action", 100, 100000 );
        bukunonFiksi matkul1 = new bukunonFiksi("Dasar Pemrograman Java", "Grock Bambrok", "2018", "Pendidikan", 180, 120000);
       
        novel1.view();
        matkul1.view();
    }  
}
