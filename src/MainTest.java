import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import java.time.DateTimeException;

public class MainTest {

    @Test
    public void testFormattedDate() {
        String dateString = "2023-03-01T13:00:00Z";
        String formattedString = Main.date(dateString);
        assertEquals("01 marzo 2023", formattedString);
    }

    @Test
    public void testDate_whenTimeChange() {
        String dateString = "2023-03-01T18:00:00Z";
        String formattedString = Main.date(dateString);
        assertEquals("01 marzo 2023", formattedString);
    }

    @Test
    public void testDate_changeMonth() {
        String dateString = "2023-05-01T18:00:00Z";
        String formattedString = Main.date(dateString);
        assertEquals("01 maggio 2023", formattedString);
    }

    @Test
    public void testDate_invalidData() {
        String dateString = "2023-14-01T18:00:00Z";
        assertThrows(DateTimeException.class, () -> Main.date(dateString));
    }

}