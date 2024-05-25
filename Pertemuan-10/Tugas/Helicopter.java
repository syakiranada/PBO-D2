/* 
File     : Helicopter.java
Tanggal  : 24 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas Helicopter, turunan dari Airplane
*/

public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(){

    }

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad / 25;
    }

    public double calcTripDistance(){
        return 50;
    }

    public String toString(){
        return super.toString() + " hanya memerlukan landasan kecil";
    }

    public void takeOff(){
        System.out.println("Helicopter lepas landas");
    }

    public void land(){
        System.out.println("Helicopter mendarat");
    }

    public void fly(){
        System.out.println("Helicopter terbang");
    }
}
