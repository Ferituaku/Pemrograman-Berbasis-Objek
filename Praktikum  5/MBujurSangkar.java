//Nama: AL Ferro Putra Y
//NIM: 24060122140164
//Nama File: MBujurSangkar.java
//Desc: class untuk menjalankan program dan memanggil method class lain


import java.util.Scanner;

class MBujurSangkar{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar BS = new BujurSangkar();
        System.out.println("masukkan sisi : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas Permukaan Bujur Sangkar dengan sisi " + sisi+ " adalah " + BS.hitungLuas(sisi));
    }
}

//penjelasan: pada class ini dilakukan running program yang meminta user menginput lewat scanner yang ada, yang mana inputan tersebut masukke variable sisi, sisi tersebut dibutuhkan instance BujurSangkar 
//untuk menjalankan method berupa hitungLuas(). Yang pada class ini, dipanggil method nya dengan diawali dengan instansiasi BS subclass (BS.hitungLuas(sisi)).)