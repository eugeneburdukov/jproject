import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    void test1() {
        Assert.assertEquals(4, Calculator.multiple(2, 2));
    }

    @Test
    void test2() {
        Assert.assertEquals(8, Calculator.multiple(4, 2));
    }

    @Test
    void test3() {
        Assert.assertEquals(25, Calculator.multiple(5, 5));
    }


}
