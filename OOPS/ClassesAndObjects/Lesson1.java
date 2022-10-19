package OOPS.ClassesAndObjects;

import java.util.Scanner;

class Circle {

    public double radius,circumference;

    public double area(){
      return Math.PI*radius*radius;
    }

    public double radius(){
       return circumference/(2*Math.PI);
    }

    public double diameter(){
       return 2*radius;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }
 
}

public class Lesson1{
    public static void main(String[] args) {
        Circle calculate = new Circle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and circumference values");
        calculate.radius = sc.nextDouble();
        calculate.circumference = sc.nextDouble();

        System.out.println("Area of the circle  "+ calculate.area());
        System.out.println("Radius of the circle "+ calculate.radius());
        System.out.println("Diameter of the circle "+ calculate.diameter());
        System.out.println("Circumference of the circle "+ calculate.circumference());

        sc.close();
    }
}
