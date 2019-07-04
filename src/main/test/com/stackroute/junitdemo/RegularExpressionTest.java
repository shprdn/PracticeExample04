package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression re;
    @Before
    public void setUp(){
        re = new RegularExpression();
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
    public void givenStringShouldReturnTrue()
    {
        boolean result = re.search("This is Harry","Harry");
        assertEquals("Is Harry here?",true,result);
    }
    @Test
    public void givenStringShouldReturnFalse()
    {
        boolean result = re.search("This is HerryHARRY","Harry");
        assertEquals("Is Harry here?",false,result);
    }
    @Test
    public void givenStringShouldReturnBothNull()
    {
        boolean result = re.search(null,null);
        assertEquals("Is Harry here?",false,result);
    }
    @Test
    public void givenStringShouldReturnOneNull()
    {
        boolean result = re.search("harry",null);
        assertEquals("Is Harry here?",false,result);
    }
    @Test
    public void givenStringShouldReturnNull()
    {
        boolean result = re.search(null,"harry");
        assertEquals("Is Harry here?",false,result);
    }
}