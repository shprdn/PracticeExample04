package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class TransposeOfStringTest {
    TransposeOfString tr;
    @Before
    public void setUp(){
        tr = new TransposeOfString();
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
        String str = tr.reverse("I am Shivani.I like to watch SRK movies.I like to play badminton.");
        assertEquals("I ma inavihS I ekil ot hctaw KRS seivom I ekil ot yalp notnimdab",str);
    }
    @Test
    public void givenStringShouldReturnReverseString(){
        String str = tr.reverse("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",str);
    }
    @Test
    public void givenStringShouldReturnNull(){
        String str = tr.reverse(null);
        assertNull(str);
    }
    @Test
    public void givenStringShouldReturnNum(){
        String str = tr.reverse("12345678910");
        assertEquals("01987654321",str);

    }
    @Test
    public void givenStringShouldReturnReverse(){
        String str = tr.reverse("Shivani");
        assertEquals("inavihS",str);
    }

}