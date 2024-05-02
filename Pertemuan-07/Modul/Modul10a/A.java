/* 
File     : A.java
Tanggal  : 2 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: jawaban soal 3a modul 10a
*/

/*
 * Polimorfisme Ad Hoc: Overloading
 * 
 * Konsep dalam pemrograman dimana sebuah kelas memiliki beberapa method dengan 
 * nama yang sama namun dengan parameter-parameter yang berbeda. 
 * Ini memungkinkan untuk melakukan tindakan yang berbeda tergantung pada tipe atau 
 * jumlah parameter yang diberikan saat pemanggilan method.
 * 
 * Syarat:
 * 1. Nama method yang di-overload harus memiliki nama yang sama.
 * 2. Setiap method overload harus memiliki parameter yang berbeda (jumlah, tipe, atau keduanya).
 * 3. Method-method yang di-overload dapat memiliki tingkat aksesibilitas (misalnya, public, private, protected) yang berbeda atau sama.
 * 
 */

 //contoh:
 public class A {
    public int jumlah(int a, int b) {
        return a + b;
    }

    public double jumlah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        A penjumlahan = new A();

        // Memanggil method jumlah dengan parameter integer
        int resultInt = penjumlahan.jumlah(7, 3);
        System.out.println("Hasil penjumlahan integer: " + resultInt);

        // Memanggil method jumlah dengan parameter double
        double resultDouble = penjumlahan.jumlah(2.5, 3.7);
        System.out.println("Hasil penjumlahan double: " + resultDouble);
    }
}
