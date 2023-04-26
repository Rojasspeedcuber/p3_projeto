package entities;

public class Product extends CubeStock {

    public String type;
    public double price;
    public int quantity;

    public Product() {
        this.price = 50;
        this.quantity = 100;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(String type, int quantity) {

        if (type.equals("nxnxn")) {
            this.quantity += quantity;
        } else if (type.equals("otherpuzzels")) {
            this.quantity += quantity;
        }
    }

    public void RemoveProducts(String type, int quantity) {

        if (type.equals("nxnxn")) {
            this.quantity -= quantity;
        } else if (type.equals("otherpuzzels")) {
            this.quantity -= quantity;
        }
    }

    public String toString() {
        return type
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }

}
