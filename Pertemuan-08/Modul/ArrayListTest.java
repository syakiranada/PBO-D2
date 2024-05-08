/* 
File     : ArrayListTest.java
Tanggal  : 8 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: program penggunaan objek ArrayList
            sebagai collection class
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        strings.remove("praktikum");

        for (String s: strings){
            System.out.println(s + " ");
        }
    }
}
