package OOPS.Inheritance;
//Single Inheritance
class Employee{
    public double bonus = 5000;
}

class QualityAnalyst extends Employee{
    public double qaSalary;
}

public class Lesson1 {
    public static void main(String[] args) {
        QualityAnalyst qapay= new QualityAnalyst();
        qapay.qaSalary=12000;
        System.out.println(qapay.bonus + qapay.qaSalary);

    }
    
}
