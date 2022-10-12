package MethodsExamples;

import java.util.Scanner;

public class Lesson6 {
    public String name(String firstname, String lastname){
        String fullname = firstname.concat(lastname);
        return fullname;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname");
        String firstname = sc.next();
        System.out.println("Enter Lastname");
        String lastname = sc.next();
        Lesson6 myname = new Lesson6();
        String yourName = myname.name(firstname,lastname);
        System.out.println("Your full name is :" + yourName);
        sc.close();
    }
}
