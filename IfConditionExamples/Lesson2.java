package IfConditionExamples;
import java.util.Scanner;
//A shop will give discount of 10% if the customer buys more than 1000 units
public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Enter the quantity purchased");
        Scanner sc = new Scanner(System.in);
        int quanity = sc.nextInt();
        int unitPrice = 100;
        int discount = 10;
        int subtotal = quanity*unitPrice;

        if (quanity>1000) {
            int discountOnTotal = (subtotal/100)*discount;
            int grandTotal = subtotal-discountOnTotal;
            System.out.println("Grand total with 10% discount is : "+ grandTotal);
        } else {
            System.out.println("Grand total : "+ subtotal);
        }
        sc.close();
    }
    
}
