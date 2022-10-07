public class StringDemo {
    public static void main(String[] args) {
        String s1="Vinuthas1"; //using string literals
        char[] ch = {'V','i','n','u','t','h','a','s','2'};
        String s2= new String(ch);//using char array
        String s3 = new String("Vinuthas3"); //using new keyword
        byte[] by= {'V','i','n','u','t','h','a','s','4'};
        String s4 = new String(by);//using byte array

        System.out.println("Printing s1: " + s1);
        System.out.println("Printing s2: " + s2);
        System.out.println("Printing s3: " + s3);
        System.out.println("Printing s4: " + s4);
    }
}
