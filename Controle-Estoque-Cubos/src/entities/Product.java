package entities;

import CubeTypes.*;

public class Product extends CubeStock {

    public String type;
    public double price;
    private nxnxn nxnxn;
    private otherPuzzels otherPuzzels;

    public Product() {
        this.price = 50;
        nxnxn = new nxnxn();
        otherPuzzels = new otherPuzzels();
    }

    public double totalValueInNxnxn() {
        return nxnxn.getQuantity() * price;
    }

    public double totalValueInOtherPuzzels() {
        return otherPuzzels.getQuantity() * price;
    }

    public void addProducts(String type, int quantity) {

        if (type.equals("nxnxn")) {
            nxnxn.Add(quantity);
        } else if (type.equals("otherpuzzels")) {
            otherPuzzels.Add(quantity);
        }
    }

    public void RemoveProducts(String type, int quantity) {

        if (type.equals("nxnxn")) {
            nxnxn.Remove(quantity);
        } else if (type.equals("otherpuzzels")) {
            otherPuzzels.Remove(quantity);
        }
    }

    public String nxnxnQuantity (){
       return type
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + nxnxn.getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn());
    }

    public String otherPuzzelsQuantity (){
        return type
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + otherPuzzels.getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInOtherPuzzels());
    }
}
