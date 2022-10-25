package OOPS.Polymorphism.MethodOverriding;

class Television {
    public void switchOn() {
        System.out.println("Swith on CRT Television");
    }

    public void changeChannel() {
        System.out.println("Change channel of CRT Television");
    }

    public void adjustVolume() {
        System.out.println("Change Volume of CRT Television");
    }

    public void adjustBrightness() {
        System.out.println("Change brightness of CRT Television");
    }
}

class SmartTelevision extends Television {
    @Override
    public void switchOn() {
        System.out.println("Swith on Smart Television");
    }

    @Override
    public void changeChannel() {
        System.out.println("Change channel of Smart Television");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Change Volume of Smart Television");
    }

    public void browseOTT() {
        System.out.println("Browse on OTT in the Smart Television");
    }
}

public class Lesson2 {
    public static void main(String[] args) {
        Television tv = new SmartTelevision();
        tv.switchOn(); // dynamic method dispatch
        tv.adjustVolume(); // dynamic method dispatch
        tv.changeChannel(); // dynamic method dispatch
        tv.adjustBrightness();
        // tv.browseOTT(); is not possible, will throw an error

        SmartTelevision stv = new SmartTelevision();
        stv.browseOTT();
    }
}
