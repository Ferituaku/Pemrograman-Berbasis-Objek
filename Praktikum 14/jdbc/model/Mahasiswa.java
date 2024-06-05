/*Nama      : Al Ferro Putra Yusanda        */
/*Nim       : 24060122140164                */
/*Tanggal   : 4 Juni 2024                   */
/*Nama File : Model.java                 */
package jdbc.model;

/**
 *
 * @author alfer
 */
public class Mahasiswa {

    private int id;
    private String nama;
    
    
    public Mahasiswa(){
    }
    
    public Mahasiswa(int id,String nama) {
       this.id = id;
       this.nama = nama;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id; 
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa { "+"id= "+ id +", nama= "+ nama + "}";
    }
}
