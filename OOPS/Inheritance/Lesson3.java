package OOPS.Inheritance;

class Employee{
    public double bonus = 5000;
}

class QualityAnalyst extends Employee{
    public double qaSalary;
}

class Developer extends Employee{
    public double devSalary;
}

public class Lesson3 {
    public static void main(String[] args) {
        QualityAnalyst qapay= new QualityAnalyst();
        Developer devpay = new Developer();
        qapay.qaSalary=12000;
        devpay.devSalary=17000;
        System.out.println(qapay.bonus + qapay.qaSalary);
        System.out.println(devpay.bonus + devpay.devSalary);
    }
}