package application;

import java.util.Scanner;

import entities.CubeStock;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        CubeStock cS = new CubeStock();

        int opcao, quantity, type;

        String result;

        do {

            cS.stockOptions();
            opcao = in.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Tell the order of cube you want to check: ");
                    type = in.nextInt();

                    while (type < 2 && type > 4) {
                        System.out.print("Invalid option, type again: ");
                        type = in.nextInt();
                    }

                    result = cS.checkQuantity(type);

                    if (result.equals("anything")) {
                        System.out.println("No cubes available in stock.");
                    } else {
                        System.out.println(result);
                    }
                    break;

                case 2:
                    System.out.print("Enter the type of cube you want to add to the stock: ");
                    type = in.nextInt();

                    while (type < 2 || type > 4) {
                        System.out.print("Invalid option, type again: ");
                        type = in.nextInt();
                    }

                    System.out.print("Inform the quantity of cube you want to add to the stock: ");
                    quantity = in.nextInt();

                    while (quantity < 0) {
                        System.out.print("Invalid option, type again: ");
                        quantity = in.nextInt();
                    }

                    cS.addQuantity(quantity);
                    System.out.println("Cube successfully added!");

                    break;

                case 3:
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
