package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class CountOccurrencesTest {
    CountOccurrences co;
    @Before
    public void setUp(){
        co = new CountOccurrences();
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
        int result = co.count("Java is java again java again","a");
        assertEquals(10,result);
    }
    @Test
    public void givenStringReturnsZero(){
        int result = co.count("jeve is jeve egein jeve egein","a");
        assertEquals(0,result);
    };
    @Test
    public void givenStringReturnsNull(){
        int result = co.count("","a");
        assertEquals(0,result);
    }
    @Test
    public void givenStringReturnsCountOfSpaces(){
        int result = co.count("Java is java again java again" , " ");
        assertNotEquals(0,result);
    }
    @Test
    public void givenStringDoesnotContainNum(){
        int result = co.count("Java is Java","5");
        assertEquals(0,result);
    }
    @Test
    public void givenStringConsidersAnyCase(){
        int result = co.count("DAILY DRY","d");
        assertEquals(2,result);
    }
}