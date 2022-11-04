package ExceptionHandling;

//finally keyword(if catch block is not present then finally can be used

public class Lesson13 {
    static int meth1(int a, int b) throws Exception {
        try {
            if (a < 0 || b < 0) {
                throw new Exception("Value should not be nagative");
            }

        } finally {
            // this message willdefinitly execute
            System.out.println("Final Message");

        }
        return a * b;
    }

    public static void main(String[] args) throws Exception {
        meth1(10, -2);
    }
}
