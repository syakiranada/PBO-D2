/* 
File     : PolimorfismeCoercion.java
Tanggal  : 2 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas PolimorfismeCoercion
*/

public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan){
        return bilangan * bilangan;
    }
    public static void main(String[] args) {
        Integer bilangan = 10;

        int hasilKuadrat = kuadrat(bilangan);
        System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
    }
}
