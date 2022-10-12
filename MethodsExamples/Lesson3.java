package MethodsExamples;
//Passing object as parameter 
public class Lesson3 {
    public void updateArray(int A[]){
        A[0]=27;
    }

    public static void main(String[] args) {
        int A[] ={2,3,4,5,6,7,8,9};
        Lesson3 update = new Lesson3();
        update.updateArray(A);
        System.out.println(A[0]);
    }
}
