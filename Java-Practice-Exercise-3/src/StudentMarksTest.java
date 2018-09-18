import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    public StudentMarks m;

    @Before
    public void setUp() throws Exception {
        m = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        m = null;
    }

    @Test
    public void BasicTest(){
        int[] gradesofstudents = { 30 , 40 , 95, 45 };
        String actualAnswer = m.checkGrades(gradesofstudents);
        String expectedAnswer = "All Grades are Valid";
        Assert.assertEquals(actualAnswer,expectedAnswer);
    }
    @Test
    public void ExcpetionTest(){
        int[] gradesofstudents = {56, 875, 77, 90};
        String actualAnswer = m.checkGrades(gradesofstudents);
        String expectedAnswer = "exception found";
        Assert.assertEquals(actualAnswer,expectedAnswer);
    }

}