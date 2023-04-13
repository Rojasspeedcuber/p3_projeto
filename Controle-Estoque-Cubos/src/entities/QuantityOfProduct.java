package entities;

public class QuantityOfProduct {
    
    private int quantity;

    public QuantityOfProduct (){
        this.quantity = 100;
    }

    public void addQuantity (int add){
        this.quantity += add;
    }

    public void removeQuantity (int remove){
        this.quantity -= remove;
    }

    public int newQuantity(){
        return this.quantity;
    }
}
