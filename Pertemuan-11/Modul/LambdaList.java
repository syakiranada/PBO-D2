/* 
File     : LambdaList.java
Tanggal  : 29 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter pada method.
*/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();

        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("DIdi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
