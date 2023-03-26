import org.example.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.ThrowableAssert.catchThrowable;
import static org.junit.Assert.assertEquals;


public class CalculatorServiceImplTest {

    private CalculatorServiceImpl calcuatorService;

    @BeforeEach
    void befreEeach() {
        calcuatorService = new CalculatorServiceImpl();
    }

    @Test
    void shouldAddTwoIntegers() {
        int result = calcuatorService.add("10", "20");

        Assertions.assertEquals(30, result);
    }
    @Test
    void shouldAddTwoCorrectNumbers() {
        //given
        String a = "10";
        String b = "20";

        //when
        int result = calcuatorService.add(a, b);

        //then
        assertEquals(30, result);

    }
    @Test
    void shouldThrowExceptionOnInvalidFirstArgument(){
        //given
        String a = "incorectNumber";
        String b = "10";

        //when
        Throwable throwable = catchThrowable(()->calcuatorService.add(a,b));

        //then
        assertThat(throwable)
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("For input string: \"incorectNumber\"");

    }

    @Test
    void shouldThrowExceptionEmptyFirstArgument(){
        //given
        String a = "";
        String b = "10";

        //when
        Throwable throwable = catchThrowable(()->calcuatorService.add(a,b));

        //then
        assertThat(throwable)
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("For input string: \"\"");

    }

    @Test
    void shouldThrowExceptionOnIntegerOverFlow(){
        //given
        String a = Integer.MAX_VALUE + "";
        String b = "11";

        //when
        Throwable throwable = catchThrowable(()->calcuatorService.add(a,b));

        //then
        assertThat(throwable)
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("integer overflow");

    }
}
