
public class Bird {
    
    private String name;
    private String nameLatin;
    private int birdObserved;
    
    public Bird(String birdName, String latinBirdName){
        this.name = birdName;
        this.nameLatin = latinBirdName;
        this.birdObserved = 0;
        
    }
    
    public Bird(){
        
    }
    
    @Override
    public String toString(){
        return this.name +"(" +this.nameLatin+"): "+ this.birdObserved+ "observatuons";
        
    }
    
    public int getObs(){
        return this.birdObserved;
    }
    
    public void setObs(){
        this.birdObserved++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.nameLatin;
        
    }
    
    
}
