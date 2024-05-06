
package latihanMedium;

/**
 *
 * @author Ferro
 */

/* Nama      : Al Ferro Putra Yusanda  */
/* NIM       : 24060122140164                 */
/* Nama File : TestSenjata.java               */

public class kontrolSenjata {
    protected Senjata s;
    
    public kontrolSenjata(Senjata s){
        this.s = s;
    }
    
    public boolean isAdaPeluru(){
        return s.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        s.setPeluru(jumPeluru);
        System.out.println(">> Pekluru berhasi ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if(s.getPeluru() == 0){
            System.out.println("Peluru Habis!");
        }else{
            for (int i = 0; i < jumlah; i++) {
            if(s.getPeluru() > 0){
                System.out.println(s.getBunyi());
                s.setPeluru(s.getPeluru()-1);
            }
            else{
                System.out.println("Gagal tembak, Peluru Habis!");
            }
        }
        System.out.println(">> Peluru Sisa : "+ s.getPeluru());  // Adding a new line for better readability in output    
    }
    }
        

    public void pasangBayonet(){
        s.setMenusuk(true);
        System.out.println("Bayonet terpasang pada senjata.");
    }

    public String menusuk() {
        if (s.isMenusuk()) {
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet! ";
        }
    }
}
