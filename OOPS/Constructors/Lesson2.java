package OOPS.Constructors;

class Student{
    private int rollno;
    private String name;


    public Student(){
        rollno =27;
        name="Vinutha";
    }


    public Student(int roll, String n){
        rollno =roll;
        name= n;
    }

    public int getrollno(){
        return rollno;
    }

    public int setrollno(int roll){
         return rollno= roll;
    }

    public String getname(){
        return name;
    }
    public String setname(String n){
       return name= n;
   }

    public void displayDetails(){
        System.out.println(rollno +" "+ name );
    }

}

public class Lesson2 {
    public static void main(String[] args) {
        Student display1 = new Student();
        Student display2 = new Student(19, "Micky");
        display1.displayDetails();
        display2.displayDetails();
        int r = display1.setrollno(28);
        String n =display1.setname("Minny");
        System.out.println(r +" "+ n );
    }
}

