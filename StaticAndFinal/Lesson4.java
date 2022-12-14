package StaticAndFinal;

//Singleton (only one object)
class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    private static CoffeeMachine my = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;

    }

    public void fillCoffee(float qty) {
        coffeeQty = qty;
    }

    public void fillMilk(float qty) {
        milkQty = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    public static CoffeeMachine getInstance() {
        if (my == null) {
            my = new CoffeeMachine();
        }
        return my;
    }

}

public class Lesson4 {
    public static void main(String[] args) {
        // CoffeeMachine cm = new CoffeeMachine();// cannot create object like this when
        // a constructor is made private

        CoffeeMachine cm1 = CoffeeMachine.getInstance();
        CoffeeMachine cm2 = CoffeeMachine.getInstance();
        CoffeeMachine cm3 = CoffeeMachine.getInstance();
        System.out.println(cm1 + " " + cm2 + " " + " " + cm3);
        if (cm1 == cm2 && cm1 == cm3) {
            System.out.println("Same");
        }
    }

}
