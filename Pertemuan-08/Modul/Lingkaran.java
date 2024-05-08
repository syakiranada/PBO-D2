/* 
File     : Lingkaran.java
Tanggal  : 8 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: implementasi Lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
}
