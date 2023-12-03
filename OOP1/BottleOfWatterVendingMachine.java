import java.util.ArrayList;
import java.util.List;

public class BottleOfWatterVendingMachine implements VendingMachine {

    private List<BottleOfWatter> bottleOfWatters = new ArrayList<>();
    @Override
    public void initsProducts(List<Product> productList) {
        for(Product i : productList)
            bottleOfWatters.add((BottleOfWatter) i);
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWatter i : bottleOfWatters)
            if(i.getName().equals(name))
                return i;
        return null;
    }

    public Product getProduct(String name, double volume){
        for (BottleOfWatter i : bottleOfWatters)
            if(i.getName().equals(name) && volume == i.getVolume())
                return i;
        return null;
    }
}
