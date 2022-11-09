package MultiThreading;

//Inter-thread Communication
class DataO {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while (flag != true) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (flag != false) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        x = value;
        flag = true;
        notify();
        return x;
    }

}

class Producer extends Thread {
    DataO dd;

    public Producer(DataO data) {
        this.dd = data;
    }

    public void run() {
        int i = 1;
        while (true) {
            dd.set(i);
            System.out.println("Producer " + i);
            i++;
        }
    }
}

class Consumer extends Thread {
    DataO dd;

    public Consumer(DataO data) {
        this.dd = data;
    }

    public void run() {
        while (true) {
            int value = dd.get();
            System.out.println("Consumer " + value);
        }
    }
}

public class Lesson11 {
    public static void main(String[] args) {
        DataO db = new DataO();
        Producer p = new Producer(db);
        Consumer c = new Consumer(db);
        p.start();
        c.start();

    }
}
