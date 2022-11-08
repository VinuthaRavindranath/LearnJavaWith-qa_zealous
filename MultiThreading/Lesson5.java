package MultiThreading;

class Demo3 extends Thread {
    public Demo3(String name) {
        super(name);
        setPriority(MIN_PRIORITY);
    }
}

class Demo4 implements Runnable {

    public void run() {
        System.out.println("Demo4");
    }
}

class Demo5 extends Thread {
    public Demo5(String name) {
        super(name);
    }

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Lesson5 {
    public static void main(String[] args) {
        Demo3 d = new Demo3("My Thread1");
        System.out.println("Id" + d.getId());
        System.out.println("Name" + d.getName());
        System.out.println("Priority" + d.getPriority());
        System.out.println("State" + d.getState());
        System.out.println("Alive" + d.isAlive());

        // Demo4 d2 = new Demo4();
        Thread t = new Thread(new Demo4(), "My thread2");
        t.start();
        System.out.println("Id" + t.getId());
        System.out.println("Name" + t.getName());
        System.out.println("Priority" + t.getPriority());
        System.out.println("State" + t.getState());
        System.out.println("Alive" + t.isAlive());

        Demo5 d3 = new Demo5("My Thread3");
        d3.start();
        d3.interrupt();
    }
}
