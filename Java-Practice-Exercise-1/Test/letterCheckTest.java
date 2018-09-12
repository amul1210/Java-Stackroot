import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class letterCheckTest {

    LetterCheck firsttestcase;

    @Before
    public void setUp() throws Exception {
        firsttestcase = new LetterCheck();
    }

    @After
    public void tearDown() throws Exception {
        firsttestcase = null;
    }

    @Test
    public void firstTestCase() {

        String ap = firsttestcase.consonantvowel( "ap" );
        String answerexpected = "Vowel Consonant ";
        Assert.assertEquals(ap, answerexpected);
    }


    @Test
    public void specialCharacterString() {

        String secondcase = firsttestcase.consonantvowel( "!!!" );
        String answerexpected = "error error error ";
        Assert.assertEquals(secondcase, answerexpected);
    }

    @Test
    public void numericString() {
        String numstring = firsttestcase.consonantvowel("3456");
        String answerexpected = "error error error error ";
        Assert.assertEquals(numstring, answerexpected);
    }

    @Test
    public void LongString() {
        String LongString = firsttestcase.consonantvowel("Stringasoifugbvsdopgfusdpfohasf");
        String answerexpected = "Consonant Consonant Consonant Vowel Consonant Consonant Vowel Consonant Vowel Vowel Consonant Vowel Consonant Consonant Consonant Consonant Consonant Vowel Consonant Consonant Consonant Vowel Consonant Consonant Consonant Consonant Vowel Consonant Vowel Consonant Consonant ";
        Assert.assertEquals(LongString, answerexpected);
    }
}