import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenNumbersTest {

    @Test
    void shouldReturnTrueOrFalseResult() {
        Assertions.assertTrue(EvenNumbers.isEvenNumber(10));
    }
}