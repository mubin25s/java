package Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza p = new Pizza("Large");
        p.addTopping("Cheese");
        p.addTopping("Pepperoni");
        System.out.println(p);
        System.out.println("Price: $" + p.calculatePrice());
    }
}
