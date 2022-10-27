package OOPS.Interface;

//CallBack method
class Store {
    Member mem[] = new Member[100];
    int count = 0;

    public void register(Member m) {
        mem[count++] = m;
    }

    public void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

interface Member {
    public void callback();
}

class Customer implements Member {
    String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void callback() {
        System.out.println("I will visit, " + customerName);
    }
}

public class Lesson3 {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Micky");
        Customer c2 = new Customer("Mini");
        Customer c3 = new Customer("Donald");
        Customer c4 = new Customer("Goofy");
        s.register(c1);
        s.register(c2);
        s.register(c3);
        s.register(c4);
        s.inviteSale();
    }
}
