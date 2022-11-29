import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DaysOfWeekTest {

    @Test
    void getMonday() {
        //given
        int numberOfDay = 1;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Monday", result);
    }

    @Test
    void getTuesday() {
        //given
        int numberOfDay = 2;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Tuesday", result);
    }

    @Test
    void getWednesday() {
        //given
        int numberOfDay = 3;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Wednesday", result);
    }

    @Test
    void getThursday() {
        //given
        int numberOfDay = 4;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Thursday", result);
    }

    @Test
    void getFriday() {
        //given
        int numberOfDay = 5;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Friday", result);
    }

    @Test
    void getWeekend() {
        //given
        int numberOfDay = 6;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("Weekend", result);
    }

    @Test
    void getError() {
        //given
        int numberOfDay = 88;
        //when
        String result = DaysOfWeek.getDayOfWeekOrWeekend(numberOfDay);
        //then
        Assertions.assertEquals("There is no such a day!", result);
    }

}