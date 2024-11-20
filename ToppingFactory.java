import java.util.Map;
import java.util.HashMap;

public class ToppingFactory {
    private static final Map<String, ToppingsOfIceCream> toppings = new HashMap<>();

    static {
        toppings.put("Sprinkles", new ToppingsOfIceCream("Sprinkles", 0.30));
        toppings.put("Marshmallow", new ToppingsOfIceCream("Marshmallow", 0.70));
        toppings.put("Crushed Oreo", new ToppingsOfIceCream("Crushed Oreo", 0.85));
        toppings.put("Fresh Strawberries", new ToppingsOfIceCream("Fresh Strawberries", 1.00));
        toppings.put("Chocolate Chips", new ToppingsOfIceCream("Chocolate Chips", 0.50));
    }

    public static ToppingsOfIceCream getTopping(String name) {
        return toppings.get(name);
    }
}
