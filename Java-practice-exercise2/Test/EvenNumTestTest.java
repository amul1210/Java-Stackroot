import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    public EvenNumTest firstnumber;

    @Before
    public void setUp() throws Exception {
        firstnumber = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        firstnumber = null;
    }

    @Test
    public void BasicTest(){
        boolean testcase = firstnumber.checkifEven(2);
        boolean answer = true;
        Assert.assertEquals( answer, testcase );
    }

    @Test
    public void TestForZero(){
        boolean testcase = firstnumber.checkifEven(0);
        boolean answer = false;
        Assert.assertEquals( answer, testcase );
    }

    @Test
    public void TestForOdd(){
        boolean testcase = firstnumber.checkifEven(33);
        boolean answer = false;
        Assert.assertEquals( answer, testcase );
    }

    @Test
    public void TestForNegative(){
        boolean testcase = firstnumber.checkifEven(-24);
        boolean answer = false;
        Assert.assertEquals( answer, testcase );
    }
}