package JavaIOStreams;

//ByteArrayOutputStream
import java.io.ByteArrayOutputStream;

public class Lesson9 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');

        byte[] b = bos.toByteArray();
        for (byte d : b) {
            System.out.print((char) d);
        }

        bos.close();
    }
}
