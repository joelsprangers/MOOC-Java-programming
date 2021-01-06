
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("Simone", 100, 10);
        warehouse.addProduct("LaDress", 1, 20);
        warehouse.addProduct("Carey", 139, 55);
        warehouse.addProduct("Esther", 123, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("Guido");
    }
}
