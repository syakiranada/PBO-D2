/* 
File     : SeaPlane.java
Tanggal  : 24 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas SeaPlane, turunan dari Airplane
*/

public class SeaPlane extends Airplane {
    private double maxLoad;

    public SeaPlane(){

    }

    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad / 20;
    }

    public double calcTripDistance(){
        return 50;
    }

    public String toString(){
        return super.toString() + " dapat take-off dan mendarat di perairan laut";
    }

    public void takeOff(){
        System.out.println("Sea plane lepas landas");
    }

    public void land(){
        System.out.println("Sea plane mendarat");
    }

    public void fly(){
        System.out.println("Sea plane terbang");
    }
}
