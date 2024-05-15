/* 
File     : Person.java
Tanggal  : 15 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Person database model
*/

public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
}
