package com.bootcoding.java.oops.exercise4;


public class StudentService {
    public void getStudent(Student[] std){
        for(int i = 0; i< std.length; i++){
            Student student = std[i];
        if(student.percentage>60){
            System.out.println("Eligible");
        }else
        {
            System.out.println("Not Eligible");
        }
    }

    }
}
