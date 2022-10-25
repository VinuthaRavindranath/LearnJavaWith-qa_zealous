package OOPS.Inheritance;
//super keyword
class Rectangle2{
    int length;
    int breadth;
    int x=10;

    public Rectangle2(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

}
class Cuboid extends Rectangle2{
    int height;
    int x =12;
    public Cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height=height;
    }

    public void display(){
        System.out.println(super.x);
        System.out.println(x);
        System.out.println(length+" "+breadth+ " "+ height);
    }
    
}
public class Lesson7 {
    public static void main(String[] args) {
        Cuboid cub1 = new Cuboid(11, 22, 33);
        cub1.display();
        Cuboid cub2 = new Cuboid(13, 23, 34);
        cub2.display();
    }
}
