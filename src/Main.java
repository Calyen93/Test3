import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";

        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);

        String formattedDate = dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        System.out.println(formattedDate);
    }
}