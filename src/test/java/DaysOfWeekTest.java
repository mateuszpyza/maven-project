import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysOfWeekTest {

    @Test
    void shouldReturnNameOfDayIfOneToFiveOrWeekendIfSixToSevenOrSthElseIfMoreThanSeven() {
        Assertions.assertEquals("Weekend",DaysOfWeek.isWeekend(6));
    }
}