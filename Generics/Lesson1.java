package Generics;

//draw back demo program, to over come this we use generics (lesson2.java)
public class Lesson1 {
    public static void main(String[] args) {
        Object obj[] = new Object[3];
        obj[0] = "Hello";
        obj[1] = "world";
        // obj[2] = 10; // no type safety

        for (int i = 0; i <= 2; i++) {
            String str = (String) obj[i];
            System.out.println(str); // gives java.lang.ClassCastException in the runtime
        }
    }
}
