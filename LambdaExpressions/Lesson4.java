package LambdaExpressions;

@FunctionalInterface
interface MyLambda4 {
    public void display4();
}

class Demo4 {
    int temp = 10;

    public void method4() {
        MyLambda4 my4 = () -> {
            System.out.println("Hello");
            System.out.println("Vinutha" + (++temp));
        };
        my4.display4();
    }

}

public class Lesson4 {
    public static void main(String[] args) {
        Demo4 d = new Demo4();
        d.method4();
    }
}
