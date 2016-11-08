package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

/**
 * Created by user on 08/11/2016.
 */

public class CounterTest {

    Counter mCounter;
    String mWords;

    @Before
    public void before(){
        mWords = "The Rain in Spain falls gently on the plain";
    }

    @Test
    public void getStringTest(){
        Counter countedWords = new Counter();
        assertNotNull(countedWords.getWords(mWords));
    }

    @Test
    public void countStringTest(){
        Counter countedWords = new Counter();
        assertEquals(9, countedWords.getWords(mWords).size());
    }

}


