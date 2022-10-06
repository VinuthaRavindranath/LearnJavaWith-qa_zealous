import java.util.Scanner;

public class Cashier {
    /*
     * FOR LOOP:
     * Write a cashier program that will scan a given number of items and tally the
     * cost.
     */
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);
        int itemsQuanity = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < itemsQuanity; i++) {
            System.out.println("enter the cost of each items");
            double cost = scanner.nextDouble();
            total = total + cost;
        }
        scanner.close();
        System.out.println("the total is $ "+ total);
    }
}
