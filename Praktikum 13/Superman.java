/*Nama      : Al Ferro Putra Yusanda        */
/*Nim       : 24060122140164                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : Superman.java                 */


public class Superman {

    public String nama;

    public Superman (String nama){
        this.nama = nama;
    }

    public getNama(){
        return this.nama;
    }

    public String takeOff(){
        System.out.println(nama + " mau terbang");
    }

    public String land(){
        System.out.println(nama + " mau mendarat");
    }

    public String fly(){
        System.out.println(nama + " sedang terbang");
    }

    public String leapBuilding(){
        System.out.println(nama + " sedang melompati gedung");
    }

    public void stopBullet(){
        System.out.println(nama + " sedang menghentikan peluru");
    }

    public void eat(){
        System.out.println(nama + " sedang makan");
    }
}
