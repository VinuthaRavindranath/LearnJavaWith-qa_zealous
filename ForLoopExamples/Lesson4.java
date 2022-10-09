package ForLoopExamples;
//nested for loops to create a pattern
public class Lesson4 {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");  
            }  
            System.out.println();//new line  
        } 
    }
}
