package MultiThreading;

//synchronized
class TableData2 {
    synchronized public void displayTable(int n) {
        int len = 10;
        for (int i = 1; i <= len; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread8 extends Thread {
    TableData2 tab1;

    public MyThread8(TableData2 num1) {
        tab1 = num1;
    }

    public void run() {
        tab1.displayTable(5);
    }
}

class MyThread9 extends Thread {
    TableData2 tab2;

    public MyThread9(TableData2 num1) {
        tab2 = num1;
    }

    public void run() {
        tab2.displayTable(6);
    }
}

public class Lesson9 {
    public static void main(String[] args) {
        TableData2 tb = new TableData2();
        MyThread8 t8 = new MyThread8(tb);
        MyThread9 t9 = new MyThread9(tb);
        t8.start();
        t9.start();
    }
}
