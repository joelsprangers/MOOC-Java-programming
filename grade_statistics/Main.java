
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        
        PointList pointList = new PointList();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(pointList, scanner);
        
        userInterface.start();
        
    }
}
