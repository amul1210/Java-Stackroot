import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class revereseStringtest {
    ReverseString firstalphabet;
    @Before
    public void setUp() {
        firstalphabet = new ReverseString();
    }

    @Test
    public void testForCapital() {
    String testcase = firstalphabet.reverseString("loNdon");
    String answer = "n o d N o l";
    Assert.assertEquals(testcase, answer);
    }

    @Test
    public void testForSpecialCharacter() {
        String testcase = firstalphabet.reverseString("lon&don");
        String answer = "n o d & n o l";
        Assert.assertEquals(testcase, answer);
    }

    @Test
    public void testForLongString() {
        String testcase = firstalphabet.reverseString("qwertyuiopasdfghjklzxcvbnm");
        String answer = "m n b v c x z l k j h g f d s a p o i u y t r e w q";
        Assert.assertEquals(testcase, answer);
    }

    @Test
    public void testForNumber() {
        String testcase = firstalphabet.reverseString("qwerty10");
        String answer = "0 1 y t r e w q";
        Assert.assertEquals(testcase, answer);
    }

    @After
    public void tearDown() throws Exception {
        firstalphabet = null;
    };
}