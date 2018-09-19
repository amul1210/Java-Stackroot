import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHarryTest {

    FindHarry h;

    @Before
    public void setUp() throws Exception {
        h = new FindHarry();
    }

    @After
    public void tearDown() throws Exception {
        h = null;
    }

    @Test
    public void sanityCheck() {
        boolean testcase = h.findHarry("This is Harry.");
        boolean answer = true;
        Assert.assertEquals(answer, testcase);
    }

    @Test
    public void henryCheck() {
            boolean testcase = h.findHarry("This is Henry");
            boolean answer = false;
            Assert.assertEquals( answer, testcase );
    }

    @Test
    public void nameInAString() {
        boolean testcase = h.findHarry("This is Harry.potter");
        boolean answer = true;
        Assert.assertEquals( answer, testcase );
    }
}