
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdDatabase birdDatabase;
    //private Bird bird;

    public UserInterface(Scanner scan) {
        this.scanner = scan;
        
    }

    public void start() {
        System.out.println("?");
        String input = scanner.nextLine();

        while (true) {

            if (input.equals("Quit")) {
                break;
            }

            if (input.equals("Add")) {
                System.out.println("Name: ");
                String birdName = scanner.nextLine();
                System.out.println("Bird in Latin: ");
                String birdInLatin = scanner.nextLine();
                Bird bird = new Bird(birdName, birdInLatin);
                birdDatabase.addBird(bird);
                
            }

            if (input.equals("Observation")) {
                System.out.println("Bird?");
                String inputBird = scanner.nextLine();

                if (inputBird.equals(bird.getName())) {
                    bird.setObs();
                } else {
                    System.out.println("Not a bird!");
                }

            }

            if (input.equals("One")) {
                System.out.println("Bird?");
                String inputBird = scanner.nextLine();

                if (inputBird.equals(bird.getName())) {
                    bird.toString();
                } else {
                    System.out.println("Not a bird!");
                }
            }

            if (input.equals("All")) {
                System.out.println(birdDatabase);
            } 

        }

    }

}
