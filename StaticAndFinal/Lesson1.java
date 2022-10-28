package StaticAndFinal;

//static data and static method
import java.util.Scanner;

class HondaActiva {
    public static long price = 120000;

    int a, b;

    public static double bikeOnRoadPrice(String city) {
        // only static members can be accessed inside static method, for exaample int a,
        // b cannot be accessed
        switch (city) {
            case "Bangalore":
                return price + price * 0.10;
            case "Delhi":
                return price + price * 0.12;
            case "Chennai":
                return price + price * 0.6;
            default:
                System.out.println("Enter a valid city");
        }
        return price;

    }
}

public class Lesson1 {
    public static void main(String[] args) {
        // can call the static data and static method using class name and creating an
        // object is not required
        System.out
                .println("Enter the city and the price of the bike exluding the road price is : " + HondaActiva.price);
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();

        double bikeFullAmount = HondaActiva.bikeOnRoadPrice(city);
        System.out.println(bikeFullAmount);
        sc.close();
    }
}
