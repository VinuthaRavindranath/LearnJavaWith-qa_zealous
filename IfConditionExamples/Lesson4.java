package IfConditionExamples;
//Take two int values from user and print greatest among them using Teranary operator
public class Lesson4 {
    public static void main(String[] args) {
        int a=10,b=20, max;
        max = (a>b)? a: b;
        System.out.println("Greatest number is "+ max);
    }
}
