package LambdaExpressions;

//Lambda with single parameter
@FunctionalInterface
interface MyLambda2 {
    public void show(String name);
}

public class Lesson2 {
    public static void main(String[] args) {
        MyLambda2 my2 = (n) -> {
            System.out.println("Hello " + n);
        };
        my2.show("Vinutha");
    }
}
