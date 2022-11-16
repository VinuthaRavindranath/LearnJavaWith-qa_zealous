package JavaIOStreams;

// using BufferedInputStream , mark and reset methods
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Lesson14 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest8.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.close();
        fis.close();
    }
}
