/* 
File     : MLingkaran.java
Tanggal  : 20 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: implementasi cara menghitung luas lingkaran
*/

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        // Lingkaran l = new Lingkaran(10.2);
        // System.out.println("Luas lingkaran dengan jejari 10.2 satuan adalah " + l.hitungLuas());
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran: ");
        double radius = scan.nextDouble();
        Lingkaran l = new Lingkaran(radius);
        System.out.println("Luas lingkaran dengan jejari " + radius + "satuan adalah " + l.hitungLuas());
    }
}
