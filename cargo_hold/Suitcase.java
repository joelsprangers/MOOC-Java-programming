
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
public class Suitcase {
    
    private ArrayList<Item> suitcase;
    private int weightMax;
    
    public Suitcase(int maxWeight){
        this.suitcase = new ArrayList<>();
        this.weightMax = maxWeight;
    }
    
    public void addItem(Item item){
        
        if((totalWeight() + item.getWeight()) <= this.weightMax ){
        suitcase.add(item);
        }
    }
    
    public int totalWeight(){
        int weightOfItems = 0;
        for (Item item : suitcase){
            weightOfItems += item.getWeight();          
        }
        return weightOfItems;
    }
    
    public void printItems(){
        
        String printList = "";
        
        for (Item item : suitcase){
            printList = printList + item.toString() + "\n";
        }
        
        System.out.println(printList);
    }
    
    public Item heaviestItem(){
        
        if (this.suitcase.isEmpty()){
            return null;
        }
        
        Item heaviestOne = this.suitcase.get(0);
        
        for (Item item : this.suitcase){
            
            if (heaviestOne.getWeight() < item.getWeight()){
                heaviestOne = item;
            }      
        }
        return heaviestOne;
    }
    
    
    @Override
    public String toString(){
        if(suitcase.isEmpty()){
            return "no items (0 kg)";
        }
        
        if (suitcase.size() == 1){
            return suitcase.size() +" item ("+ totalWeight() + " kg)";
            
        }
        
        else return suitcase.size() +" items ("+ totalWeight() + " kg)";
    }
    
}
