import java.util.Scanner;

public class AreaOfTriangle {
    //Demo of arithmetic operators

    public static void main(String[] args) {
        System.out.println("Enter the base value ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();

        System.out.println("Enter the height value ");
        int height = scanner.nextInt();

        scanner.close();

        int area = (base*height)/2;
        System.out.println("Area of the triangle: " + area);
    }
}
