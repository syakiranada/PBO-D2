/* 
File     : MPoligon.java
Tanggal  : 13 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: drive class untuk poligon dan persegi panjang, serta segitiga
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        Segitiga segitigaSikuSiku = new Segitiga(3, 4, 3);
        segitigaSikuSiku.printInfo();
        System.out.println("Luas Segitiga : " + segitigaSikuSiku.hitungLuas());
    }
}
