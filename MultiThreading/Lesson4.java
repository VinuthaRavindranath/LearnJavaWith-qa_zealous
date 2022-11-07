package MultiThreading;

//Multithread using Runnable concept
public class Lesson4 implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Lesson4 d = new Lesson4();
        Thread t = new Thread(d);
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }

    }

}
