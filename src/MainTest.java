import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class MainTest {

    @Test
    public void testDateFormatting() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);

        String formattedDate = dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        assertEquals("01 marzo 2023", formattedDate);
    }

    @Test
    public void testInvalidDateString() {
        String invalidDateString = "invalid_date_string";
        OffsetDateTime dateTime = null;

        try {
            dateTime = OffsetDateTime.parse(invalidDateString);
        } catch (Exception e) {

        }

        assertEquals(null, dateTime);
    }
}