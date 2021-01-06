
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> taskList;
    
    public TodoList() {
        this.taskList = new ArrayList<>();
       
    }
    
    public void add(String task) {
        taskList.add(task);
        //number++;
    }
    
    public void remove(int number) {
        taskList.remove(number-1);
        
    }
    
    public void print() {
        
        for (int i = 1; i < taskList.size()+1; i++) {
            System.out.println(i + ": " + taskList.get(i-1));
            
        }
        
    }
    
}
