package MultiThreading;

//synchronized block
class MyData {
    public void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }
    }
}

class MyThread1 extends Thread {
    MyData d1;

    public MyThread1(MyData data) {
        d1 = data;
    }

    public void run() {
        System.out.println("Hello World");
    }

}

class MyThread2 extends Thread {
    MyData d2;

    public MyThread2(MyData data) {
        d2 = data;
    }

    public void run() {
        System.out.println("Welcome Vinu");
    }
}

public class Lesson6 {
    public static void main(String[] args) {
        MyData dat = new MyData();
        MyThread1 t1 = new MyThread1(dat);
        MyThread2 t2 = new MyThread2(dat);
        t1.start();
        t2.start();

    }
}
