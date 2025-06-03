import java.time.*;

/**
 * Demonstrates usage of Java 8's new Date and Time API.
 */
public class NewDateTimeApiDemo {
    public static void main(String[] args) {
        // Get the current local time
        LocalTime currentTime = LocalTime.now();

        // Create a specific date (January 16, 2005)
        LocalDate specificDate = LocalDate.of(2005, Month.JANUARY, 16);

        // Get the current date and time in GMT time zone
        ZonedDateTime currentDateTimeInGMT = ZonedDateTime.now(ZoneId.of("GMT"));

        // Print the current local time
        System.out.println("Current Local Time: " + currentTime);

        // Print the specific date
        System.out.println("Specific Date: " + specificDate);

        // Print the current date and time in GMT
        System.out.println("Current Date-Time in GMT: " + currentDateTimeInGMT);
    }
}
