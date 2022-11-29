import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class EvenNumbersTest {

    //Test first method isEvenNumber
    @Test
    void shouldBeEvenMethodMethodIsEven() {
        //given
        int checkingNumber = 18;
        //when
        boolean result = EvenNumbers.isEvenNumber(checkingNumber);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldBeOddMethodMethodIsEven() {
        //given
        int checkingNumber = 9;
        //when
        boolean result = EvenNumbers.isEvenNumber(checkingNumber);
        //then
        Assertions.assertFalse(result);
    }


    //Test second method isOddNumber
    @Test
    void shouldBeEvenMethodIsOdd() {
        //given
        int checkingNumber = 9;
        //when
        boolean result = EvenNumbers.isOddNumber(checkingNumber);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldBeOddMethodIsOdd() {
        //given
        int checkingNumber = 22;
        //when
        boolean result = EvenNumbers.isOddNumber(checkingNumber);
        //then
        Assertions.assertFalse(result);
    }
}