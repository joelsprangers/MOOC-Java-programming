
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joelsprangers
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> totalHold;
    
    public Hold (int maxWeight){
        this.maxWeight = maxWeight;
        this.totalHold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        if(getWeight()+ suitcase.totalWeight() <= this.maxWeight){
        totalHold.add(suitcase);
        }
    }
    
    
    public int getWeight(){
        int totalWeight = 0;
        for (Suitcase suitcase : totalHold){
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public void printItems(){
        
        for (Suitcase suitcase : totalHold){
            suitcase.printItems();
         
        }
        
       
    }
    
    @Override
    public String toString(){
        return totalHold.size()+" suitcases ("+ getWeight() + " kg)";
        
    }
    
}
