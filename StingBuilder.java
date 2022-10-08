public class StingBuilder {
    public static void main(String[] args) {
        //StringBuilder methods 
        StringBuilder sb = new StringBuilder("Vinutha");
        sb.append( "Ravindra");
        System.out.println("Full name is:"+ sb);

        StringBuilder sb2 = new StringBuilder("Vinutha");
        System.out.println("Display char of specified index "+  sb2.charAt(6));

        StringBuilder sb3 = new StringBuilder("Vinutha Ravindra");
        sb3.reverse();
        System.out.println("Reverse the string"+ sb3);

        StringBuilder sb4 = new StringBuilder("Vinutha");
        sb4.replace(0, 1, "M");
        System.out.println("Replace a char in String"+ sb4);

        StringBuilder sb5 = new StringBuilder("Vinutha");
        sb5.delete(5, 6);
        System.out.println("Delete a char in String"+ sb5);

        StringBuilder sb6 = new StringBuilder("Vinutha ");
        sb6.insert(8, "Ravindra");
        System.out.println("Insert string"+ sb6);

        StringBuilder sb7 = new StringBuilder("Vinutha Ravindra");
        sb7.length();
        System.out.println("Length of the string "+ sb7.length());

        StringBuilder sb8 = new StringBuilder("Vinutha Ravindra");
        System.out.println("Display substring "+ sb8.substring(8 , 16));
    }
}
