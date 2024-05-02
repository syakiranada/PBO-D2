/* 
File     : B.java
Tanggal  : 2 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: jawaban soal 3b modul 10a
*/

public class B {
    public static void main(String[] args) {
        /* NO 1
         * Output: 97
         * Berhasil dieksekusi
         * Coercion karena karakter 'a' akan diubah secara implisit 
         * menjadi nilai ASCII (97) lalu disimpan sebagai tipe data integer.
         */
        int output = 'a';
        System.out.println(output);

        /* NO 2
         * Output: error
         * Gagal dieksekusi
         * Casting dari tipe data double ke tipe data int. 
         * Namun, hal ini tidak akan berhasil karena konversi dari tipe data 
         * double ke int bisa mengakibatkan kehilangan informasi.
         */
        double x = 15.5;
        int output1 = x;
        System.out.println(output1);

        /* NO 3
         * Output: 25.0
         * Berhasil dieksekusi
         * Coercion karena nilai integer (y) dikonversi secara implisit 
         * menjadi tipe data double.
         */
        int y = 25;
        double output2 = y;
        System.out.println(output2);

        /* NO 4
         * Output: N
         * Berhasil dieksekusi
         * Casting karena secara eksplisit melakukan casting dari tipe data 
         * integer (z) ke tipe data char menggunakan (char).
         */
        int z = 78;
        char output3 = (char) z;
        System.out.println(output3);

        /* NO 5
         * Output: 97.0
         * Berhasil dieksekusi
         * Coercion karena karakter 'a' akan diubah secara implisit 
         * menjadi nilai ASCII (97) lalu disimpan sebagai tipe data double.
         */
        char a = 'a';
        double output4 = a;
        System.out.println(output4);
    }
}