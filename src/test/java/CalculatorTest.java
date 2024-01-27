import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CalculatorTest {

    @Test
    void test1() {
        Assert.assertEquals(4, Calculator.multiple(2, 2));
    }

    @Test
    void test2() {
        Assert.assertEquals(32, Calculator.multiple(2, 2));
    }

    @Test
    void test3() {
        Assert.assertEquals(23, Calculator.multiple(2, 2));
    }


}
