package JavaIOStreams;

//read from two files and copy/write into new file using SequenceInputStream
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Lesson7 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 = new FileInputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest6.txt");
        FileInputStream fis2 = new FileInputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest4.txt");

        FileOutputStream fos = new FileOutputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest8.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int i;

        while ((i = sis.read()) != -1) {
            fos.write(i);
        }
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
    }
}
