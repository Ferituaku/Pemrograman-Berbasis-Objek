/*Nama      : Al Ferro Putra Yusanda        */
/*Nim       : 24060122140164                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : Helicopter.java                 */



public class Helicopter extends Airplane{
    public double maxLoad;

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return this.maxLoad / 10;
    }

    public double calcTripDistance(){
        return this.maxLoad * 7;
    }

    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }

    public void takeOff(){
        System.out.println("Helicopter Segera Take Off");
    }

    public void land(){
        System.out.println("Helicopter Segera Mendarat");
    }

    public void fly(){
        System.out.println("Helicopter Sedang Terbang");
    }

    public Helicopter(){
        this.maxLoad = 20;
    }
}
