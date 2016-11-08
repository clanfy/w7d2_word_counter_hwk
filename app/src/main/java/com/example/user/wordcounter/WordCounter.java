package com.example.user.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("WordCounter", "onCreate called and it wants its app back");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




}
