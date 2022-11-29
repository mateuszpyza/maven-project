import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeTest {

    @Test
    void isAgeYoungerThenEighteen() {
        //given
        int age = 15;
        //when
        boolean result = Age.isAgeLessThenOrEqualToEighteen(age);
        //then
        Assertions.assertTrue(result);

    }

    @Test
    void isAgeEqualToEighteen() {
        //given
        int age = 18;
        //when
        boolean result = Age.isAgeLessThenOrEqualToEighteen(age);
        //then
        Assertions.assertTrue(result);

    }

    @Test
    void isAgeOlderThenEighteen() {
        //given
        int age = 15;
        //when
        boolean result = Age.isAgeLessThenOrEqualToEighteen(age);
        //then
        Assertions.assertTrue(result);

    }
}