import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharRepeatTest {

    CharRepeat p;

    @Before
    public void setUp() throws Exception {
        p = new CharRepeat();
    }

    @After
    public void tearDown() throws Exception {
        p=null;
    }
    @Test
    public void testForSpecialCharacter() {
        String testcase2 = p.charRepeat("amul$",4);
        String answer2 = "amul$mul$mul$mul$mul$";
        Assert.assertEquals(answer2, testcase2);

    }

    @Test
    public void testForNumber() {
        String testcase2 = p.charRepeat("amula1", 4);
        String answer2 = "amula1ula1ula1ula1ula1";
        Assert.assertEquals(testcase2,answer2);

    }

    @Test
    public void testForLongString() {
        String testcase2 = p.charRepeat("amulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamula$",4);
        String answer2 = "amulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamulaamula$ula$ula$ula$ula$";
        Assert.assertEquals(testcase2,answer2);

    }

    @Test
    public void testForCapital() {
        String testcase2 = p.charRepeat("Amula$",4);
        String answer2 = "Amula$ula$ula$ula$ula$";
        Assert.assertEquals(testcase2,answer2);

    }


    @Test
    public void testForZeroLength() {
        String testcase2 = p.charRepeat("amula$",0);
        String answer2 = "amula$";
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testForShortLength() {
        String testcase2 = p.charRepeat("amula$",8);
        String answer2 = "ERROR";
        Assert.assertEquals(testcase2,answer2);
    }

}