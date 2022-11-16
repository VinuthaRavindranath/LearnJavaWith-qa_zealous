package JavaIOStreams;

//ByteArrayOutputStream
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Lesson10 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');

        bos.writeTo(new FileOutputStream(
                "/Users/vinuthar/Desktop/LearnJava/LearnJavaWith-qa_zealous/JavaIOStreams/iotest9.txt"));

        bos.close();
    }
}
