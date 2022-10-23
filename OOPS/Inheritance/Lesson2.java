package OOPS.Inheritance;
//Multilevel Inheritance 
class Animal{
    public String eat;
}

class Dog extends Animal{
    public String dogBark;
    public String sniff;
}

class Puppy extends Dog{
    public String puppyFood;
}

public class Lesson2 {
    public static void main(String[] args) {
        Puppy simba = new Puppy();
        simba.eat= "Biscuits";
        simba.dogBark="woof woof";
        simba.sniff="scents";
        simba.puppyFood="milk";
        
        System.out.println(simba.eat +" "+ simba.dogBark +" "+ simba.sniff +" "+ simba.puppyFood );
    }
}
