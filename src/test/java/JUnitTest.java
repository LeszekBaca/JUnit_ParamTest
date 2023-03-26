import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @Test
    void simpleTest() {
        int result = 2 + 3;

        Assertions.assertEquals(15, result);

    }

    @DisplayName("Test name")
    @Test
    void givenWhenThen() {
        //given
        int a = 2;
        int b = 3;

        //when
        int result = 2 + 3;

        //then
        Assertions.assertEquals(5, result);
    }

}
