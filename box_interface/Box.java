
import java.util.ArrayList;

public class Box implements Packable{
    
    private final double maxCap;
    private Packable packableItem;
    private double boxWeight;
    private final ArrayList<Packable> boxList;
    
    public Box(double max){
        this.maxCap = max;
        this.boxList = new ArrayList<>();
        this.boxWeight = 0.0;
        
    }
    
    public void add(Packable packable){
        this.packableItem = packable;
        if ((this.packableItem.weight() + this.boxWeight) < this.maxCap){
        this.boxList.add(packable);
        this.boxWeight += this.packableItem.weight();
    }
    }
    
    public String toString(){
        return "Box: "+this.boxList.size()+" items, total weight "+this.boxWeight+ " kg";
    }
    
    public double weight(){
        double boxWeight = 0;
        for (Packable packable : this.boxList){
           boxWeight += packable.weight();
        }
        return boxWeight;
        
    }
    
}
