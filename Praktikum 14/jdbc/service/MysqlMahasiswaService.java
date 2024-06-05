/*Nama      : Al Ferro Putra Yusanda        */
/*Nim       : 24060122140164                */
/*Tanggal   : 4 Juni 2024                   */
/*Nama File : MysqlMahasiswaService.java    */

package jdbc.service;
import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author alfer
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    public MysqlMahasiswaService(){
        this.koneksi = MysqlUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException{
        int id = rs.getInt("id");
        String nama = rs.getString("nama");
        return new Mahasiswa(id, nama);
    }
    
    public void add(Mahasiswa mhs){
        String query = "INSERT INTO Mahasiswa(id, nama) VALUES(?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query)){
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
        }catch(SQLException e){
        e.printStackTrace();
        }
    }
    
    public void update(Mahasiswa mhs){
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)){
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
        }catch(SQLException e){
        e.printStackTrace();
        }
    }
    
    public void delete(int id){
        String query = "DELETE FROM mahasiswa WHERE ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)){
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(SQLException e){
        e.printStackTrace();
        }
    }
    public Mahasiswa getById(int id){
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return makeMhsObject(rs);
            }
        }catch(SQLException e){
        e.printStackTrace();
        }
        
        return null;
    }
    
    public List<Mahasiswa> getAll(){
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try (Statement st = koneksi.prepareStatement(query)){
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                listMhs.add(makeMhsObject(rs));
            }
        }catch(SQLException e){
        e.printStackTrace();
        }
        return listMhs;
    }
}
