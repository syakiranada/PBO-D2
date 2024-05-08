/* 
File     : MapTest.java
Tanggal  : 8 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: program yang menggunakan generic untuk pasangan
            Kunci-Nilai
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "satu");
        map.put(2, "dua");

        // mengambil elemen pertama
        System.out.println(map.get(1));

        // hapus elemen
        map.remove(2);
        
        Set<Integer> keys = map.keySet();
        for (Integer key: keys){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
