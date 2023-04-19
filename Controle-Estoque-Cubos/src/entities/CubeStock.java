package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class CubeStock extends QuantityOfProduct {

    private ArrayList<String> productName = new ArrayList<>();
    private ArrayList<Double> productPrice = new ArrayList<>();
    private String product;
    private double price;

    public void cubesNxNTypes() {

        System.out.println("PROJECT: Rubiks Cube/Puzzles Stock \n\nCube Types in stock:");
        
        for (int i = 0; i < 12 ; i++) {
            System.out.println("- Rubiks cube : " + (i + 1) + "x" + (i + 1));
        }

    }

    public String checkQuantity (int cubes){

        QuantityOfProduct q = new QuantityOfProduct();

        if (cubes == 2){
            return "The quantity of cube of type 2x2 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 3){
            return "The quantity of cube of type 3x3 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 4){
            return "The quantity of cube of type 4x4 is =" + q.newQuantity() + " Cubes";
        } else if (cubes == 5){
            return "The quantity of cube of type 5x5 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 6){
            return "The quantity of cube of type 6x6 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 7){
            return "The quantity of cube of type 7x7 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 8){
            return "The quantity of cube of type 8x8 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 9){
            return "The quantity of cube of type 9x9 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 10){
            return "The quantity of cube of type 10x10 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 11){
            return "The quantity of cube of type 11x11 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 12){
            return "The quantity of cube of type 12x12 is = " + q.newQuantity() + " Cubes";
        } else if (cubes == 13){
            return "The quantity of cube of type 13x13 is = " + q.newQuantity() + " Cubes";
        }
        return "anything";
    }

    public void addProduct(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the new one you want to add to the list: ");
        product = in.nextLine();
        System.out.println("Enter the price of this product: ");
        price = in.nextDouble();
        productName.add(product);
        productPrice.add(price);

        in.close();
    }

    public void stockOptions() {
        System.out.println("[1] - Check quantity of cubes in stock");
        System.out.println("[2] - Add a quantity of cubes to the stock");
        System.out.println("[3] - Remove a quantity of cubes from stock");
        System.out.println("[4] - Update a price");
        System.out.println("[4] - Display list of products with prices");
        System.out.println("[5] - Add a cube to the list of products");
        System.out.print("[0] - End program \n\nInform the desired option: ");
    }
}
