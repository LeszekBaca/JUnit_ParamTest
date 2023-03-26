import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserTest {


    private
    User user = new User("Leszek", 18);


    @Test
    void userShouldBeEquals18AgeAndCorrectName() {

        //given
        String name = "Leszek";
        int age = 18;

        //when
        User user = new User(name, age);

        //then
        Assertions.assertTrue(user.getAge() == 18);
        Assertions.assertEquals(user.getName(), "Leszek");
    }


    @ParameterizedTest
    @ValueSource(ints = {16, 17})
    void userShouldBeAtSmaller18(int age) {
        Assertions.assertTrue(age < user.getAge());
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 19})
    void userShouldBeAtLargerAndEquals18(int age) {
        Assertions.assertTrue(age >= user.getAge());
    }
}
