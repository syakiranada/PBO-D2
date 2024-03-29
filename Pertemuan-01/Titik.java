/* 
File     : Titik.java
Tanggal  : 21 Februari 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
*/

public class Titik{
    double absis;
    double ordinat;
    static int counterTitik;

    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }
    
    Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    void setAbsis(double a){
        absis = a;
    }
    
    void setOrdinat(double o){
        ordinat = o;
    }
    
    double getAbsis(){
        return absis;
    }
    
    double getOrdinat(){
        return ordinat;
    }
    
    static int getCounterTitik(){
        return counterTitik;
    }
}


