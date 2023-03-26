import org.junit.jupiter.api.*;

public class TaskJUnitTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @Test
    void testMethod1() {
        System.out.println("testMethod1");
    }

    @Test
    void testMethod2() {
        System.out.println("testMethod2");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }
}
