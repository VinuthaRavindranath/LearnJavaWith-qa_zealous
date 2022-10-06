import java.util.Scanner;

public class Fizzbuss {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();

        for (int i = 1; i < num; i++) {
            if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println("FizzBuss");
            }
            else if(i % 5 == 0){
                System.out.println("Fizz");
            }
            else if(i % 7 == 0){
                System.out.println("Buss");
            }
            else{
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
