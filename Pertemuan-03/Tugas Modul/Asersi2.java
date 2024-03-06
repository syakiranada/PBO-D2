/* 
File     : Asersi2.java
Tanggal  : 6 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Program untuk demo asersi, yang akan menolak iput
            jari-jari lingkaran yang bernilai nol
*/

//class lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert (jariJari > 0):"jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println(("keliling lingkaran = " + kelilingLingkaran));
    }
}

/*PERTANYAAN
secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
Jawab:
Ada yang kurang tepat. Seharusnya assertion pada class Asersi2
diletakkan di class Lingkaran, pada baris sebelum this.jariJari = jariJari;
agar lingkaran tidak dibuat jika jari-jari kurang dari atau sama dengan 0
*/