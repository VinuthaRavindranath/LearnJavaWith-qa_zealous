package LangPackage;

enum Dept {
    CS, EC, EE, IT, ME
}

// enum enumerated data types
public class Lesson7 {
    public static void main(String[] args) {
        Dept d = Dept.EC;
        System.out.println(d);
        System.out.println(d.ordinal());
        System.out.println(Dept.valueOf("CS"));

        Dept list[] = Dept.values();
        for (Dept x : list) {
            System.out.println(x);
        }

        switch (d) {// mainly used in case of switch
            case CS:
                System.out.println("Head: john and block A");
                break;
            case EC:
                System.out.println("Head: Micky and block B");
                break;
            case EE:
                System.out.println("Head: Mini and block C");
                break;
            case IT:
                System.out.println("Head: Donald and block D");
                break;
            case ME:
                System.out.println("Head: Goofy and block E");
                break;

            default:
                break;
        }
    }
}
