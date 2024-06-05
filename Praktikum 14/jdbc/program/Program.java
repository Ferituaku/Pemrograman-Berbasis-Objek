/*Nama      : Al Ferro Putra Yusanda        */
/*Nim       : 24060122140164                */
/*Tanggal   : 4 Juni 2024                   */
/*Nama File : program.java                    */

package jdbc.program;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author alfer
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void displayAll(){
        List<Mahasiswa> listmhs = service.getAll();
        System.out.println("===All Mahasiswa===");
        for (Mahasiswa mhs : listmhs){
            System.out.println(mhs);
        }
    }
    public static void main(String[] args){
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        //insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Yono");
        service.add(mhsAdd);
        System.out.println("berhasil insert:" + mhsAdd);
        displayAll();
        
        //update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        //delete
        System.out.println("==delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
        
        
        
    }
}
