import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define different date formats
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMM d, yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");

        // Format the date using the defined patterns
        String formattedDate1 = currentDate.format(formatter1);
        String formattedDate2 = currentDate.format(formatter2);
        String formattedDate3 = currentDate.format(formatter3);
        String formattedDate4 = currentDate.format(formatter4);

        // Display the formatted dates
        System.out.println("Current date in format yyyy-MM-dd: " + formattedDate1);
        System.out.println("Current date in format dd/MM/yyyy: " + formattedDate2);
        System.out.println("Current date in format MMM d, yyyy: " + formattedDate3);
        System.out.println("Current date in format EEEE, MMMM d, yyyy: " + formattedDate4);
    }
}
