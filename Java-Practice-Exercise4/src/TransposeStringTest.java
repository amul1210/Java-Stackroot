import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString str;

    @Before
    public void setUp() throws Exception {
        str = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        str = null;
    }

    @Test
    public void sanityCheck() {
        String queryString = "a quick brown fox jumps over the lazy dog";
        String expectedString = "a kciuq nworb xof spmuj revo eht yzal god";
        String actualString = str.toTranspose(queryString);
        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void emptyString() {
        String queryString = "";
        Assert.assertNull(str.toTranspose(queryString));
    }

    @Test
    public void checkName() {
        String queryString = "Kushagra Agrawal";
        String expectedString = "argahsuK lawargA";
        String actualString = str.toTranspose(queryString);
        Assert.assertEquals(expectedString, actualString);
    }
}