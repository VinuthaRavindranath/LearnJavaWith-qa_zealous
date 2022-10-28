package StaticAndFinal;

//static blocks
class Test {
    static {
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
    }
}

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("main block");
        Test t = new Test();// create an object as there is nothing to call from Test class
    }
}
