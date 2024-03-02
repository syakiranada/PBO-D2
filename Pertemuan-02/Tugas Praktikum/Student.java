/* 
File     : Student.java
Tanggal  : 1 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Kelas Student dengan name, age, address, studentID dan coursesEnrolled
*/

import java.util.List;
import java.util.ArrayList;

public class Student {
    //Atribut
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    //Konstruktor
    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age =  age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
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

    public void setStudentID(int studentID){
        this.studentID = studentID;
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

    public int getStudentID(){
        return studentID;
    }

    //prosedur untuk print detail dari Student
    public void getDetails() {
        System.out.println("Details of Student:");
        System.out.println("- Name       : " + getName());
        System.out.println("- Age        : " + getAge());
        System.out.println("- Address    : " + getAddress());
        System.out.println("- Student ID : " + getStudentID());
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
