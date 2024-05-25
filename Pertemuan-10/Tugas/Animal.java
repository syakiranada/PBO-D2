/* 
File     : Animal.java
Tanggal  : 24 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas abstrak untuk Animal
*/

public abstract class Animal {
    public abstract void eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
