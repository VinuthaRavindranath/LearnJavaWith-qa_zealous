package JavaIOStreams;

//CharArrayWriter
import java.io.CharArrayWriter;

public class Lesson12 {
    public static void main(String[] args) throws Exception {
        CharArrayWriter cw = new CharArrayWriter();
        cw.write('a');
        cw.write('e');
        cw.write('i');
        cw.write('o');
        cw.write('u');

        char ch[] = cw.toCharArray();

        for (char c : ch) {
            System.out.print(c);
        }
    }
}
