package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int passTeamA = 0;
    int passTeamB = 0;
    int rushTeamA = 0;
    int rushTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the value by 1.
     */
    protected int addOne(int value){
        value = value + 1;
        return value;
    }

    /**
     * Display a given value to the given text view.
     * @param textView
     * @param value
     * #IO18ExtendedPh
     * #flutterextended
     *
     */
    protected void display(TextView textView, int value){
        textView.setText(""+value);
    }

    /**
     * Increase the score for Team A by 1 points and display to the appropriate text view.
     */
    public void incrScoreTeamA(View view){
        TextView t = findViewById(R.id.Team_A_Score);
        scoreTeamA = addOne(scoreTeamA);
        display(t, scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 points and display to the appropriate text view.
     */
    public void incrScoreTeamB(View view){
        TextView t = findViewById(R.id.Team_B_Score);
        scoreTeamB = addOne(scoreTeamB);
        display(t, scoreTeamB);
    }

    /**
     * Increase the passing for Team A by 1 points and display to the appropriate text view.
     */
    public void incrPassTeamA(View view){
        TextView t = findViewById(R.id.Team_A_Pass);
        passTeamA = addOne(passTeamA);
        display(t, passTeamA);
    }

    /**
     * Increase the passing for Team B by 1 points and display to the appropriate text view.
     */
    public void incrPassTeamB(View view){
        TextView t = findViewById(R.id.Team_B_Pass);
        passTeamB = addOne(passTeamB);
        display(t, passTeamB);
    }

    /**
     * Increase the rushing for Team A by 1 points and display to the appropriate text view.
     */
    public void incrRushTeamA(View view){
        TextView t = findViewById(R.id.Team_A_Rush);
        rushTeamA = addOne(rushTeamA);
        display(t, rushTeamA);
    }

    /**
     * Increase the rushing for Team B by 1 points and display to the appropriate text view.
     */
    public void incrRushTeamB(View view){
        TextView t = findViewById(R.id.Team_B_Rush);
        rushTeamB = addOne(rushTeamB);
        display(t, rushTeamB);
    }

    /**
     * Set all metric variables to zero and display to the appropriate text view.
     */
    public void reset(View view){
        TextView t1 = findViewById(R.id.Team_A_Score);
        TextView t2 = findViewById(R.id.Team_B_Score);
        TextView t3 = findViewById(R.id.Team_A_Pass);
        TextView t4 = findViewById(R.id.Team_B_Pass);
        TextView t5 = findViewById(R.id.Team_A_Rush);
        TextView t6 = findViewById(R.id.Team_B_Rush);
        scoreTeamA = 0;
        scoreTeamB = 0;
        passTeamA = 0;
        passTeamB = 0;
        rushTeamA = 0;
        rushTeamB = 0;
        display(t1, scoreTeamA);
        display(t2, scoreTeamB);
        display(t3, passTeamA);
        display(t4, passTeamB);
        display(t5, rushTeamA);
        display(t6, rushTeamB);
    }

}
