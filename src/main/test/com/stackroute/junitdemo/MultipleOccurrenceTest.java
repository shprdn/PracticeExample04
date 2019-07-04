package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class MultipleOccurrenceTest {
    MultipleOccurrence mo;
    @Before
    public void setUp(){
        mo = new MultipleOccurrence();
    }
    @After
    public void tearUp(){}
    @BeforeClass
    public static void setUpClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void tearUpClass(){
        System.out.println("After Class");
    }
    //counts the total number of occurrences of different strings
    @Test
    public void givenStringReturnsCount() {
        String result = mo.matchingPattern("She sells seashells by the seashore","se");
        assertEquals("found at 4-5\n" +
                "found at 10-11\n" +
                "found at 27-28",result);
    }
    @Test
    public void givenStringReturnsSameString(){
        String result = mo.matchingPattern("suchita kanchhal","ch");
        assertEquals("found at 2-3\n" +
                "found at 11-12",result);
    }
    @Test
    public void givenStringReturnsNull(){
        String result = mo.matchingPattern(null,"ch");
        assertEquals("null",result);
    }
    @Test
    public void givenStringReturnssNull(){
        String result = mo.matchingPattern(null,"");
        assertEquals("null",result);
    }
    @Test
    public void givenStringReturnsOnlyNull(){
        String result = mo.matchingPattern(null,"");
        assertEquals("null",result);
    }

}