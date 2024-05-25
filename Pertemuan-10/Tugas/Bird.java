/* 
File     : Bird.java
Tanggal  : 24 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas Bird, turunan dari kelas abstrak Animal
            dan mengimplementasikan interface IFlyer
*/

public class Bird extends Animal implements IFlyer {
    public void takeOff(){
        System.out.println("Burung lepas landas");
    }

    public void land(){
        System.out.println("Burung mendarat");
    }

    public void fly(){
        System.out.println("Burung terbang");
    }
    
    public void buildNest(){
        System.out.println("Burung membuat sarang");
    }

    public void layEggs(){
        System.out.println("Burung bertelur");
    }

    public void eat(){
        System.out.println("Burung makan biji-bijian");
    }
}
