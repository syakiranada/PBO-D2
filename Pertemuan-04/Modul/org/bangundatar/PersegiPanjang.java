/* 
File     : PersegiPanjang.java
Tanggal  : 13 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: representasi dasar dari objek persegi panjang, turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang, lebar;
    
    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
