/* 
File     : Person.java
Tanggal  : 16 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Representasi dasar dari objek person
*/

package org.person;

public class Person {
    //Atribut
    private String name;
    private int age;
    private String address;

    //Konstruktor
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Method
    //MUTATOR
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    //SELEKTOR
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public void getDetails() {
        System.out.println("Name        : " + getName());
        System.out.println("Age         : " + getAge());
        System.out.println("Address     : " + getAddress());
    }
}
