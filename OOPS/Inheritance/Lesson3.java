package OOPS.Inheritance;

class EmployeeNew{
    public double bonus = 5000;
}

class QualityAnalystNew extends EmployeeNew{
    public double qaSalary;
}

class Developer extends EmployeeNew{
    public double devSalary;
}

public class Lesson3 {
    public static void main(String[] args) {
        QualityAnalystNew qapay= new QualityAnalystNew();
        Developer devpay = new Developer();
        qapay.qaSalary=12000;
        devpay.devSalary=17000;
        System.out.println(qapay.bonus + qapay.qaSalary);
        System.out.println(devpay.bonus + devpay.devSalary);
    }
}