// Functional interface with a method that accepts two parameters
interface Krish {
    void identity(String firstName, String lastName);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {

        // Lambda expression that implements the Krish interface
        // It takes first name and last name, and prints a formatted message
        Krish krish = (firstName, lastName) ->
                System.out.printf("The name is %s, %s %s!\n", lastName, firstName, lastName);

        // Calling the lambda expression with the name "James Bond"
        krish.identity("James", "Bond");
    }
}
