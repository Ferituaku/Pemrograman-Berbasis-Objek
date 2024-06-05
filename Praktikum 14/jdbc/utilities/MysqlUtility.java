/*Nama      : Al Ferro Putra Yusanda        */
/*Nim       : 24060122140164                */
/*Tanggal   : 4 Juni 2024                   */
/*Nama File : MysqlUtility.java             */

package jdbc.utilities;
import java.sql.*;

/**
 *
 * @author alfer
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if(koneksi == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                String user = "root";
                String password = "ferro1313";
                koneksi = DriverManager.getConnection(url, user, password);
                if(koneksi != null){
                    System.out.println("Koneksi Berhasil");
                }
            }
            catch (ClassNotFoundException cne){
                    System.out.println("gagal load driver : "+cne.getMessage());
                    }
            catch (SQLException sqle){
                    System.out.println("gagal koneksi : "+sqle.getMessage());
            }
        }
        return koneksi;
    }
}
