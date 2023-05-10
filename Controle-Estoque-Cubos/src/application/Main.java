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
        double price;

        do {

            product.stockOptions();
            opcao = in.nextInt();

            switch (opcao) {

                case 1:

                    product.cubesInStock();

                    System.out.print("Inform the type of cube you want to check: ");
                    product.type = in.next();

                    while (!product.type.equals("nxnxn") && !product.type.equals("otherpuzzels")) {
                        System.out.print("Product not found in stock, type again: ");
                        product.type = in.next();
                    }

                    if (product.type.equals("nxnxn")) {
                        System.out.print("Inform the type of nxnxn cube you want to check:");
                        typesOfNxnxn = in.nextInt();

                        while (typesOfNxnxn != 2 && typesOfNxnxn != 3 && typesOfNxnxn != 4) {
                            System.out.print("Invalid cube type (nxnxn), retype:");
                            typesOfNxnxn = in.nextInt();
                        }

                        if (typesOfNxnxn == 2) {
                            System.out.println(product.nxnxnQuantity2x2());
                        } else if (typesOfNxnxn == 3) {
                            System.out.println(product.nxnxnQuantity3x3());
                        } else {
                            System.out.println(product.nxnxnQuantity4x4());
                        }

                    } else {
                        System.out.println("Product data: " + product.otherPuzzelsQuantity());
                    }

                    break;

                case 2:

                    product.cubesInStock();

                    System.out.print("Inform the TYPE of cube you want to ADD to the stock: ");
                    product.type = in.next();

                    while (!product.type.equals("nxnxn") && !product.type.equals("otherpuzzels")) {
                        System.out.print("Product not found in stock, type again: ");
                        product.type = in.next();
                    }

                    if (product.type.equals("nxnxn")) {
                        System.out.print("Inform the type of nxnxn cube you want to ADD in stock:");
                        typesOfNxnxn = in.nextInt();

                        while (typesOfNxnxn != 2 && typesOfNxnxn != 3 && typesOfNxnxn != 4) {
                            System.out.print("Invalid cube type (nxnxn), retype:");
                            typesOfNxnxn = in.nextInt();
                        }

                        System.out.print("Inform the QUANTITY of product to be ADD in stock: ");
                        quantity = in.nextInt();

                        if (typesOfNxnxn == 2) {
                            product.addProductsInNxnxn2x2(quantity);
                            System.out.println("Cube(s) successfully added!");
                        } else if (typesOfNxnxn == 3) {
                            product.addProductsInNxnxn3x3(quantity);
                            System.out.println("Cube(s) successfully added!");
                        } else {
                            product.addProductsInNxnxn4x4(quantity);
                            System.out.println("Cube(s) successfully added!");
                        }

                    } else {

                        System.out.print("Inform the QUANTITY of product to be ADD in stock: ");
                        quantity = in.nextInt();

                        product.addProductsInOtherPuzzels(quantity);
                        System.out.println("Cube(s) successfully added!");

                    }

                    break;

                case 3:
                    product.cubesInStock();

                    System.out.print("Enter the TYPE of cube you want to REMOVE from stock: ");
                    product.type = in.next();

                    while (!product.type.equals("nxnxn") && !product.type.equals("otherpuzzels")) {
                        System.out.print("Product not found in stock, type again: ");
                        product.type = in.next();
                    }

                    if (product.type.equals("nxnxn")) {
                        System.out.print("Inform the type of nxnxn cube you want to REMOVED from stock:");
                        typesOfNxnxn = in.nextInt();

                        while (typesOfNxnxn != 2 && typesOfNxnxn != 3 && typesOfNxnxn != 4) {
                            System.out.print("Invalid cube type (nxnxn), retype:");
                            typesOfNxnxn = in.nextInt();
                        }

                        System.out.print("Inform the QUANTITY of the product to be REMOVED from stock:");
                        quantity = in.nextInt();

                        if (typesOfNxnxn == 2) {
                            if (product.removeProductsNxnxn2x2(quantity) == -1) {
                                System.out.println("Number greater than stock.");
                            } else {
                                product.removeProductsNxnxn2x2(quantity);
                                System.out.println("Cube(s) removed successfully!");
                            }
                        } else if (typesOfNxnxn == 3) {
                            if (product.removeProductsNxnxn3x3(quantity) == -1) {
                                System.out.println("Number greater than stock.");
                            } else {
                                product.removeProductsNxnxn3x3(quantity);
                                System.out.println("Cube(s) removed successfully!");
                            }
                        } else {
                            if (product.removeProductsNxnxn4x4(quantity) == -1) {
                                System.out.println("Number greater than stock.");
                            } else {
                                product.removeProductsNxnxn4x4(quantity);
                                System.out.println("Cube(s) removed successfully!");
                            }
                        }

                    } else {

                        System.out.print("Inform the QUANTITY of product to be REMOVED from stock: ");
                        quantity = in.nextInt();

                        if (product.removeOtherPuzzels(quantity) == -1) {
                            System.out.println("Number greater than stock.");
                        } else {
                            product.removeOtherPuzzels(quantity);
                            System.out.println("Cube(s) removed successfully!");
                        }

                    }

                    break;

                case 4:

                    product.cubesInStock();

                    System.out.print("inform the TYPE of cube you want to UPDATE the price: ");
                    product.type = in.next();

                    while (!product.type.equals("nxnxn") && !product.type.equals("otherpuzzels")) {
                        System.out.print("Product not found in stock, type again: ");
                        product.type = in.next();
                    }

                    if (product.type.equals("nxnxn")) {
                        System.out.print("Inform the type of nxnxn cube you want to UPDATE the price: ");
                        typesOfNxnxn = in.nextInt();

                        while (typesOfNxnxn != 2 && typesOfNxnxn != 3 && typesOfNxnxn != 4) {
                            System.out.print("Invalid cube type (nxnxn), retype:");
                            typesOfNxnxn = in.nextInt();
                        }

                        System.out.print("Inform the PRICE of the product to be UPDATED: ");
                        price = in.nextDouble();

                        if (typesOfNxnxn == 2) {
                            product.upDatePriceNxnxn2x2(price);
                            System.out.println("Price successfully added!");
                        } else if (typesOfNxnxn == 3) {
                            product.upDatePriceNxnxn3x3(price);
                            System.out.println("Price successfully added!");
                        } else {
                            product.upDatePriceNxnxn4x4(price);
                            System.out.println("Price successfully added!");
                        }

                    } else {

                        System.out.print("Inform the PRICE of the product to be UPDATED: ");
                        price = in.nextDouble();

                        product.upDatePriceOtherPuzzels(price);
                        System.out.println("Price successfully added!");

                    }
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
