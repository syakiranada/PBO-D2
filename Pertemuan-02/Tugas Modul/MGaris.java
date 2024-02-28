/* 
File     : MGaris.java
Tanggal  : 28 Februari 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Kelas Garis yang merupakan sebuah garis yang terdiri dari titik awal dan titik akhir
*/
public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(1, 1);
        Titik t2 = new Titik(4, 5);
        Garis g1 = new Garis(t1, t2);

        Garis refleksiY = g1.getRefleksiY();

        Titik t3 = new Titik(4, 4);
        Titik t4 = new Titik(-1, 3);
        Garis g2 = new Garis(t3, t4);

        System.out.println("Garis g1 terdiri atas titik awal : (" + g1.getTitikAwal().getAbsis() + ", " + g1.getTitikAwal().getOrdinat() + ") dan titik akhir : (" + g1.getTitikAkhir().getAbsis() + ", " + g1.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Panjang garis g1 : " + g1.getPanjang());
        System.out.println("Gradien garis g1 : " + g1.getGradien());
        System.out.printf("Refleksi garis g1 terhadap sumbu y adalah titik awal: (%.2f , %.2f) dan titik akhir: (%.2f , %.2f)\n" , refleksiY.getTitikAwal().getAbsis() , refleksiY.getTitikAwal().getOrdinat() , refleksiY.getTitikAkhir().getAbsis() , refleksiY.getTitikAkhir().getOrdinat());
        System.out.println("Apakah garis g1 dan g2 tegak lurus? " + g1.isTegakLurus(g2));
    }
}
