package OOPS.DataHiding;
import java.util.Scanner;
//Encapsulation
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable
class Circle {

    private double radius,circumference;

    double getradius(){
        return radius;
    }

    void setradius(double r){
        radius = r;
    }

    double getcircumference(){
        return circumference;
    }

    void setcircumference(double c){
        circumference = c;
    }

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
        double radius = sc.nextDouble();
        double circumference = sc.nextDouble();
        
        calculate.setradius(radius);
        calculate.setcircumference(circumference);


        System.out.println("Area of the circle  "+ calculate.area());
        System.out.println("Radius of the circle "+ calculate.radius());
        System.out.println("Diameter of the circle "+ calculate.diameter());
        System.out.println("Circumference of the circle "+ calculate.circumference());

        sc.close();
    }
}
