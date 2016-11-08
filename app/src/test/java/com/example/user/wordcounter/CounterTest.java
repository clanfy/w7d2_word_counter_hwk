package com.example.user.wordcounter;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 08/11/2016.
 */

public class CounterTest {

    Counter mCounter;
    String mWords;

    @Before
    public void before(){
        mWords = "The Rain in Spain falls gently on the plain";
        mCounter = new Counter();
    }

    @Test
    public void getStringTestNotNull(){
        assertNotNull(mCounter.getWords(mWords));
    }

//    @Test
//    public void getStringArrayTest(){
//        assertTrue(Arrays.equals("The rain in spain", mCounter.getWords(mWords)));
//    }



    @Test
    public void countStringTest(){
        assertEquals(9, mCounter.getWords(mWords).size());
    }

    @Test
    public void wordCountTest(){
        assertEquals(9, mCounter.getWordCount(mWords));
    }

}


