package Strings;

public class StringImmutable {
    public static void main(String[] args) {
        String firstName = "Vinutha";
        firstName.concat(" Ravindra");
        System.out.println("FullName is : " + firstName);/// will print only Vinutha because strings are immutable
                                                         /// objects
        firstName = firstName.concat(" Ravindra");
        System.out.println("FullName is : " + firstName);// f we explicitly assign it to the reference variable, it will
                                                         // refer to "Vinutha Ravindra" object.
    }
}
