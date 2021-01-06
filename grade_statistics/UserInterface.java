

import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private PointList listOfPoints;
    
    
    public UserInterface(PointList pointList, Scanner scan){
        this.listOfPoints = pointList;
        this.scanner = scan;
    }
    
    public void start(){
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1){
                break;
            }
            
            listOfPoints.add(input);
            
        }
        System.out.println(listOfPoints.pointAverageToString());
        System.out.println(listOfPoints.passingAverageGradeToString());
        System.out.println(listOfPoints.passAverageToString());
        System.out.println(listOfPoints.pointToGradeCount());
        

        
    }
    
}
