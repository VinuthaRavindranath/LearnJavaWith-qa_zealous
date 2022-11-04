package ExceptionHandling;

//Checked Exception - ileNotFoundException(complietime)
import java.io.*;
import java.util.*;;

class Demo14 {

    static void divide() throws IOException {
        try (FileInputStream fi = new FileInputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/ExceptionHandling/my.txt");
                Scanner sc = new Scanner(fi);) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b + c);
            System.out.println(a / 0);
        }
    }
}

public class Lesson14 {
    public static void main(String[] args) throws IOException {
        try {
            Demo14.divide();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Bye");
    }
}
