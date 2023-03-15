package com.bootcoding.java.oops.exercise2;
import java.util.Random;
public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        Student s = new Student();
        for(int i = 1; i <= 50; i++){
            s.name = "Name"+i;
            s.rollno = i;
            s.physicsMarks = random.nextInt(100);
            s.chemistryMarks = random.nextInt(100);
            s.mathsMarks = random.nextInt(100);
            Average avg = new Average();
            Percentage per = new Percentage();
            avg.calculateAverage(s);
            per.calculatePercentage(s);
            s.print();
        }
    }
}
