package OOPS.Constructors;

public class Lesson1 {
    public int rollno;
    public String name;

    public Lesson1(){
        rollno =27;
        name="Vinutha";
    }


    public Lesson1(int roll, String n){
        rollno =roll;
        name= n;
    }

    public void displayDetails(){
        System.out.println(rollno +" "+ name );
    }



    public static void main(String[] args) {
        Lesson1 display1 = new Lesson1();
        Lesson1 display2 = new Lesson1(19, "Micky");
        display1.displayDetails();
        display2.displayDetails();
    }
}

