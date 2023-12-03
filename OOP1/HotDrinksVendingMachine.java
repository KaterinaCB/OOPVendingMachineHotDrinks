import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<HotDrink> hotDrinks = new ArrayList<>();


    @Override
    public void initsProducts(List<Product> productList) {
        for(Product i : productList)
            hotDrinks.add((HotDrink) i);
    }


    @Override
    public Product getProduct(String name) {
        for (HotDrink i : hotDrinks)
            if(i.getName().equals(name))
                return i;
        return null;
    }

    public Product getProduct(String name, double volume, int temperature){
        for (HotDrink i : hotDrinks)
            if(i.getName().equals(name) && volume == i.getVolume() && temperature == i.getTemperature())
                return i;
        return null;
    }
}
