package entities;

public abstract class CubeStock {

    public void cubesInStock() {
        System.out.println("CUBES IN STOCK = Nxnxn and OtherPuzzels");
    }

    public void stockOptions() {
        System.out.println("[1] - Check quantity of cubes in stock.");
        System.out.println("[2] - Add a quantity of cubes to the stock.");
        System.out.println("[3] - Remove a quantity of cubes from stock.");
        System.out.println("[4] - Update the cube price.");
        System.out.println("[5] - View list of products with prices.");
        System.out.println("[6] - Rent a cube.");
        System.out.println("[0] - End program.\n");
        System.out.print("Inform the desired option:");
    }
}
