import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapTest {

    ModifyMap m;

    @Before
    public void setUp() throws Exception {
        m = new ModifyMap();
    }

    @After
    public void tearDown() throws Exception {
        m = null;
    }

    @Test
    public void BasicTest(){
        Map<String,String> input = new HashMap<>();
        input.put("val1", "Amul");
        input.put("val2", "Vijay");
        Map<String,String> expected = new HashMap<>();
        expected.put("val1", " ");
        expected.put("val2", "Amul");
        assertEquals(expected,m.modifier(input));
    }
}