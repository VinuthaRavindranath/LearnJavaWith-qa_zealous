package JavaIOStreams;

////write and read the file using FileReader
import java.io.FileOutputStream;
import java.io.FileReader;

public class Lesson5 {
    public static void main(String[] args) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest5.txt");) {
            String str = "Today is Monday, date:Nov14th ";
            byte b[] = str.getBytes();
            fos.write(b);
            fos.close();

        }
        try (FileReader fr = new FileReader(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest5.txt");) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        }
    }
}
