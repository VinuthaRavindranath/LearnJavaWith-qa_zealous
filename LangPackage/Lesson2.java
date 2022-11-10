package LangPackage;

//Java.lang.Integer Class
public class Lesson2 {
    public static void main(String[] args) {
        // Integer i = new Integer(null); depcricated , cannot use constructor
        Integer a = Integer.valueOf(10);
        Integer b = 10; // two ways

        Byte c = 15;
        Byte d = Byte.valueOf("15");
        // Byte e = Byte.valueOf(15); must be a string or as below
        Byte e = Byte.valueOf(c);

        Short f = Short.valueOf("10");

        Float g = Float.valueOf(23.4f);
        Float h = 12.3f;
        Float i = Float.valueOf("23.4");

        Double j = Double.valueOf("213.44");

        int k = 27;
        Integer l = k; // autoboxing
        Integer z = Integer.valueOf(k);

        Integer m = Integer.valueOf(27);
        int n = m; // autounboxing
        int x = m.intValue();
    }
}
