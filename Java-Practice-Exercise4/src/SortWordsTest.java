import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords w;
    @Before
    public void setUp() throws Exception {
        w = new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        w = null;
    }

    @Test
    public void sanityCheck() {
        String queryString = "Cd Dc Ab Ba";
        List<String> sortedWords = new ArrayList<>(Arrays.asList("Ab","Ba","Cd","Dc"));
        List<String> actualSortedWords = w.toSort(queryString);
        Assert.assertEquals(sortedWords, actualSortedWords);
    }

    @Test
    public void loremIpsumCheck() {
        String queryString = "Ge?ks Ge!ks";
        List<String> sortedWords = new ArrayList<>(Arrays.asList("Ge!ks", "Ge?ks"));
        List<String> actualSortedWords = w.toSort(queryString);
        Assert.assertEquals(sortedWords, actualSortedWords);
    }
}