package CubeTypes;

import entities.CubeStock;

public class nxnxn extends CubeStock {

    private int quantity;
    
    public nxnxn (){
        super();
        quantity = 0;
    }

    public void Add (int quantity){
        this.quantity += quantity;
    }

    public void Remove (int quantity){
        if (this.quantity - quantity < 0){
            System.out.println("número maior que o estoque");
        } else {
            this.quantity -= quantity;
        }
    }

    public int getQuantity (){
        return quantity;
    }
}
