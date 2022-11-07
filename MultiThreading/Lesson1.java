package MultiThreading;

//Multithread using Thread concept
class Demo1 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }

    }
}

public class Lesson1 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.start();

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }

}
