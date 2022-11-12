package LambdaExpressions;

@FunctionalInterface
interface MyLambda5 {
    public void display5();
}

class CallLambda {
    public void callLambda(MyLambda5 my5) {// method taking functional interface as parameter
        my5.display5();
    }
}

class Demo5 {
    public void method5() {
        CallLambda callLam = new CallLambda();
        callLam.callLambda(() -> {
            System.out.println("Hello"); // we can pass lambda expression in the method
        });
    }

}

public class Lesson5 {
    public static void main(String[] args) {
        Demo5 d5 = new Demo5();
        d5.method5();
    }
}
