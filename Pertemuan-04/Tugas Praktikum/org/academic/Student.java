/* 
File     : Student.java
Tanggal  : 16 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Representasi untuk objek Student, turunan class Person
*/

package org.academic;

import org.person.Person;
import org.course.Course;

import java.util.List;
import java.util.ArrayList;

public class Student extends Person{
    //Atribut
    private int studentID;
    private List<Course> coursesEnrolled;

    //Konstruktor
    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    //Methods
    //MUTATOR
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    //SELEKTOR
    public int getStudentID(){
        return studentID;
    }

    //prosedur untuk print detail dari Student
    public void getDetails() {
        System.out.println("=======Details of Student=======");
        super.getDetails();
        System.out.println("Student ID : " + getStudentID());
    }

    //prosedur untuk menambah sebuah course
    public void enrollInCourse(Course course) {
        if (!coursesEnrolled.contains(course)){
            coursesEnrolled.add(course);
            course.addStudent(this);
        }  
    }

    //prosedur untuk menghapus sebuah course
    public void unenrollFromCourse(Course course) {
        if (coursesEnrolled.contains(course)){
            coursesEnrolled.remove(course);
            course.removeStudent(this);
        }  
    }

    //prosedur untuk menampilkan seluruh course yang diambil oleh mahasiswa.
    public void viewEnrolledCourses() {
        System.out.println("Courses enrolled by " + getName() + ":");
        for (Course course: coursesEnrolled){
            course.getDetails();
        }
    }
}
