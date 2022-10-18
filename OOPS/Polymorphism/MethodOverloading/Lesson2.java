package OOPS.Polymorphism.MethodOverloading;
//calculate areas of various shapes using method overloading
import java.util.Scanner;

public class Lesson2 {
    
    public int area(int l, int b){
        int a = l*b;
        return a;
    }

    public double area(double r){
        double a = Math.PI*r*r;
        return a;
    }

    public int area (int l){
         int a = l*l;
         return a;
    }

    public float area (float h, float b){
        float a =(b*h)/2;
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Enter the length and breadth");
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt(); int b= sc.nextInt();

        System.out.println("Enter the radius");
        double r = sc.nextDouble();

        System.out.println("Enter the height and breadth");
        float h = sc.nextFloat(); float breadth = sc.nextFloat();

        Lesson2 findAreas = new Lesson2();
        int areaOfRectangle = findAreas.area(l, b);
        System.out.println("Area of the rectangle is : "+ areaOfRectangle);

        double areaOfCircle=findAreas.area(r);
        System.out.println("Area of the circle is : "+ areaOfCircle);

        int areaOfSquare = findAreas.area(l);
        System.out.println("Area of the square is : "+ areaOfSquare);

        float areaOfTriangle = findAreas.area(h, breadth);
        System.out.println("Area of the triangle is : "+ areaOfTriangle);

        sc.close();
    }
}
