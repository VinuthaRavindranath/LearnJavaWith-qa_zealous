package ArraysExamples;
//Inserting an Element
public class Lesson10 {
    
    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=5;A[1]=10;A[2]=20;A[3]=25;A[4]=30;A[5]=35;
        
        int n=A.length-3;
        
        for(int i=0;i<n;i++)
        System.out.print(A[i]+",");
        System.out.println("");
     
        int x=15;
        int index=2;
        
        for(int i=n;i>index;i--)
        A[i]=A[i-1];
        A[index]=x;
        
        for(int i=0;i<n;i++)
        System.out.print(A[i]+",");
        System.out.println("");
    }
}
