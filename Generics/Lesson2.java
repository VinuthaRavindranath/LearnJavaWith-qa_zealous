package Generics;

public class Lesson2<T> {

    T data[] = (T[]) new Object[3];

    public static void main(String[] args) {
        Lesson2<String> l = new Lesson2<>();
        l.data[0] = "Hello";
        l.data[1] = "World";
        // l.data[2] = 10;// compile time error, type mismatch, cannot convert from int
        // to String

        for (int i = 0; i <= 2; i++) {
            String str = l.data[i]; // no need to type cast
            System.out.println(str);
        }

    }
}
