import java.util.Scanner;
/*
Switch
*/
public class TestResults {
    public static void main(String[] args) {
        System.out.println("Enter the test garde of the student");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;

        switch (grade) {
            case "A":
                message = "Excellet Job !!!";
                break;
            case "B":
                message = "God Job !!!";
                break;
            case "C":
                message = "Can do better";
                break;
            case "D":
                message = "You must work harder";
                break;
            case "F":
                message = "Fail";
                break;
            default:
                message = "invalid grade";
                break;
        }
        System.out.println("Your result is " + message);
    }

}
