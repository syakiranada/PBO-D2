/* 
File     : PegawaiDanGaji.java
Tanggal  : 2 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas main
*/

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);

    }
}
