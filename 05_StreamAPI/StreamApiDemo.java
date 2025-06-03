import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        // Initialize a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter and print odd numbers
        System.out.println("Odd Numbers:");
        numbers.stream()
                .filter(i -> i % 2 != 0)
                .forEach(System.out::println);

        // Convert numbers to strings and print them in one line
        System.out.println("\nNumbers as Strings:");
        numbers.stream()
                .map(String::valueOf)
                .forEach(s -> System.out.print(s + " "));

        // Collect string versions into a list
        List<String> stringNumbers = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        // Optionally print the collected list
        System.out.println("\n\nCollected List of Strings:");
        System.out.println(stringNumbers);
    }
}
