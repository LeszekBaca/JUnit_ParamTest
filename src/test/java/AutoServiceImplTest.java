import org.example.AutoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AutoServiceImplTest {
    @Test
    public void analyzeCarByParams_millageNull_throwsIllegalArgumentException() {

        //given
        Integer tread = 4;
        Integer fuel = 10;
        Integer millage = null;
        AutoServiceImpl service = new AutoServiceImpl();

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(tread, fuel, millage));
    }

    @Test
    public void analyzeCarByParams_allValuesOk_resultTrue() {

        //given
        Integer tread = 3;
        Integer fuel = 5;
        Integer millage = 1000;
        AutoServiceImpl service = new AutoServiceImpl();

        //when
        boolean result = service.analyzeCarByParams(tread, fuel, millage);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void analyzeCarByParams_carMillageNotOk_resultFalse() {

        //given
        Integer tread = 3;
        Integer fuel = 5;
        Integer millage = 10000;
        AutoServiceImpl service = new AutoServiceImpl();

        //when
        boolean result = service.analyzeCarByParams(tread, fuel, millage);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_millageLessThanZero_throwsIllegalArgumentException() {

        //given
        Integer tread = 3;
        Integer fuel = 5;
        Integer millage = -1;
        AutoServiceImpl service = new AutoServiceImpl();

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(tread, fuel, millage));
    }

    @Test
    public void analyzeCarByParams_valuesLessThanMinOrMax_resultFalse() {

        //given
        Integer tread = 3;
        Integer fuel = 11;
        Integer millage = 101;
        AutoServiceImpl service = new AutoServiceImpl();

        //when
        boolean result = service.analyzeCarByParams(tread, fuel, millage);

        //then
        Assertions.assertFalse(result);
    }

    private void myAssertion(List<String> strings){

        boolean isAnyEmpty = strings.stream().anyMatch(String::isEmpty);
        if(isAnyEmpty) {
            Assertions.fail("Collection contains empty string");
        }
        Assertions.assertTrue(true);
    }
    @Test
    public void testMethod(){
        List<String> string = Arrays.asList("1", "2");
        myAssertion(string);

    }
}
