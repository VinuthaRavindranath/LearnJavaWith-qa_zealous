package OOPS.Inheritance;
//paramterized constructors in inheritace using super()
class Platform {
    public Platform() {
        System.out.println("Hardware of four seater");
    }

    public Platform(String seater) {
        seater ="6 seats";
        System.out.println("Hardware of six seater"+ " "+ seater);
    }
}

class DesignBody extends Platform {
    public DesignBody() {
        System.out.println("Body of metal");
    }

    public DesignBody(String material) {
        super(material);
        material= "STEEL material";
        System.out.println("Body of metal of steel"+" "+ material);
    }
}

class Swift extends DesignBody {
    public Swift() {
        System.out.println("Latest Maruti Swift ZXI Plus");
    }

    public Swift(int modelno, String color) {
        super(color);
        System.out.println("Maruti Swift is a 6 seater Hatchback" + " " +modelno+" "+ color);
    }
}

class SwiftDzire extends Swift {
    public SwiftDzire() {
        System.out.println("Maruti Suzuki Dzire VXI");
    }

    public SwiftDzire(int modelno, String color) {
        super(modelno, color);
        System.out.println("Maruti Suzuki Dzire  is a 6 seater Hatchback" + " " +modelno+" "+ color);
    }
}

public class Lesson5 {
    public static void main(String[] args) {
         SwiftDzire swiftDzire = new SwiftDzire();
         SwiftDzire swiftcar = new SwiftDzire(12, "Black");
    }
}
