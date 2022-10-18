package VariableArguments;

public class Lesson3 {

    public int sum(int ...x){
        int sum =0;
        for (int i = 0; i < x.length; i++) {
            sum = sum+x[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Lesson3 displaySum = new Lesson3();
        System.out.println(displaySum.sum(2500, 2500));
        System.out.println(displaySum.sum(2500, 2500, 5000));
        System.out.println(displaySum.sum(12500, 500, 50));
    }
}
