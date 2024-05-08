/* 
File     : BangunDatarGenericTest.java
Tanggal  : 8 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: main class untuk generic bangun datar
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("Tipe generic : " + bdg.get().getClass().getName());
    }
}
