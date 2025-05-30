import java.util.Arrays;
import java.util.List;

public class ForEachMethodDemo {
    public static void main(String[] args) {

        // Creating a List of integers using Arrays.asList
        List<Integer> values = Arrays.asList(2, 3, 4, 5, 6);

        // Using forEach with a lambda expression to print each value
        values.forEach(i -> System.out.println(i));

        // Alternatively, using method reference
        // values.forEach(System.out::println);
    }
}
