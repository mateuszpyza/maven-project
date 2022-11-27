import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldReturnProperSumResults() {
        //given
        double firstValue=1.5;
        double secondValue=3.5;
        //when
        double result=Calculator.sum(firstValue,secondValue);
        //then
        Assertions.assertEquals(5,result);
    }

    @Test
    void shouldReturnProperSubtractionResults() {
        //given
        double firstValue=10;
        double secondValue=2;
        //when
        double result=Calculator.subtraction(firstValue,secondValue);
        //then
        Assertions.assertEquals(5,result);
    }

    @Test
    void shouldReturnProperMultiplicationResults() {
        Assertions.assertEquals(5,Calculator.multiplication(2.5,2));
    }

    @Test
    void shouldReturnProperDivisionResults() {
        Assertions.assertEquals(5,Calculator.division(125,25));

    }
}