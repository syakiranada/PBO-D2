/* 
File     : Titik.java
Tanggal  : 28 Februari 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
*/

public class Titik{
    //Atribut
    private double absis;
    private double ordinat;
    static int counterTitik;

    //Konstruktor
    Titik(){
        this(0,0);
        counterTitik++;
    }
    
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //Method
    public void setAbsis(double absis){
        this.absis = absis;
    }
    
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    
    public double getAbsis(){
        return this.absis;
    }
    
    public double getOrdinat(){
        return this.ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }
    
    public double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    public void refleksiX(Titik T){
        this.absis *= (-1);
    }

    public void refleksiY(Titik T){
        this.ordinat *= (-1);
    }

    public Titik getRefleksiX(){
        return new Titik(-this.absis, this.ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(this.absis, -this.ordinat);
    }
}


