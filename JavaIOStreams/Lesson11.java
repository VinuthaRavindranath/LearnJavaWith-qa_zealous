package JavaIOStreams;

//CharArrayReader
import java.io.CharArrayReader;

public class Lesson11 {
    public static void main(String[] args) throws Exception {
        char c[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
        CharArrayReader cr = new CharArrayReader(c);
        int i;

        while ((i = cr.read()) != -1) {
            System.out.print((char) i);
        }
        cr.close();
    }
}
