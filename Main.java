public class Main {
    public static void main(String[] args) {
       FlavoursOfIceCream mintChocolateChip = new FlavoursOfIceCream("Mint Chocolate Chip - 1 scoop", 2.80);
       FlavoursOfIceCream chocolateFudge = new FlavoursOfIceCream("Chocolate Fudge - 1 scoop", 3.00);

        ToppingsOfIceCream chocolateChips = new ToppingsOfIceCream("Chocolate Chips - 1 time", 0.50);
        ToppingsOfIceCream freshStrawberries = new ToppingsOfIceCream("Fresh Strawberries - 1 time", 1.00);

        Order order = new Order();
        order.addItem(mintChocolateChip);
        order.addItem(chocolateFudge);
        order.addItem(chocolateChips);
        order.addItem(freshStrawberries);
        order.addItem(freshStrawberries); 
        order.setWaffleCone(true);

        // Generate and save the invoice
        Invoice invoice = new Invoice(order);
        String fileName = "IceCreamInvoice.txt";
        invoice.saveToFile(fileName);

        System.out.println("Invoice saved to " + fileName);
    }
}
