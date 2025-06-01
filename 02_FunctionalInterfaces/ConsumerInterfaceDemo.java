import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the usage of the Consumer functional interface
 * to perform operations on elements of a list using forEach.
 */
public class ConsumerInterfaceDemo {
    public static void main(String[] args) {

        // Sample list of fruits
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

        // Consumer #1: Prints each fruit as-is
        Consumer<String> printFruit = fruit -> System.out.println("Fruit: " + fruit);

        // Apply Consumer #1
        System.out.println("---- Original List ----");
        fruits.forEach(printFruit);

        // Consumer #2: Prints each fruit in uppercase
        System.out.println("\n---- Uppercased List ----");
        fruits.forEach(fruit -> System.out.println("Uppercase: " + fruit.toUpperCase()));
    }
}
