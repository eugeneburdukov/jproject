import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("2 x 2 = 4")
    void test1() {
        Assertions.assertEquals(4, Calculator.multiple(2, 2));
    }

    @Test
    @DisplayName("2 x 3 = 6")
    void test2() {
        Assertions.assertEquals(6, Calculator.multiple(3, 2));
    }

    @Test
    @DisplayName("2 x 6 = 12")
    void test3() {
        Assertions.assertEquals(13, Calculator.multiple(2, 6));
    }

}
