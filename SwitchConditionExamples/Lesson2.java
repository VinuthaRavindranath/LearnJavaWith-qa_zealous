package SwitchConditionExamples;
//Java program using nested switch
import java.util.Scanner;
public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Enter the year of the student in engineering");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println("Enter the marks of the student");
        int marks=sc.nextInt();

        switch (year) {
            case 1:
            System.out.println("Student is in 1st year of engineering");
                break;
                case 2:
                System.out.println("Student is in 2nd year of engineering");
                break;
                case 3:
                System.out.println("Student is in 3rd year of engineering");
                break;
                case 4: switch (marks) {
                    case 30:
                    System.out.println("Student is in 4th year of engineering");
                    System.out.println("Student Failed");
                        break;
                        case 60:
                        System.out.println("Student is in 4th year of engineering");
                        System.out.println("Student Passed");
                        break;
                        case 80:
                        System.out.println("Student is in 4th year of engineering");
                        System.out.println("Student Passed with desctintion");
                        break;
                }
                break;
            default:
            System.out.println("Please enter valid year");
        }
   }
}
