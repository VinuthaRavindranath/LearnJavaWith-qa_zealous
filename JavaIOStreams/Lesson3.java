package JavaIOStreams;

//try black with resources
import java.io.FileOutputStream;

public class Lesson3 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest3.txt");) {
            String str = "Master Advance Java prgramming";
            byte b[] = str.getBytes();
            fos.write(b);
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
