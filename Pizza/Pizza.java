package Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private List<String> toppings;

    public Pizza(String size) {
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public double calculatePrice() {
        double price = size.equals("Large") ? 15.0 : 10.0;
        price += toppings.size() * 1.5;
        return price;
    }

    public String toString() {
        return size + " Pizza with " + toppings.toString();
    }
}
