package application;

import java.util.Scanner;

import entities.CubeStock;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        CubeStock cS = new CubeStock();

        int opcao, checkCubes;

        String result;

        cS.cubesNxNTypes();

        do {

            cS.stockOptions();
            opcao = in.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Tell the order of cube you want to check: ");
                    checkCubes = in.nextInt();
                    while (checkCubes < 6 && checkCubes > 10) {
                        System.out.print("Invalid option, type again: ");
                        checkCubes = in.nextInt();
                    }

                    result = cS.checkQuantity(checkCubes);

                    if (result.equals("anything")) {
                        System.out.println("No cubes available in stock");
                    } else {
                        System.out.println(result);
                    }
                    break;

                case 2:
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
