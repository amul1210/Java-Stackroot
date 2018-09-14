import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class intFactorialTest {

    public intFactorial p;

    @Before
    public void setUp() throws Exception {
        p = new intFactorial();

    }

    @After
    public void tearDown() throws Exception {
        p = null;

    }

    @Test
    public void BasicTest() {
        int expectedAnswer = p.findFinalFactorial(25);
        int actualAnswer = 13;
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void SmallNumberTest() {
        int expectedAnswer = p.findFinalFactorial(7);
        int actualAnswer = 7;
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void LargeNumberTest() {
        int expectedAnswer = p.findFinalFactorial(500);
        int actualAnswer = 13;
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
}
