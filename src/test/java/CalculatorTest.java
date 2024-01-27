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
        Assert.assertEquals(6, Calculator.multiple(3, 2));
    }

    @Test
    void test3() {
        Assert.assertEquals(25, Calculator.multiple(5, 5));
    }


}
