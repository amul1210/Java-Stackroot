import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class EditListTest {

    EditList l;

    @Before
    public void setUp() throws Exception {
        l = new EditList();
    }

    @After
    public void tearDown() throws Exception {
        l = null;
    }

    @Test
    public void basicTest(){
        List<String> list = new LinkedList<>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
        assertEquals("fails", Arrays.asList("Apple","Kiwi","Melon","Berry"),l.toEdit(1, Arrays.asList("Apple","Grape","Melon","Berry"), "Kiwi"));
        assertEquals(l.toClear(list),0);
    }
}