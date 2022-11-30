import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DaysOfWeekTest {

    @Test
    void shouldGetMonday() {
        //given
        int numberOfDay = 1;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Monday", result);
    }

    @Test
    void shouldGetTuesday() {
        //given
        int numberOfDay = 2;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Tuesday", result);
    }

    @Test
    void shouldGetWednesday() {
        //given
        int numberOfDay = 3;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Wednesday", result);
    }

    @Test
    void shouldGetThursday() {
        //given
        int numberOfDay = 4;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Thursday", result);
    }

    @Test
    void shouldGetFriday() {
        //given
        int numberOfDay = 5;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Friday", result);
    }

    @Test
    void shouldGetWeekend() {
        //given
        int numberOfDay = 6;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Weekend", result);
    }

    @Test
    void shouldGetError() {
        //given
        int numberOfDay = 88;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("There is no such a day!", result);
    }

}