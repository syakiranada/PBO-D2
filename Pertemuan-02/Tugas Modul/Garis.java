/* 
File     : Garis.java
Tanggal  : 28 Februari 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Kelas Garis yang merupakan sebuah garis yang terdiri dari titik awal dan titik akhir
*/

public class Garis {
    //Atribut
    private Titik TitikAwal;
    private Titik TitikAkhir;

    //Konstruktor
    public Garis(Titik TitikAwal, Titik TitikAkhir){
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
    }
    
    //Method
    public void setTitikAwal(Titik awal){
        TitikAwal = awal;
    }

    public void setTitikAkhir(Titik akhir){
        TitikAkhir = akhir;
    }

    public Titik getTitikAwal(){
        return this.TitikAwal;
    }

    public Titik getTitikAkhir(){
        return this.TitikAkhir;
    }

    public double getPanjang(){
        double x = TitikAkhir.getAbsis() - TitikAwal.getAbsis();
        double y = TitikAkhir.getOrdinat() - TitikAwal.getOrdinat();
        return Math.sqrt(x*x + y*y);
    }

    public double getGradien(){
        double dy = TitikAkhir.getOrdinat() - TitikAwal.getOrdinat();
        double dx = TitikAkhir.getAbsis() - TitikAwal.getAbsis();
        return dy / dx;
    }

    public Garis getRefleksiY(){
        Titik refleksiTitikAwal = TitikAwal.getRefleksiY();
        Titik refleksiTitikAkhir = TitikAkhir.getRefleksiY();
        return new Garis(refleksiTitikAwal, refleksiTitikAkhir);
    }

    public boolean isTegakLurus(Garis G){
        double gradien1 = this.getGradien();
        double gradien2 = G.getGradien();
        return gradien1 * gradien2 == -1;
    }
}
