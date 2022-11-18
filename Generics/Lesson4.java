package Generics;

@SuppressWarnings("unchecked")
class Demo4<T> {
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class Lesson4 {
    public static void main(String[] args) {
        Demo4<Integer> arr = new Demo4<>();
        arr.append(10);
        arr.append(20);
        arr.append(30);
        arr.display();

        Demo4<String> arr2 = new Demo4<>();
        arr2.append("Micky");
        arr2.append("Minni");
        arr2.append("Donald");
        arr2.display();
    }
}
