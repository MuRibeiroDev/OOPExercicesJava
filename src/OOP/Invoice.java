public class Invoice {


    private int number;
    private String description;
    private int quantity_purchased;
    private double price_item;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity_purchased() {
        return quantity_purchased;
    }

    public void setQuantity_purchased(int quantity_purchased) {
        if (quantity_purchased > 0) {
            this.quantity_purchased = quantity_purchased;
        } else {
            this.quantity_purchased = 0;
        }
    }

    public double getPrice_item() {
        return price_item;
    }

    public void setPrice_item(double price_item) {
        if (price_item > 0.0) {
            this.price_item = price_item;
        } else {
            this.price_item = 0.0;
        }
    }

    // constructor
    public Invoice(int number, String description, int quantity_purchased, double price_item) {
        this.setNumber(number);
        this.description = description;
        this.quantity_purchased = quantity_purchased;
        this.setPrice_item(price_item);
    }

    // Method to calculate the total invoice amount.
    public double getTotalInvoice() {
        double total = quantity_purchased * price_item;
        return total > 0 ? total : 0.0;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice(01, "Keyboard", 3, 74.0);

        System.out.println("Details of Invoice:");
        System.out.println("Number: " + invoice.getNumber());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity_purchased());
        System.out.println("Price: " + invoice.getPrice_item());
        System.out.println("Total: " + invoice.getTotalInvoice());
    }
}


