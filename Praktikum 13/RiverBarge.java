/*Nama      : Al Ferro Putra Yusanda        */
/*Nim       : 24060122140164                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : RiverBarge.java                 */

public class RiverBarge extends Vehicle{
    private double maxLoad;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    @Override
    public double calcFuelEfficiency(){
        return maxLoad / 5.0;
    }
    
    @Override
    public double calcTripDistance(){
        return this.calcFuelEfficiency() + 5;
    }
}
