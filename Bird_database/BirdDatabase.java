
import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<String> birdList;
    private Bird bird;

    public BirdDatabase(Bird bird) {
        this.birdList = new ArrayList<>();
    }

    public void addBird(Bird bird) {

    }
    
    @Override
    public String toString() {
        String listOfBirds = "";
        
        for (String birdies : birdList) {
            listOfBirds = birdies + "\n" + listOfBirds;

        }
        return listOfBirds;
       
    }
    
        
        

}
