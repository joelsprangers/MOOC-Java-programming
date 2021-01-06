
public class Book implements Packable {
    
    private String name;
    private String author;
    private double weight;
    
    public Book(String bookAuthor, String bookName, double bookWeight){
        this.author = bookAuthor;
        this.name = bookName;
        this.weight = bookWeight;
    }
    
    public double weight(){
        return this.weight;
    }
    
    public String toString(){
        return this.author +": "+ this.name;
    }
    
}
