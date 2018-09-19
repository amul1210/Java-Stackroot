import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharAppearancesTest {

    public CharAppearances c;

    @Before
    public void setUp() throws Exception {
        c = new CharAppearances();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void basicCheck() {
        assertEquals("fails", 10, c.CountChar("a","Java is java again java again"));
        assertEquals("fails", 7, c.CountChar("m","mmmischief mismanagedmm"));
    }

    @Test
    public void failureCheck() {
        assertNotNull("fails",c.CountChar("a","sd"));
        assertEquals("fails",0,c.CountChar("p",""));
    }
}