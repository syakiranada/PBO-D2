/* 
File     : Main.java
Tanggal  : 1 Maret 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: Kelas Main yang menggunakan kelas Course, Lecture, dan Student
*/

public class Main {
    public static void main(String[] args) {
        //inisialisasi lecture
        Lecture l1 = new Lecture("Ben Almora", 44, "890 Maple Ave", 177013);
        Lecture l2 = new Lecture("Owen Hendricks", 31, "234 Birch St", 412873);
        
        //inisialisasi student
        Student s1 = new Student("Rose Larkin", 20, "456 Elm St", 723751);
        Student s2 = new Student("Anthony Vaughn", 19, "123 Oak St", 734621);
        Student s3 = new Student("Amerie Wadia", 19, "789 Pine St", 733451);
        
        //inisialisasi course
        Course cs101 = new Course("CS101", "Introduction to Computer Science", l1);
        Course cs102 = new Course("CS102", "Data Structures and Algorithms", l2);
        Course cs103 = new Course("CS103", "Computer Architecture", l1);

        //menambahkan course yang diampu oleh lecture
        l1.teachCourse(cs101);
        l2.teachCourse(cs102);
        l1.teachCourse(cs103);

        //menampilkan detail lecturer l1
        l1.getDetails();
        System.out.println();
        //menampilkan course yang diampu oleh lecturer l1
        l1.viewTaughtCourses();
        System.out.println();
        
        //menambahkan student ke course cs101
        cs101.addStudent(s1);
        cs101.addStudent(s2);
        cs101.addStudent(s3);
        
        //menambahkan student ke course cs102
        cs102.addStudent(s3);
        
        //menambahkan course untuk student s1
        s1.enrollInCourse(cs103);

        //menambahkan course untuk student s2
        s2.enrollInCourse(cs102);
        s2.enrollInCourse(cs103);

        //menampilkan course yang diambil oleh student s2
        s2.viewEnrolledCourses();
        System.out.println();
        //menghapus student s2 dari course cs102
        cs103.removeStudent(s2);
        System.out.println(s2.getName() + " is removed from course CS103");
        //menampilkan course yang diambil oleh student s2 untuk mengecek apakah sudah di-remove
        s2.viewEnrolledCourses();
        System.out.println();
        //menampilkan enrolled students di course cs102 setelah student s2 di-remove
        cs103.viewEnrolledStudents();
        System.out.println();
    }
}
  