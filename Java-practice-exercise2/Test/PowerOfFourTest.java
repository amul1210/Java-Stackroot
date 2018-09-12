import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {

    public PowerOfFour firstNumber;
    @Before
    public void setUp() throws Exception {
        firstNumber = new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        firstNumber=null;
    }

    @Test
    public void testForOddNumber(){
        boolean testcase = firstNumber.checkifPowerFour(73);
        boolean answer = false;
        Assert.assertEquals( answer, testcase );
    }

    @Test
    public void testForEvenNumber(){
        boolean testcase = firstNumber.checkifPowerFour(68);
        boolean answer = false;
        Assert.assertEquals( answer, testcase );
    }

    @Test
    public void testForZero(){
        boolean testcase = firstNumber.checkifPowerFour(0);
        boolean answer = false;
        Assert.assertEquals( answer, testcase );
    }

    @Test
    public void testForNegative(){
        boolean testcase = firstNumber.checkifPowerFour(-64);
        boolean answer = false;
        Assert.assertEquals( answer, testcase );
    }
}