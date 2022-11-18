package Generics;

//Generic methods
public class Lesson5 {

    public static <T> void show(T[] elements) {
        for (T ele : elements) {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        show(new String[] { "Hi", "Micky", "How", "Are", "you?" });
        show(new Integer[] { 10, 20, 30, 40, 50 });
    }
}
