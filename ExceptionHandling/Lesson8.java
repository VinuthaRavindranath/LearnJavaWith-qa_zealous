package ExceptionHandling;

//Checked Exception - ileNotFoundException(complietime)
import java.io.*;

class Demo5 {
    static void fun1() throws FileNotFoundException {
        try (FileInputStream fi = new FileInputStream("my.txt")) {
            fi.toString();
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Lesson8 {
    public static void main(String[] args) throws FileNotFoundException {
        Demo5.fun1();
    }
}
