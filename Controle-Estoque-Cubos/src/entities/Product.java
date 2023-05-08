package entities;

import CubeTypes.*;

public class Product extends CubeStock {

    public String type;
    public double price;
    private nxnxn[] nxnxn; // [0] - 2x2 [1] - 3x3 [2] - 4x4
    private otherPuzzels otherPuzzels;

    public Product() {

        otherPuzzels = new otherPuzzels();
        nxnxn = new nxnxn[3];
        for (int i = 0; i < nxnxn.length; i++) {
            nxnxn[i] = new nxnxn();
        }
    }

    // VALOR TOTAL DE CADA TIPO DO CUBO (NXNXN)

    public double totalValueInNxnxn2x2() {
        return nxnxn[0].getQuantity() * priceNxnxn2x2();
    }

    public double totalValueInNxnxn3x3() {
        return nxnxn[1].getQuantity() * priceNxnxn3x3();
    }

    public double totalValueInNxnxn24x4() {
        return nxnxn[2].getQuantity() * priceNxnxn4x4();
    }

    // VALOR TOTAL DO CUBO (OTHERPUZZELS)

    public double totalValueInOtherPuzzels() {
        return otherPuzzels.getQuantity() * priceOtherPuzzels();
    }

    // ADICIONAR A QUANTIDADE DE CADA TIPO DO CUBO (NXNXN)

    public int addProductsInNxnxn2x2(int quantity) {
        nxnxn[0].Add(quantity);
        return nxnxn[0].getQuantity();
    }

    public int addProductsInNxnxn3x3(int quantity) {
        nxnxn[1].Add(quantity);
        return nxnxn[1].getQuantity();
    }

    public int addProductsInNxnxn4x4(int quantity) {
        nxnxn[2].Add(quantity);
        return nxnxn[2].getQuantity();
    }

    // ADICIONAR PREÇO DE CADA CUBO (NXNXN)

    public double priceNxnxn2x2() {
        return nxnxn[0].addPrice(20.0);
    }

    public double priceNxnxn3x3() {
        return nxnxn[1].addPrice(30.0);
    }

    public double priceNxnxn4x4() {
        return nxnxn[2].addPrice(40.0);
    }

    // ATUALIZAR O PREÇO DE CADA TIPO DE CUBO (NXNXN)

    public double upDatePriceNxnxn2x2(double price) {
        nxnxn[0].addPrice(price);
        return nxnxn[0].getPrice();
    }

    public double upDatePriceNxnxn3x3(double price) {
        nxnxn[1].addPrice(price);
        return nxnxn[1].getPrice();
    }

    public double upDatePriceNxnxn4x4(double price) {
        nxnxn[2].addPrice(price);
        return nxnxn[2].getPrice();
    }

    // ADICIONAR O PREÇO DO CUBO (OTHERPUZZELS)

    public double priceOtherPuzzels() {
        return otherPuzzels.getPrice();
    }

    // ADICIONAR A QUANTIDADE DO CUBO (OTHERPUZZELS)

    public int addProductsInOtherPuzzels(int quantity) {
        otherPuzzels.Add(quantity);
        return otherPuzzels.getQuantity();
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
                + "(2x2), $"
                + String.format("%.2f", priceNxnxn2x2())
                + ", "
                + nxnxn[0].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn2x2());
    }

    public String nxnxnQuantity3x3() {
        return type
                + "(3x3), $"
                + String.format("%.2f", priceNxnxn3x3())
                + ", "
                + nxnxn[1].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn3x3());
    }

    public String nxnxnQuantity4x4() {
        return type
                + "(4x4), $"
                + String.format("%.2f", priceNxnxn4x4())
                + ", "
                + nxnxn[2].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn24x4());
    }

    public String otherPuzzelsQuantity() {
        return type
                + ", $"
                + String.format("%.2f", 50.0)
                + ", "
                + otherPuzzels.getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInOtherPuzzels());
    }
}
