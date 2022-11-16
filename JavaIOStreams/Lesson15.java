package JavaIOStreams;

//using FileReader, BufferedReader along with mark and reset methods also used readLine()
import java.io.BufferedReader;
import java.io.FileReader;

public class Lesson15 {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest8.txt");
        BufferedReader bis = new BufferedReader(fis);

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
        System.out.print(bis.readLine());

        bis.close();
        fis.close();
    }
}
