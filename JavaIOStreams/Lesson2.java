package JavaIOStreams;

//write byte by byte
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lesson2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(
                    "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest2.txt");
            String str = "Master Java prgramming";
            byte b[] = str.getBytes();
            for (byte d : b) {
                fos.write(d);
            }
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
