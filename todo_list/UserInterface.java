
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private TodoList taskList;
    
    public UserInterface(TodoList things, Scanner scan){
        this.scanner = scan;
        this.taskList = things;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if(input.equals("stop")){
                break;
            }
            
            if(input.equals("add")){
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                taskList.add(toAdd);
            }
            
            if(input.equals("list")){
                taskList.print();
            }
            
            if(input.equals("remove")){
                System.out.print("Wich one is removed?");
                int removeWhich = Integer.valueOf(scanner.next());
                taskList.remove(removeWhich);
            }
    
        }
        
    }
    
    
    
    
    
}
