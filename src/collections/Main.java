package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Khoi tao 3 doi tuong sinh vien tu class Student luu vao collection
        List<Student> studentList = new ArrayList<>();
        Student student = new Student(1,"A",13);
        Student student2 = new Student(2,"B",9);
        Student student3 = new Student(3,"C",10);
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println("Truoc Khi sap xep");
        for(Student s: studentList){
            System.out.println(s.getName());
        }
        Collections.sort(studentList);
        System.out.println("Sau khi sap xep");
        for(Student s: studentList){
            System.out.println(s.getName());
        }


    }
}
