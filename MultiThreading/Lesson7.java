package MultiThreading;

//synchronized method
class MyData2 {
    public synchronized void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

class MyThread3 extends Thread {
    MyData2 d1;

    public MyThread3(MyData2 data) {
        d1 = data;
    }

    public void run() {
        System.out.println("Hello World");
    }

}

class MyThread4 extends Thread {
    MyData2 d2;

    public MyThread4(MyData2 data) {
        d2 = data;
    }

    public void run() {
        System.out.println("Welcome Vinu");
    }
}

public class Lesson7 {
    public static void main(String[] args) {
        MyData2 dat = new MyData2();
        MyThread3 t3 = new MyThread3(dat);
        MyThread4 t4 = new MyThread4(dat);
        t3.start();
        t4.start();

    }
}
