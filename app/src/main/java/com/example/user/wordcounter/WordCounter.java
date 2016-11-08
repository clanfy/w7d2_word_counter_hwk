package com.example.user.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter extends AppCompatActivity{

    EditText mQuestionEditText;
    TextView mWordCountText;
    Button mCoolButton;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("WordCounter", "onCreate called and it wants its app back");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText = (EditText) findViewById(R.id.sentence_text);
        mWordCountText = (TextView) findViewById(R.id.word_count);
        mCoolButton = (Button) findViewById(R.id.its_cool_button);
    }




}
