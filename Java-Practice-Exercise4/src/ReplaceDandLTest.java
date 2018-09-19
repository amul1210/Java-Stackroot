import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceDandLTest {

    ReplaceDandL str;

    @Before
    public void setUp() throws Exception {
        str = new ReplaceDandL();
    }

    @After
    public void tearDown() throws Exception {
        str = null;
    }
    @Test
    public void BasicTest(){
        assertEquals("fails","faity fry", str.toReplace("daily dry"));
        assertEquals("fails","faffofits",str.toReplace("daffodils"));
    }

    @Test
    public void failureCheck() {
        assertNotNull("fails",str.toReplace("fairy"));
        assertEquals("fails","",str.toReplace(""));
    }

}