package LangPackage;

public class Lesson5 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        StringBuilder s2 = new StringBuilder("Hello");
        StringBuffer s3 = new StringBuffer("Hello");

        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}