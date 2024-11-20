public class FlavoursOfIceCream implements ItemType{
    private final String name;
    private final double pricePerScoop;

    public FlavoursOfIceCream(String name, double pricePerScoop) {
        this.name = name;
        this.pricePerScoop = pricePerScoop;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return pricePerScoop;
    }
}
