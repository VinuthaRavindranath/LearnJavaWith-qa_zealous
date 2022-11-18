package Generics;

////Generic methods with variable arguments ...
@SuppressWarnings("unchecked")
public class Lesson6 {
    public static <T> void display(T... data) {
        for (T elements : data) {
            System.out.print(elements + " ");
        }
    }

    public static void main(String[] args) {
        display("Hi", "Micky", "How", "Are", "you?");
        display(10, 20, 30, 40, 50, 60, 70, 80, 90, 10);
    }
}
