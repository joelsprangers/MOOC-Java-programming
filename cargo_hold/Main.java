
public class Main {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        Item guido = new Item ("guido's telefoontje", 7);

        Suitcase suitcase = new Suitcase(50);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);
        suitcase.addItem(guido);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
    }
}
