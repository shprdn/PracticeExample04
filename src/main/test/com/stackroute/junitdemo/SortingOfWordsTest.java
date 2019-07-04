package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class SortingOfWordsTest {
    SortingOfWords sow;
    @Before
    public void setUp(){
        sow = new SortingOfWords();
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

    @Test
    public void givenStringShouldReturnSortedString(){
        String str = sow.sorting("I am Shivani.I like to watch SRK movies.I like to play badminton.");
        assertEquals("am badminton I I I like like movies play Shivani SRK to to watch",str);
    }
    @Test
    public void givenStringShouldReturnUnSortedString(){
        String str = sow.sorting("a b c d e f g h i j k l m");
        assertEquals("a b c d e f g h i j k l m",str);
    }
    @Test
    public void givenStringShouldReturnNull(){
        String str = sow.sorting(null);
        assertNull(str);
    }
    @Test
    public void givenStringShouldReturnListOfNumbers(){
        String str = sow.sorting("1 2 3 4 5 6 7 8 9 10");
        assertEquals("1 10 2 3 4 5 6 7 8 9",str);
    }


}