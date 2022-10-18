package OOPS.Polymorphism.MethodOverloading;
//find max number using method overloading concept
import java.util.Scanner;

public class Lesson1 {
    
    public int max(int x , int y){
        return x>y?x:y;
    }

    public int max(int x , int y, int z){
        return (x>y)?((x>z)?x:z):((y>z)?y:z);
    }

    public float max(float x , float y, float z){
        return (x>y)?((x>z)?x:z):((y>z)?y:z);
    }


    public static void main(String[] args) {
        System.out.println("Enter three int numbers and three float numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); int y = sc.nextInt(); int z = sc.nextInt();
        float a = sc.nextFloat(); float b = sc.nextFloat(); float c = sc.nextFloat();

        Lesson1 findmax = new Lesson1();

        int maxTwoNumbers = findmax.max(x, y);
        System.out.println("Max of two numbers : "+ maxTwoNumbers);

        int maxThreeNumbers = findmax.max(x, y, z);
        System.out.println("Max of two numbers : "+ maxThreeNumbers);

        float maxThreeFloatNumbers =findmax.max(a, b, c);
        System.out.println("Max of two numbers : "+ maxThreeFloatNumbers);

        sc.close();
    }
}
