package entities;

import CubeTypes.*;

public class Product extends CubeStock {

    public String type;
    public double price;
    private nxnxn[] nxnxn; //[0] - 2x2 [1] - 3x3 [2] - 3x3
    private otherPuzzels otherPuzzels;

    public Product() {
        this.price = 50;
        otherPuzzels = new otherPuzzels();
        nxnxn = new nxnxn[3];
        for (int i = 0; i < nxnxn.length; i++) {
            nxnxn[i] = new nxnxn();
        }
    }

    public double totalValueInNxnxn2x2() {
        return nxnxn[0].getQuantity() * price;
    }

    public double totalValueInNxnxn3x3() {
        return nxnxn[1].getQuantity() * price;
    }

    public double totalValueInNxnxn24x4() {
        return nxnxn[2].getQuantity() * price;
    }

    public double totalValueInOtherPuzzels() {
        return otherPuzzels.getQuantity() * price;
    }

    public void addProducts(String type, int quantity) {

        if (type.equals("2x2")) {
            nxnxn[0].Add(quantity);
        } else if (type.equals("3x3")) {
            nxnxn[1].Add(quantity);
        } else if (type.equals("4x4")) {
            nxnxn[2].Add(quantity);
        } else if (type.equals("otherpuzzels")) {
            otherPuzzels.Add(quantity);
        }
    }

    public void RemoveProducts(String type, int quantity) {

        if (type.equals("2x")) {
            nxnxn[0].Remove(quantity);
        } else if (type.equals("3x")) {
            nxnxn[1].Remove(quantity);
        } else if (type.equals("4x")) {
            nxnxn[2].Remove(quantity);
        } else if (type.equals("otherpuzzels")) {
            otherPuzzels.Remove(quantity);
        }
    }

    public String nxnxnQuantity2x2() {
        return type
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + nxnxn[0].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn2x2());
    }

    public String nxnxnQuantity3x3() {
        return type
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + nxnxn[1].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn3x3());
    }

    public String nxnxnQuantity4x4() {
        return type
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + nxnxn[2].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn24x4());
    }

    public String otherPuzzelsQuantity() {
        return type
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + otherPuzzels.getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInOtherPuzzels());
    }
}
