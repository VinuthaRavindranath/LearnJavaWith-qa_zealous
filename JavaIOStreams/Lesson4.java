package JavaIOStreams;

//write and read the file using FileInputStream
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lesson4 {
    public static void main(String[] args) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest4.txt");) {
            String str = "I'm loving Java prgramming";
            byte b[] = str.getBytes();
            fos.write(b);
            fos.close();
        }
        try (FileInputStream fis = new FileInputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest4.txt")) {
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
        }
    }
}
