package VariableArguments;

public class Lesson2 {

    public int max(int ...x){
        if (x.length==0) {
            return Integer.MIN_VALUE;
        }
        int max = x[0];
        for (int i = 1; i < x.length; i++) {
        if (x[i]>max) {
            max=x[i];
        }
    }
    return max;
}
    public static void main(String[] args) {
        Lesson2 displaymax = new Lesson2();
        System.out.println(displaymax.max());
        System.out.println(displaymax.max(10,20,30));
        System.out.println(displaymax.max(110,20,39));
        System.out.println(displaymax.max(1000,200,300,3000,8000,1399,3333));
    }
}
