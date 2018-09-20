import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortedNamesTest {

    SortedNames object;

    @Before
    public void setUp() throws Exception {
        object = new SortedNames();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void BasicTest(){
        String[] input = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        List<String> expected = new ArrayList<>(Arrays.asList("Alice", "Bluto", "Eugene", "Harry", "Olive"));
        assertEquals("fail", expected, object.sorting(input));
    }
}