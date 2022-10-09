package ForLoopExamples;
// Program to find the sum of natural numbers from 1 to 1000.
public class Lesson3 {
    public static void main(String[] args) {
        int n =1000;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        System.out.println(sum);

        //The above program to add the sum of natural numbers can also be written as 
        for (int i = n; i >= 1; --i) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
