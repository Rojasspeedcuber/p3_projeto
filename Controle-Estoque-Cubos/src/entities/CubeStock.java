package entities;

public class CubeStock extends QuantityOfProduct {
    public void cubeTypes() {

        System.out.println("PROJECT: Magic Cube Stock \n\nCube Types in stock:");
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("- Magic cube : " + (i + 6) + "x" + (i + 6));
        }

    }



    public String checkQuantity (int cubes){

        QuantityOfProduct q = new QuantityOfProduct();

        if (cubes == 6){
            return "The quantity of cube of type 6x6 is = " + q.newQuantity() + " Cubes";
        } else  if (cubes == 7){
            return "The quantity of cube of type 7x7 is = " + q.newQuantity() + " Cubes";
        } else  if (cubes == 8){
            return "The quantity of cube of type 8x8 is =" + q.newQuantity() + " Cubes";
        } else  if (cubes == 9){
            return "The quantity of cube of type 9x9 is = " + q.newQuantity() + " Cubes";
        } else  if (cubes == 10){
            return "The quantity of cube of type 10x10 is = " + q.newQuantity() + " Cubes";
        }
        return "anything";
    }



    public void stockOptions() {
        System.out.println("[1] - Check quantity of cube in stock");
        System.out.println("[2] - Add a cube to the stock");
        System.out.println("[3] - Remove a cube from stock");
        System.out.print("[0] - End program \n\nInform the desired option: ");
    }
}
