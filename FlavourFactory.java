import java.util.Map;
import java.util.HashMap;

public class FlavourFactory {
    private static final Map<String, FlavoursOfIceCream> flavors = new HashMap<>();

    static {
        flavors.put("Mint Chocolate Chip", new FlavoursOfIceCream("Mint Chocolate Chip", 2.80));
        flavors.put("Chocolate Fudge", new FlavoursOfIceCream("Chocolate Fudge", 3.00));
        flavors.put("Strawberry Swirl", new FlavoursOfIceCream("Strawberry Swirl", 2.75));
        flavors.put("Pistachio Delight", new FlavoursOfIceCream("Pistachio Delight", 3.25));
    }

    public static FlavoursOfIceCream getFlavor(String name) {
        return flavors.get(name);
    }
}
