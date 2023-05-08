package CubeTypes;

public class otherPuzzels {

    private int quantity;
    private double price;

    public otherPuzzels() {
        super();
        quantity = 0;
        price = 0;
    }

    public void Add(int quantity) {
        this.quantity += quantity;
    }

    public void Remove(int quantity) {
        if (this.quantity - quantity < 0) {
            System.out.println("número maior que o estoque");
        } else {
            this.quantity -= quantity;
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
