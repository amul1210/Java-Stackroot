import org.junit.Assert;
import org.junit.Test;

    public class NumrepeatTest {
        @Test
        public void firsttestcase() {
            Numrepeat firstnumber = new Numrepeat();
            String testcase1 = firstnumber.numRepeat(5);
            String answer1 = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5";
            Assert.assertEquals(testcase1, answer1);

        }
    }
