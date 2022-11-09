package MultiThreading;

class ATM {
    synchronized public void checkBalance(String customerName, int balance) {
        System.out.println(customerName + " has the balance amount of : " + balance);
    }

    synchronized public void withdrawAmount(String customerName, int amount) {
        System.out.println(customerName + " withdrew amount of : " + amount);
    }
}

class Customer1 extends Thread {
    ATM atm;

    public Customer1(ATM atm) {
        this.atm = atm;
    }

    public void useAtm() {
        atm.checkBalance("Vinutha", 3000);
        atm.withdrawAmount("Vinutha", 100);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        useAtm();
    }

}

class Customer2 extends Thread {
    ATM atm;

    public Customer2(ATM atm) {
        this.atm = atm;
    }

    public void useAtm() {
        atm.checkBalance("Micky", 5000);
        atm.withdrawAmount("Micky", 500);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        useAtm();
    }
}

class Customer3 extends Thread {
    ATM atm;

    public Customer3(ATM atm) {
        this.atm = atm;
    }

    public void useAtm() {
        atm.checkBalance("Minni", 7000);
        atm.withdrawAmount("Minni", 700);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        useAtm();
    }
}

class Customer4 extends Thread {
    ATM atm;

    public Customer4(ATM atm) {
        this.atm = atm;
    }

    public void useAtm() {
        atm.checkBalance("Donald", 4000);
        atm.withdrawAmount("Donald", 400);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        useAtm();
    }
}

public class Lesson10 {
    public static void main(String[] args) {
        ATM machine = new ATM();
        Customer1 c1 = new Customer1(machine);
        Customer2 c2 = new Customer2(machine);
        Customer3 c3 = new Customer3(machine);
        Customer4 c4 = new Customer4(machine);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
