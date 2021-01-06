
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    //private String product;
    private int price;
    private int stock;

    private final Map<String, Integer> warehousePriceList;
    private final Map<String, Integer> warehouseStockList;

    public Warehouse() {
        this.warehousePriceList = new HashMap<>();
        this.warehouseStockList = new HashMap<>();
    }

    public void addProduct(String productName, int priceProduct, int inStock) {
        this.price = priceProduct;
        //this.product = productName;
        this.stock = inStock;
        this.warehousePriceList.put(productName, this.price);
        this.warehouseStockList.put(productName, this.stock);

    }

    public int price(String product) {
        if (this.warehousePriceList.containsKey(product)) {
            return this.warehousePriceList.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.warehouseStockList.containsKey(product)) {
            return this.warehouseStockList.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.warehouseStockList.containsKey(product)) {

            if (this.warehouseStockList.get(product) > 0) {
                this.warehouseStockList.put(product, this.warehouseStockList.get(product) - 1);
                return true;
            }
        }
        return false;

    }
    
    public Set<String> products(){
        return this.warehouseStockList.keySet();
        
    }

}
