
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private final Map <String, Item> shoppingCart;
    
    
    
    public ShoppingCart(){
    this.shoppingCart = new HashMap<>();    
    }
    
    public void add(String product, int price){
        if(this.shoppingCart.containsKey(product)){
            this.shoppingCart.get(product).increaseQuantity();
        }
        else {
            this.shoppingCart.put(product, new Item(product, 1, price));
        }
    }
    
    public int price(){
        int totalPrice = 0;
        for(Item item : this.shoppingCart.values()){
            totalPrice = item.price() + totalPrice;
            
        }
        return totalPrice;
    }
    
    public void print(){
        for(Item item : this.shoppingCart.values()){
            System.out.println(item.toString());
        }
    }
    
}
