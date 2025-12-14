package Shopping;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("Laptop", 1200.0);
        Item i2 = new Item("Mouse", 25.0);
        
        Cart cart = new Cart();
        cart.addItem(i1);
        cart.addItem(i2);
        
        System.out.println("Total Cost: $" + cart.calculateTotal());
    }
}
