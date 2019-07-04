package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ReplaceSpecificCharacterTest {
    ReplaceSpecificCharacter rep;
    @Before
    public void setUp(){
        rep = new ReplaceSpecificCharacter();
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
        String result = rep.replace("daily dry");
        assertEquals("faity fry",result);
    }
    @Test
    public void givenStringReturnsSameString(){
        String result = rep.replace("jeve is jeve egein jeve egein");
        assertEquals("jeve is jeve egein jeve egein",result);
    }
    @Test
    public void givenStringReturnsNull(){
        String result = rep.replace(null);
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenStringReturnsNum(){
        String result = rep.replace("55764");
        assertEquals("55764",result);
    }
    @Test
    public void givenStringDoesnotContainNum(){
        String result = rep.replace("dry lt J45va");
        assertEquals("fry tt j45va",result);
    }
    @Test
    public void givenStringConsidersAnyCase(){
        String result = rep.replace("DAILY DRY");
        assertEquals("faity fry",result);
    }
    @Test
    public void givenStringContainsOnlyOneCondition(){
        String result = rep.replace("daity dry");
        assertEquals("faity fry", result);

    }

}