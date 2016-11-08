package com.example.user.wordcounter;

import java.util.ArrayList;
import java.util.Arrays;

//import Countable;

/**
 * Created by user on 08/11/2016.
 */

public class Counter {

    protected ArrayList<String> mCounter;

    public Counter() {
        mCounter = new ArrayList<String>();

    }

    //take in a string of words
    //split them and put them into an array list

    public ArrayList<String> getWords(String words) {
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(words.split(" ")));
        return myList;
    }


//    public void add(String newWords) {
//        mWords.add(newWords);
//    }
//
    public int getWordCount(String wordsToBeCounted) {
        int wordCount = getWords(wordsToBeCounted).size();
        return wordCount;

    }

    public String getWordCountString (String wordsToBeCounted){
        int wordCount = getWords(wordsToBeCounted).size();
        return String.valueOf(wordCount);
    }

}


