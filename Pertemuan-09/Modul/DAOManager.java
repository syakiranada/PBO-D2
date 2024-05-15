/* 
File     : DAOManager.java
Tanggal  : 15 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: pengelola DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
