package VariableArguments;

public class Lesson1 {
    
    public void showNumbers(int ...x){
        for (int numbers : x) {
            System.out.println(numbers);     
        }
    }

    public void shownames(String ...name){
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);   
        }

    }
    public static void main(String[] args) {
        Lesson1 display = new Lesson1();
        display.showNumbers(1, 2, 3 , 4 , 5, 6, 7 ,8 , 9 ,10);
        display.showNumbers(100, 200 ,300);
        display.showNumbers(10);
        display.shownames("Micky","Minny","Donald","Goffy");
        display.shownames("Micky","Minny");
    }
}
