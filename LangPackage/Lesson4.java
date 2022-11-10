package LangPackage;

public class Lesson4 {

    public static void main(String[] args) {
        float a = 123.45f;
        Float b = Float.valueOf("123.45");
        float c = 0.f;
        Float d = (float) Math.sqrt(-1);

        System.out.println(b.equals(a));
        System.out.println(a / c);
        System.out.println(b.isInfinite());
        System.out.println(Float.isInfinite(a / c));
        System.out.println(d.isNaN());

        char ch1 = 'a';
        char ch3 = 'A';
        Character ch2 = Character.valueOf('a');
        Character ch4 = Character.valueOf('A');
        System.out.println(ch2.equals(ch1));
        System.out.println(ch2.equals(ch3));
        System.out.println(ch2.equals(Character.toLowerCase(ch4)));

        boolean b1 = true;
        Boolean b2 = Boolean.valueOf(true);
        System.out.println(b2.equals(b1));
    }
}
