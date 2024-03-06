/* 
File     : AngkaSialException.java
Tanggal  : 6 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13
*/

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
