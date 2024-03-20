/* 
File     : MBujurSangkar.java
Tanggal  : 20 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas yang membuat mengimplementasikan cara menghitung
            luas bujur sangkar
*/
import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
