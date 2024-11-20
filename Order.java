import java.util.ArrayList;
import java.util.List;

public class Order {
    List<ItemType> items = new ArrayList<>();
    boolean waffleConeIncluded;

    public void addItem(ItemType item){
        items.add(item);
    }

    public List<ItemType> getItems() {
        return items;
    }

    public void setWaffleCone(boolean waffleCone) {
        this.waffleConeIncluded = waffleCone;
    }

    public boolean getWaffleCone(){
        return waffleConeIncluded;
    }

    public double calculateSubtotal() {
        double subtotal = items.stream().mapToDouble(ItemType::getPrice).sum();
        if (waffleConeIncluded) {
            subtotal += 5.00;
        }

        return subtotal;
    }

    public double calculateTax() {
        return calculateSubtotal() * 0.08; 
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
}
