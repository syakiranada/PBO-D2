/* 
File     : BangunDatarGeneric.java
Tanggal  : 8 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas konstruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
