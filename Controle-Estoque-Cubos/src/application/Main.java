package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        Product product = new Product();

        int opcao, quantity;

        String[] typeOfCubes = new String[1];

        do {

            product.stockOptions();
            opcao = in.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Enter the type of cube you want to check: ");
                    product.type = in.next();

                    while (!product.type.equals("nxnxn") && !product.type.equals("otherpuzzels")) {
                        System.out.print("Product not found in stock, type again: ");
                        product.type = in.next();
                    }

                    if (product.type.equals("nxnxn")) {
                        System.out.println("Product data: " + product);
                    } else {
                        System.out.println("Product data: " + product);
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
