/* 
File     : Data.java
Tanggal  : 10 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas generic untuk menyimpan objek dengan tipe data generic
*/

public class Data<T> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}
