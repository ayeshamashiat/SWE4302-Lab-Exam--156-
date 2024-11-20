import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Invoice {
    private final Order order;

    public Invoice(Order order) {
        this.order = order;
    }

    public String generateInvoiceText() {
        StringBuilder invoice = new StringBuilder();
        invoice.append("Ice Cream Shop Invoice\n");

        for (ItemType item : order.getItems()) {
            invoice.append(String.format("%s: $%.2f\n", item.getName(), item.getPrice()));
        }

        if (order.getWaffleCone()) {
            invoice.append("Waffle Cone: $5.00\n");
        }

        double subtotal = order.calculateSubtotal();
        double tax = order.calculateTax();
        double total = order.calculateTotal();

        invoice.append(String.format("Subtotal: $%.2f\n", subtotal));
        invoice.append(String.format("Tax: $%.2f\n", tax));
        invoice.append(String.format("Total Amount Due: $%.2f\n", total));

        return invoice.toString();
    }

    public void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(generateInvoiceText());
        } catch (IOException e) {
            System.err.println("Error writing invoice to file: " + e.getMessage());
        }
    }
}
