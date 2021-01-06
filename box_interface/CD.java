
public class CD implements Packable {
    private String artist;
    private String name;
    private int year;
    private double weight;
    
    public CD(String cdArtist, String cdName, int cdYear){
        this.artist = cdArtist;
        this.name = cdName;
        this.year = cdYear;
        this.weight = 0.1;

    }
    
    public double weight(){
        return this.weight;
    }
    
    public String toString(){
        return this.artist + ": " + this.name+ " (" +this.year + ")";
    }
    
}
