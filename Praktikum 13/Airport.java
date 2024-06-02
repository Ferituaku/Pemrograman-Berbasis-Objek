/*Nama      : Al Ferro Putra Yusanda        */
/*Nim       : 24060122140164                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : Airport.java                 */

public class Airport {
    private Airplane airplane;
    private String name;

    public Airport(String name){
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane){
            return "Izin diberikan untuk mendarat";
        }else{
            return "Izin tidak diberikan untuk mendarat";
        }
    }
}
