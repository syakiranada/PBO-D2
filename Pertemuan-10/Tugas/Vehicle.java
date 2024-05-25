/* 
File     : Vehicle.java
Tanggal  : 24 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas abstrak untuk Vehicle
*/

public abstract class Vehicle {
    public double calcFuelEfficiency(){
        return 0.0;
    }

    public double calcTripDistance(){
        return 0.0;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
}