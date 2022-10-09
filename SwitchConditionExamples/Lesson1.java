package SwitchConditionExamples;
//Java program to check if a given character is a vowel or not
import java.util.Scanner;
public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (Character.toLowerCase(ch)) {
            case 'a':
            System.out.println("Vowel");
                break;
                case 'e':
                System.out.println("Vowel");
                    break;
                    case 'i':
                System.out.println("Vowel");
                    break;
                    case 'o':
                    System.out.println("Vowel");
                        break;
                        case 'u':
                        System.out.println("Vowel");
                            break;

            default:
            System.out.println("Not a Vowel");
        }
        sc.close();
    }
}
