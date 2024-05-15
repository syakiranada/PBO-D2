/* 
File     : ReadSerializedPerson.java
Tanggal  : 15 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: program untuk serialisasi objek Person
*/

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe){
            ioe.printStackTrace();
        }
    }
}
