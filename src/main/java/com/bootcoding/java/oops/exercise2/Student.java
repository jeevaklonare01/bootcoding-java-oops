package com.bootcoding.java.oops.exercise2;

public class Student {
    String name;
    int rollno;
    int physicsMarks;
    int chemistryMarks;
    int mathsMarks;
    double avgMarks;
    double percentage;

    public void print(){
        System.out.println("Name of Student : "+name);
        System.out.println("Roll No : "+rollno);
        System.out.println("Marks in Physics : "+physicsMarks);
        System.out.println("Marks in Chemistry : "+chemistryMarks);
        System.out.println("Marks in Maths : "+mathsMarks);
        System.out.println("Average Of 3 Subjects : "+avgMarks);
        System.out.println("Percentage : "+percentage);
    }
}

