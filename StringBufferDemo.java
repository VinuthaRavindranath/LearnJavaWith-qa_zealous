public class StringBufferDemo {
    public static void main(String[] args) {
        //StringBuffer methods 
        StringBuffer sb = new StringBuffer("Vinutha");
        sb.append( "Ravindra");
        System.out.println("Full name is:"+ sb);

        StringBuffer sb2 = new StringBuffer("Vinutha");
        System.out.println("Display char of specified index "+  sb2.charAt(6));

        StringBuffer sb3 = new StringBuffer("Vinutha Ravindra");
        sb3.reverse();
        System.out.println("Reverse the string"+ sb3);

        StringBuffer sb4 = new StringBuffer("Vinutha");
        sb4.replace(0, 1, "M");
        System.out.println("Replace a char in String"+ sb4);

        StringBuffer sb5 = new StringBuffer("Vinutha");
        sb5.delete(5, 6);
        System.out.println("Delete a char in String"+ sb5);

        StringBuffer sb6 = new StringBuffer("Vinutha ");
        sb6.insert(8, "Ravindra");
        System.out.println("Insert string"+ sb6);

        StringBuffer sb7 = new StringBuffer("Vinutha Ravindra");
        sb7.length();
        System.out.println("Length of the string "+ sb7.length());

        StringBuffer sb8 = new StringBuffer("Vinutha Ravindra");
        System.out.println("Display substring "+ sb8.substring(8 , 16));
    }
}
