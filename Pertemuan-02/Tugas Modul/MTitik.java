/* 
File     : MTitik.java
Tanggal  : 28 Februari 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: File main dari kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
*/

public class MTitik {
    public static void main(String[] args){
        Titik t1;
        Titik t2;

        t1 = new Titik();

        t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3;
        t3 = new Titik(5,6);

        System.out.printf("Jumlah objek titik : %d\n", Titik.getCounterTitik());
        System.out.printf("Titik t1 dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2 dengan absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("Titik t3 dengan absis : %.2f, ordinat : %.2f\n", t3.getAbsis(), t3.getOrdinat());
        System.out.printf("Jarak titik t2 dengan pusat : %.2f\n", t2.getJarakPusat());
        System.out.println("Hasil pencerminan titik t2 terhadap sumbu X adalah (" + t2.getRefleksiX().getAbsis() + ", " + t2.getRefleksiX().getOrdinat() + ")");
        System.out.println("Hasil pencerminan titik t3 terhadap sumbu Y adalah (" + t3.getRefleksiY().getAbsis() + ", " + t3.getRefleksiY().getOrdinat() + ")");
    }
}
