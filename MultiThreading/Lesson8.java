package MultiThreading;

//Not synchronized
class TableData {
    public void displayTable(int n) {
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

class MyThread6 extends Thread {
    TableData tab1;

    public MyThread6(TableData num1) {
        tab1 = num1;
    }

    public void run() {
        tab1.displayTable(5);
    }
}

class MyThread7 extends Thread {
    TableData tab2;

    public MyThread7(TableData num2) {
        tab2 = num2;
    }

    public void run() {
        tab2.displayTable(6);
    }
}

public class Lesson8 {
    public static void main(String[] args) {
        TableData td = new TableData();
        MyThread6 t6 = new MyThread6(td);
        MyThread7 t7 = new MyThread7(td);
        t6.start();
        t7.start();
    }
}
