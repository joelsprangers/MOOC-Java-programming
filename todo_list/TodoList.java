
import java.util.ArrayList;


public class TodoList {

    private ArrayList<String> doList;
 

    public TodoList() {
        this.doList = new ArrayList<>();
    }

    public void add(String task) {
        doList.add(task);

    }

    public void print() {

        String list = "";
        int i = 1;
        for (String task : doList) {
            list = list + i + ": " + task + "\n";
            i++;
        }

        System.out.println(list);

    }

    public void remove(int number) {
        doList.remove((number - 1));
    }

}
