package com.bootcoding.java.oops.exercise1;

public class Application {

    public static void main(String[] args) {
        for (int i =1 ; i<=10; i++){
            Student s = new Student();
            s.rollno = i;
            s.name = "Name"+i;
            s.address = "Nagpur";
            s.percentage= 87+i;
            s.print();
            GradeSystem gs = new GradeSystem();
            char grade = gs.FindGrade(s);
            System.out.println(grade);
        }
    }
}