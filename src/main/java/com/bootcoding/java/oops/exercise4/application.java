package com.bootcoding.java.oops.exercise4;
import com.bootcoding.java.oops.exercise1.GradeSystem;

import java.util.Random;
public class application {
    public static void main(String[] args) {
        Random random = new Random();
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            Student s = new Student();
            s.name = "Name" + i;
            s.rollno = i;
            s.Sub1Marks = random.nextInt(100);
            s.Sub2Marks = random.nextInt(100);
            s.Sub3Marks = random.nextInt(100);
            students[i] = s;
            s.calculateAverage(s);
            s.calculatePercentage(s);
            s.print();
        }
        StudentService ss = new StudentService();
        ss.getStudent(students);
    }
}
