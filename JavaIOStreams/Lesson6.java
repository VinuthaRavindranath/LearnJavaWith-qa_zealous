package JavaIOStreams;

//read and write, read the data of a file and copy/write it into another file
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lesson6 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest6.txt");
        FileOutputStream fos = new FileOutputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest7.txt");
        int i;
        while ((i = fis.read()) != -1) {
            if (i >= 65 && i <= 90) {
                fos.write(i + 32);
            } else {
                fos.write(i);
            }
        }
        fis.close();
        fos.close();
    }
}
