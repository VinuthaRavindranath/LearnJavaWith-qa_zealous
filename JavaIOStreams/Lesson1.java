package JavaIOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lesson1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(
                    "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest1.txt");
            String str = "Learn Java prgramming";
            fos.write(str.getBytes());
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
