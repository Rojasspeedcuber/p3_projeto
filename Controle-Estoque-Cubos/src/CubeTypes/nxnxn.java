package CubeTypes;

public class nxnxn {

    private int quantity;
    private double price;

    public nxnxn() {
        super();
        quantity = 0;
        price = 0;
    }

    public void Add(int quantity) {
        this.quantity += quantity;
    }

    public int Remove(int quantity) {
        if (this.quantity - quantity < 0) {
            return -1;
        } else {
            return this.quantity -= quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public double addPrice (double price){
        return this.price = price;
    }

    public double getPrice (){
        return price;
    }
}
