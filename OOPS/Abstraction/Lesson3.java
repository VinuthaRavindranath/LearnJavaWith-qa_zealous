package OOPS.Abstraction;

abstract class Shape {
    public double radius, area, perimeter, length, breadth;

    abstract public void perimeter();

    abstract public void area();

}

class Circle extends Shape {
    @Override
    public void perimeter() {
        perimeter = 2 * Math.PI * radius;
        System.out.println("perimeter of the circle is : " + perimeter);
    }

    @Override
    public void area() {
        area = Math.PI * radius * radius;
        System.out.println("area of the circle is : " + area);
    }

}

class Rectangle extends Shape {
    @Override
    public void perimeter() {
        perimeter = 2 * (length + breadth);
        System.out.println("perimeter of the Rectangle is : " + perimeter);
    }

    @Override
    public void area() {
        area = length * breadth;
        System.out.println();
        System.out.println("area of the Rectangle is : " + area);
    }
}

public class Lesson3 {
    public static void main(String[] args) {
        Shape shapeCircle = new Circle();
        Shape shapeRectangle = new Rectangle();
        shapeCircle.radius = 4;
        shapeRectangle.length = 3;
        shapeRectangle.breadth = 4;
        shapeCircle.perimeter();
        shapeCircle.area();
        shapeRectangle.perimeter();
        shapeRectangle.area();

    }
}
