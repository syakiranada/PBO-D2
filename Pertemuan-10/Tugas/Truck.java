/* 
File     : Truck.java
Tanggal  : 24 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas Truck, turunan dari Vehicle
*/

public class Truck extends Vehicle {
    private double maxLoad;

    public Truck(){

    }

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad / 50;
    }

    public double calcTripDistance(){
        return 50;
    }

    public String toString(){
        return super.toString() + " adalah angkutan darat yang sangat handal";
    }
}
