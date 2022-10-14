package ArraysExamples;
//to find the second max element in an array
import java.util.Scanner;

public class Lesson7 {

    public int[] array(){
        int A[]=new int[5];
        System.out.println("enter the values of an array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }
        sc.close();
        return A;
    }
    
    public static void main(String[] args) {
        Lesson7 values = new Lesson7();
        int arrelements[] =values.array();
        int max1= arrelements[0];
        int max2= arrelements[0];
        for (int maxelement : arrelements) {
            if (maxelement> max1) {
                max2=max1;
                max1 = maxelement;
            }
            else if (maxelement>max2){
                max2 = maxelement;
            }
            
        }
        System.out.println("max2 : " + max2);

    }
}
