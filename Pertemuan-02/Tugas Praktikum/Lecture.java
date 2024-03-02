/* 
File     : Lecture.java
Tanggal  : 1 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Kelas Lecture dengan name, age, address, employeeID dan coursesTaught
*/

import java.util.List;
import java.util.ArrayList;

public class Lecture {
    //Atribut
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    //Konstruktor
    Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age =  age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    //Methods
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

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
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

    public int getEmployeeID(){
        return employeeID;
    }

    //prosedur untuk print detail dari Lecture
    public void getDetails() {
        System.out.println("Details of Lecturer:");
        System.out.println("- Name        : " + getName());
        System.out.println("- Age         : " + getAge());
        System.out.println("- Address     : " + getAddress());
        System.out.println("- Employee ID : " + getEmployeeID());
    }    

    //prosedur untuk menambah sebuah course yang diajarkan oleh dosen
    public void teachCourse(Course course) {
        if (!coursesTaught.contains(course)){
            coursesTaught.add(course);
        }
    }

    //prosedur untuk menampilkan seluruh course yang diampu oleh dosen.
    public void viewTaughtCourses() {
        System.out.println("Courses taught by " + getName() + ":");
        for (Course course: coursesTaught){
            course.getDetails();
        }
    }
}
