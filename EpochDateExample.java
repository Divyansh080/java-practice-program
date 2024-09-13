import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

public class EpochDateExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();`

        // Convert LocalDate to Instant (epoch seconds)
        Instant instant = currentDate.atStartOfDay().toInstant(ZoneOffset.UTC);
        long epochSeconds = instant.getEpochSecond();

        System.out.println("Current date: " + currentDate);
        System.out.println("Epoch seconds: " + epochSeconds);
    }
}
