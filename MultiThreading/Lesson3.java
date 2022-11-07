package MultiThreading;

//Multithread using Runnable concept
class Demo2 implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }

    }
}

public class Lesson3 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        Thread t = new Thread(d);
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }

    }
}
