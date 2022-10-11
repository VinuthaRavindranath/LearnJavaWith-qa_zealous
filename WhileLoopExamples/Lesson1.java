package WhileLoopExamples;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x==5) {
            System.out.println("Inside loop");
            x++;
            System.out.println(x);
        }
        System.out.println("Outside loop"); //if while condition returns false then this statement will be executed
        sc.close();
    }
}
