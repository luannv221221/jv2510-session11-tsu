package java8.stream;

import collections.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student = new Student(1,"A",17);
        Student student2 = new Student(2,"B",18);
        Student student3 = new Student(3,"C",16);
        Student student4 = new Student(4,"D",20);
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        // in tat ca cac sinh vien co tuoi lon hon 17

        //students.stream().filter(s -> s.getAge() > 18).forEach(s-> System.out.println(s.getName()));

        // in ra 2 student co tuoi nho hon 18
        //students.stream().filter(s -> s.getAge() < 20).skip(0).limit(2).forEach(s-> System.out.println(s.getName()));

        // sap xep tang dan theo tuoi
        //students.stream().sorted(Comparator.comparing(Student::getAge)).forEach(s-> System.out.println(s.getName()));
        // sap xep giam dan theo tuoi
        //students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(s-> System.out.println(s.getName()));

        // tim tuoi lon nhat
        students.stream().max(Comparator.comparing(Student::getAge)).ifPresent(s-> System.out.println(s.getName()));
    }
}
