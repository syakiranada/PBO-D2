/* 
File     : Course.java
Tanggal  : 16 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Representasi untuk objek Course
*/

package org.course;

import org.academic.*;
import org.academic.Student;

import java.util.List;
import java.util.ArrayList;

public class Course {
    //Atribut
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    //Konstruktor
    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    //Methods
    //MUTATOR
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setLecture(Lecture lecture){
        this.lecture = lecture;
    }

    //SELEKTOR
    public String getCourseCode(){
        return courseCode;
    }

    public String getCourseName(){
        return courseName;
    }

    public Lecture getLecture(){
        return lecture;
    }

    //prosedur untuk menambah seorang mahasiswa
    public void addStudent(Student student) {
        if (!studentsEnrolled.contains(student)){
            studentsEnrolled.add(student);
            student.enrollInCourse(this);
        } 
    }

    //prosedur untuk menghapus seorang mahasiswa
    public void removeStudent(Student student) {
        if (studentsEnrolled.contains(student)){
            studentsEnrolled.remove(student);
            student.unenrollFromCourse(this);
        } 
    }

    //prosedur untuk untuk menampilkan seluruh student yang mengambil course. 
    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + getCourseCode() + " - "+ getCourseName() + " :");
        for (Student student: studentsEnrolled){
            student.getDetails();
        }
    }

    //prosedur untuk print detail dari Course
    public void getDetails() {
        System.out.println("=======Details of Course=======");
        System.out.println("- Course Code : " + getCourseCode());
        System.out.println("- Course Name : " + getCourseName());
        System.out.println("- Lecture     : " + lecture.getName());
    }
}
