package MultiThreading;

//Multithread using Thread concept
public class Lesson2 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }

    }

    public static void main(String[] args) {
        Lesson2 d = new Lesson2();
        d.start();

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
