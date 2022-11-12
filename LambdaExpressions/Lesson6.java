package LambdaExpressions;

//method reference
@FunctionalInterface
interface MyLambda6 {
    public void display6(String str);
}

public class Lesson6 {

    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void append(String str) {
        StringBuffer sb = new StringBuffer("Vinutha ");
        sb.append(str);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        MyLambda6 my6 = Lesson6::reverse;
        my6.display6("Vinutha");

        Lesson6 l6 = new Lesson6();
        MyLambda6 myStatic = l6::append;
        myStatic.display6("Ravi");
    }
}
