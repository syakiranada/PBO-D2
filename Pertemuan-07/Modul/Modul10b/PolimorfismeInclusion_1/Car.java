/* 
File     : Car.java
Tanggal  : 2 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas Car, turunan kelas Vehicle
*/

public class Car extends Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil: " + fare);
    }
}
