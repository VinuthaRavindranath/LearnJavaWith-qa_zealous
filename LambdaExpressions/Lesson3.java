package LambdaExpressions;

interface MyLambda3 {
    public int add(int x, int y);
}

public class Lesson3 {
    public static void main(String[] args) {
        // MyLambda3 my3 = (a, b) -> {
        // return a + b;
        // };

        MyLambda3 my3 = (a, b) -> a + b;
        System.out.println(my3.add(10, 20));
    }
}
