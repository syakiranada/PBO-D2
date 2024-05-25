/* 
File     : Superman.java
Tanggal  : 24 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas Superman, turunan dari Kryptonian
*/

public class Superman extends Kryptonian {
    private String name;

    public Superman(){

    }

    public Superman(String name){
        this.name = name;
    }

    public void takeOff(){
        System.out.println("Superman lepas landas");
    }

    public void land(){
        System.out.println("Superman mendarat");
    }

    public void fly(){
        System.out.println("Superman terbang");
    }

    public void leapBuilding(){
        System.out.println("Superman melompati bangunan");
    }

    public void stopBullet(){
        System.out.println("Superman menghentikan peluru");
    }

    public void eat(){
        System.out.println("Superman makan");
    }
}
