/* 
File     : Lingkaran.java
Tanggal  : 20 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}
