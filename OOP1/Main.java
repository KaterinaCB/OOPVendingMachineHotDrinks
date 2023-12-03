import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> bottleOfWatters = new ArrayList<>();
        bottleOfWatters.add(new BottleOfWatter("123", 123, 13));
        bottleOfWatters.add(new BottleOfWatter("123", 123, 12));
        bottleOfWatters.add(new BottleOfWatter("897", 123, 123));
        BottleOfWatterVendingMachine bottle = new BottleOfWatterVendingMachine();
        bottle.initsProducts(bottleOfWatters);
        System.out.println(bottle.getProduct("123", 12));

        List<Product> hotDrink = new ArrayList<>();
        hotDrink.add(new HotDrink("cofe", 65,500, 100));
        hotDrink.add(new HotDrink("tea", 45, 250,70));
        hotDrink.add(new HotDrink("late", 80, 500,100));
        HotDrinksVendingMachine hotD = new HotDrinksVendingMachine();
        hotD.initsProducts(hotDrink);
        System.out.println(hotD.getProduct("cofe",500,100));

    }
}