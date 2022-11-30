import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeTest {

    @Test
    void shouldBeTrueWhenAgeAboveEighteen() {
        //given
        int age = 22;
        //when
        boolean result = Age.isAdult(age);
        //then
        Assertions.assertTrue(result);

    }

    @Test
    void shouldBeTrueWhenAgeEqualsEighteen() {
        //given
        int age = 18;
        //when
        boolean result = Age.isAdult(age);
        //then
        Assertions.assertTrue(result);

    }

    @Test
    void shouldBeFalseWhenAgeUnderEighteen() {
        //given
        int age = 15;
        //when
        boolean result = Age.isAdult(age);
        //then
        Assertions.assertFalse(result);

    }
}