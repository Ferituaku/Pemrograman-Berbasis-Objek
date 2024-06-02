/*Nama      : Al Ferro Putra Yusanda        */
/*Nim       : 24060122140164                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : Truck.java                 */


public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double calcFuelEfficiency() {
        return this.maxLoad / 2;
    }

    public double calcTripDistance() {
        // Implementation here
        return this.calcFuelEfficency * 2;
    }

    public String toString(){
        return "Truck adalah angkutan darat yang sangat handal";
    }

    public Truck(){
        this.maxLoad = 100;
    }
}
