import java.util.Scanner;

public class MethodDemo {
    
    public static void main(String[] args) {
        System.out.println("enter the name");
        Scanner scanner = new Scanner(System.in);
        String name =scanner.next();
        greet(name);
    }

    public static void greet(String name) {
        System.out.println("Hi There!! " + name);
    }
}
