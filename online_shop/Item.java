
public class Item {
    
    private int quantity;
    private final int itemPrice;
    private String productName;

    public Item(String product, int qty, int unitPrice) {
        this.itemPrice = unitPrice;
        this.quantity = qty;
        this.productName = product;        
    }
    
    public int price(){
        return this.itemPrice * this.quantity;
        
    }
    
    public void increaseQuantity(){
        this.quantity++;
    }
    
    public String toString(){
        return this.productName + ": "+ this.quantity;
        
    }

}
