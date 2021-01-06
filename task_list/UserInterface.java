
import java.util.Scanner;

public class UserInterface {
    
    private TodoList todoList;
    private Scanner scan;
    
    
    public UserInterface(TodoList todoList,Scanner scan){
        this.scan = scan;
        this.todoList = todoList;
    }
    
    public void start(){
        
        while(true){
            System.out.println("Command:");
            String task = scan.nextLine();
            
            if(task.equals("stop")){
                break;
            }
            
            if(task.equals("add")){
                System.out.println("To add:");
                todoList.add(scan.nextLine());
            }
            
            if(task.equals("list")){
                todoList.print();
            }
            
            if(task.equals("remove")){
                System.out.println("Which one is removed?");
                todoList.remove(Integer.valueOf(scan.nextLine()));
            }
            
        }
    }
    
}
