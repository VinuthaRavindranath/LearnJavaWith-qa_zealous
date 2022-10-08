package IfConditionExamples;
//A shop will give discount of 10% if the customer buys more than 1000 units using Teranary operator
import java.util.Scanner;
public class Lesson5 {
    public static void main(String[] args) {
        System.out.println("Enter the quantity purchased");
        Scanner sc = new Scanner(System.in);
        int quanity = sc.nextInt();
        int unitPrice = 100;
        int discount = 10;
        int grandTotal = (quanity>1000)? (quanity*unitPrice)-(((quanity*unitPrice)/100)*discount):quanity*unitPrice;
        System.out.println("Grand total : "+ grandTotal);
        sc.close();
    }
}