package com.jakepolatty.highschoolsciencebowlpractice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jakepolatty.highschoolsciencebowlpractice.R;
import com.jakepolatty.highschoolsciencebowlpractice.model.QuestionJSONParser;

public class HomePage extends AppCompatActivity {
    private Button quizModeOptionButton;
    private Button readerModeOptionButton;
    private Button studyModeOptionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        QuestionJSONParser.getInstance(getApplicationContext());

        quizModeOptionButton = (Button) findViewById(R.id.quizModeOptionButton);
        readerModeOptionButton = (Button) findViewById(R.id.readerModeOptionButton);
        studyModeOptionButton = (Button) findViewById(R.id.studyModeOptionButton);
    }

    public void openQuizModeSettings(View view) {
        Intent intent = new Intent(HomePage.this, QuizModeSettingsPage.class);
        startActivity(intent);
    }
}