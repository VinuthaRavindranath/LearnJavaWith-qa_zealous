package JavaIOStreams;

// using BufferedInputStream
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Lesson13 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest9.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int i;
        while ((i = bis.read()) != -1) {
            System.out.print((char) i);
        }
        bis.close();
        fis.close();
    }
}
