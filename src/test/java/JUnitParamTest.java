import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DayOfWeek;
import java.util.stream.Stream;

public class JUnitParamTest {
    @ParameterizedTest
    @ValueSource(strings = {"Argument-1", "Argument-2", "Argument-3"})
    void valueSource(String param) {
        System.out.println(param);
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class)
    void enumSource(DayOfWeek day) {
        System.out.println(day);
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void methodSource(String param) {
        System.out.println(param);
    }

    static Stream<String> stringProvider() {
        return Stream.of("Jan", "poznal", "Selenium");

    }
}
