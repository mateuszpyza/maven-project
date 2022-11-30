import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class EvenNumbersTest {

    //Test first method isEvenNumber
    @Test
    void shouldBeEvenWhenCheckingIfEven() {
        //given
        int checkingNumber = 18;
        //when
        boolean result = EvenNumbers.isEvenNumber(checkingNumber);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldBeOddWhenCheckingIfEven() {
        //given
        int checkingNumber = 9;
        //when
        boolean result = EvenNumbers.isEvenNumber(checkingNumber);
        //then
        Assertions.assertFalse(result);
    }


    @Test
    void shouldBeOddWhenCheckingIfOdd() {
        //given
        int checkingNumber = 9;
        //when
        boolean result = EvenNumbers.isOddNumber(checkingNumber);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldBeEvenWhenCheckingIfOdd() {
        //given
        int checkingNumber = 22;
        //when
        boolean result = EvenNumbers.isOddNumber(checkingNumber);
        //then
        Assertions.assertFalse(result);
    }
}