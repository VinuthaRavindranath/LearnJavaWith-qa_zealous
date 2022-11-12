package LambdaExpressions;

@FunctionalInterface
interface MyLamba1 {
    public void display();
}

public class Lesson1 {
    public static void main(String[] args) {
        MyLamba1 my = () -> {
            System.out.println("Hello world");
        };
        my.display();

    }
}
