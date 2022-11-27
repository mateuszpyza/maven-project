import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeTest {

    @Test
    void isLessThenOrEqualToEighteen() {
        Assertions.assertTrue(Age.isLessThenOrEqualToEighteen(18));
    }

}