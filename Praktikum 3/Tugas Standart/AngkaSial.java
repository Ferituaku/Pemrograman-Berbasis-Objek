//Nama: AL Ferro Putra Y
//NIM: 24060122140164
//Nama File: AngkaSial.java
//Desc: melakukan pengecekan exceptions angka 13 atau bukan

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka ==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+ " "+"bukan angka sial");
    }

    public static void main(String[] args) {
    AngkaSial as = new AngkaSial();
    try {
        as.cobaAngka(10);
        as.cobaAngka(12);
        as.cobaAngka(13);

    } catch (AngkaSialException ase) {
        System.out.println(ase.getMessage());
        System.out.println("Hati - hati memasukkan Angka");
        }
    }
}

//Penjelasan: pada kode diatas, terjadi pengecekan exception apakah angka adalah 13 atau bukan, angka pada block try di cek msuk ke cobaAngka, jika sama dengan13 maka akan throw new ke method berikutnya 
//yaitu masukke block catch, sedangkan kalau tidak sama dengan 13 maka akan print pesan dan block catch akan di skip, dan pada try akan melanjutkan pengecekan hingga ketemu exceptions