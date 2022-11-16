package JavaIOStreams;

//ByteArrayInputStream
import java.io.ByteArrayInputStream;

public class Lesson8 {
    public static void main(String[] args) throws Exception {
        byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

        ByteArrayInputStream bas = new ByteArrayInputStream(b);

        int i;
        while ((i = bas.read()) != -1) {
            System.out.print((char) i);
        }
        bas.close();
    }
}
