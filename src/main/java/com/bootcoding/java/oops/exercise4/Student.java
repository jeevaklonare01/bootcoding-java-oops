package com.bootcoding.java.oops.exercise4;

public class Student {
    String name;
    int rollno;
    int Sub1Marks;
    int Sub2Marks;
    int Sub3Marks;
    double avgMarks;
    double percentage;

    boolean eligibility;

    public void calculateAverage(Student s){
        avgMarks=(Sub1Marks+Sub2Marks+Sub3Marks)/3;
    }
    public void calculatePercentage(Student s){
        percentage=(avgMarks/300)*100;
    }
    public void print(){
        System.out.println("Name of Student : "+name);
        System.out.println("Roll No : "+rollno);
        System.out.println("Marks in Physics : "+Sub1Marks);
        System.out.println("Marks in Chemistry : "+Sub2Marks);
        System.out.println("Marks in Maths : "+Sub3Marks);
        System.out.println("Average Of 3 Subjects : "+avgMarks);
        System.out.println("Percentage : "+percentage);
    }
}
