/* 
File     : Lecture.java
Tanggal  : 16 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Representasi untuk objek Lecture, turunan class Person
*/

package org.academic;

import org.person.Person;
import org.course.Course;

import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person{
    //Atribut
    private int employeeID;
    private List<Course> coursesTaught;

    //Konstruktor
    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    //Methods
    //MUTATOR
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    //SELEKTOR
    public int getEmployeeID(){
        return employeeID;
    }

    //prosedur untuk print detail dari Lecture
    public void getDetails() {
        System.out.println("=======Details of Lecturer=======");
        super.getDetails();
        System.out.println("Employee ID : " + getEmployeeID());
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
