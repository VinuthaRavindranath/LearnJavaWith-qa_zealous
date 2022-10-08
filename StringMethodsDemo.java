public class StringMethodsDemo {
    public static void main(String[] args) {
        String s1= "Vinutha";
        String s2= new String("Vinutha");
        String s3= new String("Vinutha Ravindra  ");
        char chr[]={'j','a','v','a'};  

        System.out.println("get char by index: " + s1.charAt(2));
        System.out.println("concat with substring:"+ s1.concat(" Ravindra"));
        System.out.println("name contains "+ s1.contains("Vinu"));
        System.out.println("compare" +s1.compareTo("Vinutha"));
        System.out.println("original string ends with" +s1.endsWith("a"));
        System.out.println("equals() method" + s1.equals(s2));
        System.out.println("compare value by ignoring the case sensitive"+s1.equalsIgnoreCase("vinutha"));
        System.out.println("get the bytes of the original string"+s1.getBytes());
        System.out.println("get index of a char in a string "+ s1.indexOf("V"));
        System.out.println("to convert the string into chars of array"+s1.toCharArray().length);
        System.out.println("to check if the string is empty"+s1.isEmpty());
        System.out.println("To join strings"+ s1.join("tha-", "Vinu","Ravi"));
        
        String[] arrOfStr = s3.split(" "); 

        for (String a : arrOfStr) 
            System.out.println("Spliting string"+a);

        System.out.println("Replace"+s1.replace("V", "M"));
        System.out.println("get substring from original string"+s3.substring(8));
        System.out.println("trim white space"+s3.trim().length());
        System.out.println("Upper case "+ s3.toUpperCase());
        System.out.println("Lower case "+ s3.toLowerCase());

        String s4 = String.valueOf(chr);
        System.out.println("valueOf() to convert char[] into string: "+ s4);
    }
}
