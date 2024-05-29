/* 
File     : LambdaMap.java
Tanggal  : 29 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter pada method.
*/

import java.util.*;

public class LambdaMap{
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("2406011820030", "Adi");
        mahasiswaMap.put("2406011830060", "Bambang");
        mahasiswaMap.put("2406011940098", "Cici");
        mahasiswaMap.put("2406011940170", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + "    Nama: " + nama));
    }
}
