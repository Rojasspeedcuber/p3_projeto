package entities;

import CubeTypes.*;

public class Product extends CubeRental {

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
        return nxnxn[0].getQuantity() * nxnxn[0].getPrice();
    }

    public double totalValueInNxnxn3x3() {
        return nxnxn[1].getQuantity() * nxnxn[1].getPrice();
    }

    public double totalValueInNxnxn4x4() {
        return nxnxn[2].getQuantity() * nxnxn[2].getPrice();
    }

    // VALOR TOTAL DO CUBO (OTHERPUZZELS)

    public double totalValueInOtherPuzzels() {
        return otherPuzzels.getQuantity() * otherPuzzels.getPrice();
    }

    // --------------------------------------------------------------------------------------//

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

    // ADICIONAR A QUANTIDADE DO CUBO (OTHERPUZZELS)

    public int addProductsInOtherPuzzels(int quantity) {
        otherPuzzels.Add(quantity);
        return otherPuzzels.getQuantity();
    }

    // --------------------------------------------------------------------------------------//

    // REMOVER A QUANTIDADE DE CADA TIPO DO CUBO (NXNXN)

    public int removeProductsNxnxn2x2(int quantity) {
        if (nxnxn[0].Remove(quantity) == -1) {
            return -1;
        } else {
            nxnxn[0].Remove(quantity);
            return nxnxn[0].getQuantity();
        }
    }

    public int removeProductsNxnxn3x3(int quantity) {
        if (nxnxn[1].Remove(quantity) == -1) {
            return -1;
        } else {
            nxnxn[1].Remove(quantity);
            return nxnxn[1].getQuantity();
        }
    }

    public int removeProductsNxnxn4x4(int quantity) {
        if (nxnxn[2].Remove(quantity) == -1) {
            return -1;
        } else {
            nxnxn[2].Remove(quantity);
            return nxnxn[2].getQuantity();
        }
    }

    // REMOVER A QUANTIDADE DO CUBO (OTHERPUZZELS)

    public int removeOtherPuzzels(int quantity) {

        if (otherPuzzels.Remove(quantity) == -1) {
            return -1;
        } else {
            otherPuzzels.Remove(quantity);
            return otherPuzzels.getQuantity();
        }
    }

    // --------------------------------------------------------------------------------------//

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

    // ATUALIZAR O PREÇO DE CADA DO CUBO CUBO (OTHERPUZZELS)

    public double upDatePriceOtherPuzzels(double price) {
        otherPuzzels.addPrice(price);
        return otherPuzzels.getPrice();
    }

    // --------------------------------------------------------------------------------------//

    // METODOS toString (NXNXN) && (OTHERPUZZELS)

    public String nxnxnQuantity2x2() {
        return type
                + "(2x2), $"
                + String.format("%.2f", nxnxn[0].getPrice())
                + ", "
                + nxnxn[0].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn2x2());
    }

    public String nxnxnQuantity3x3() {
        return type
                + "(3x3), $"
                + String.format("%.2f", nxnxn[1].getPrice())
                + ", "
                + nxnxn[1].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn3x3());
    }

    public String nxnxnQuantity4x4() {
        return type
                + "(4x4), $"
                + String.format("%.2f", nxnxn[2].getPrice())
                + ", "
                + nxnxn[2].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn4x4());
    }

    public String otherPuzzelsQuantity() {
        return type
                + ", $"
                + String.format("%.2f", otherPuzzels.getPrice())
                + ", "
                + otherPuzzels.getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInOtherPuzzels());
    }
}
