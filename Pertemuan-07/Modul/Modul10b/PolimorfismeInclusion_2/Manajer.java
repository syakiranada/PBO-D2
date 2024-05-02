/* 
File     : Manajer.java
Tanggal  : 2 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas Manajer, turunan kelas Pegawai
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama){
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
