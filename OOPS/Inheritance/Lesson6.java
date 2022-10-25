package OOPS.Inheritance;
//this keyword
class Rectangle {

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length is : " + length);
        System.out.println("Breadth is : " + breadth);
    }

}

public class Lesson6 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        rect1.display();
        Rectangle rect2 = new Rectangle(30, 40);
        rect2.display();
    }
}
