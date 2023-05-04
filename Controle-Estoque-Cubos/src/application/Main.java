package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        Product product = new Product();

        int opcao, quantity, typesOfNxnxn;

        do {

            product.stockOptions();
            opcao = in.nextInt();

            switch (opcao) {

                case 1:

                    product.cubesInStock();

                    System.out.print("Enter the type of cube you want to check: ");
                    product.type = in.next();

                    while (!product.type.equals("nxnxn") && !product.type.equals("otherpuzzels")) {
                        System.out.print("Product not found in stock, type again: ");
                        product.type = in.next();
                    }

                    if (product.type.equals("nxnxn")) {
                        System.out.print("Enter the type of nxnxn cube you want to check:");
                        typesOfNxnxn = in.nextInt();

                        while (typesOfNxnxn != 2 && typesOfNxnxn != 3 && typesOfNxnxn != 4) {
                            System.out.print("Invalid cube type (nxnxn), retype:");
                            typesOfNxnxn = in.nextInt();
                        }

                        if (typesOfNxnxn == 2) {
                            product.nxnxnQuantity2x2();
                        } else if (typesOfNxnxn == 3) {
                            product.nxnxnQuantity3x3();
                        } else {
                            product.nxnxnQuantity4x4();
                        }
                        
                    } else {
                        System.out.println("Product data: " + product.otherPuzzelsQuantity());
                    }

                    break;

                case 2:
                    System.out.print("Enter the TYPE of cube you want to ADD to the stock: ");
                    product.type = in.next();

                    while (!product.type.equals("nxnxn") && !product.type.equals("otherpuzzels")) {
                        System.out.print("Product not found in stock, type again: ");
                        product.type = in.next();
                    }

                    if (product.type.equals("nxnxn")) {
                        System.out.print("Enter the QUANTITY of product to be ADD in stock: ");
                        quantity = in.nextInt();
                        product.addProducts(product.type, quantity);
                        System.out.println("product added successfully!");
                    }

                    break;

                case 3:
                    System.out.print("Enter the TYPE of cube you want to REMOVED to the stock: ");
                    product.type = in.next();

                    while (!product.type.equals("nxnxn") && !product.type.equals("otherpuzzels")) {
                        System.out.print("Product not found in stock, type again: ");
                        product.type = in.next();
                    }

                    System.out.print("Enter the QUANTITY of product to be REMOVED in stock: ");
                    quantity = in.nextInt();
                    product.RemoveProducts(product.type, quantity);
                    System.out.println("product removed successfully!");

                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                default:
                    System.out.println("invalid option!");
                    break;

            }

            System.out.println();

        } while (opcao != 0);

        System.out.println("Bye, bye!");

        in.close();
    }
}
