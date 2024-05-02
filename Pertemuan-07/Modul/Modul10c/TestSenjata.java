/* 
File     : TestSenjata.java
Tanggal  : 2 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas main
*/

public class TestSenjata {
    public static void main(String[] args) {
        // Deklarasi Objek
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        // Uji Coba Method Kelas Senjata
        System.out.print("AK47 menembak 3x: "); ak47.menembak(3);
        System.out.print("M16 menembak 1x: "); m16.menembak(1);

        System.out.println("AK47 menusuk: " + ak47.menusuk());
        ak47.pasangBayonet();
        System.out.println("AK47 menusuk: " + ak47.menusuk());
    }
}
