/* 
File     : RiverBarge.java
Tanggal  : 24 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas RiverBarge, turunan dari Vehicle
*/

public class RiverBarge {
    private double maxLoad;

    public RiverBarge(){

    }

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad / 100;
    }

    public double calcTripDistance(){
        return 30;
    }

    public String toString(){
        return super.toString() + " adalah angkutan perairan yang sangat handal";
    }
}
