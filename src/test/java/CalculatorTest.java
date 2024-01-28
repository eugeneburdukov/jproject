import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    void test1() {
        Assert.assertEquals(4, Calculator.multiple(2, 2));
    }

    @Test
    void test2() {
        Assert.assertEquals(10, Calculator.multiple(3, 3));
    }

    @Test
    void test3() {
        Assert.assertEquals(25, Calculator.multiple(5, 5));
    }


}
