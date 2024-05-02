/* 
File     : Pegawai.java
Tanggal  : 2 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas Pegawai
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama: " + getNama() + ", Gaji pokok: " + + getGajiPokok());
    }
}