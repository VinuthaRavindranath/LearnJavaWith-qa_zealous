package OOPS.Abstraction;

//Hospital is one that defines the standards to open a new hoispital/My hospital
abstract class Hospital {
    abstract public void emergency();

    abstract public void beds();

    abstract public void phramacy();

    abstract public void billing();
}

class MyHospital extends Hospital {
    @Override
    public void emergency() {
        System.out.println("A hospital must have emergency");
    }

    @Override
    public void beds() {
        System.out.println("A hospital must have beds");
    }

    @Override
    public void phramacy() {
        System.out.println("A hospital must have phramacy");
    }

    @Override
    public void billing() {
        System.out.println("A hospital must have billing");
    }
}

public class Lesson2 {
    public static void main(String[] args) {
        Hospital hospital = new MyHospital();
        hospital.emergency();
        hospital.beds();
        hospital.phramacy();
        hospital.billing();
    }
}
