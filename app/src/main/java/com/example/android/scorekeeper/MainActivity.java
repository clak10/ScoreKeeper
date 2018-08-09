package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
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

        final Button teamAPoint = findViewById(R.id.p_team_a);
        teamAPoint.setOnClickListener(e -> onClickButton(teamAPoint.getId()));
        final Button teamBPoint = findViewById(R.id.p_team_b);
        teamBPoint.setOnClickListener(e -> onClickButton(teamBPoint.getId()));
        final Button teamAPass = findViewById(R.id.ps_team_a);
        teamAPass.setOnClickListener(e -> onClickButton(teamAPass.getId()));
        final Button teamBPass = findViewById(R.id.ps_team_b);
        teamBPass.setOnClickListener(e -> onClickButton(teamBPass.getId()));
        final Button teamARush = findViewById(R.id.r_team_a);
        teamARush.setOnClickListener(e -> onClickButton(teamARush.getId()));
        final Button teamBRush = findViewById(R.id.r_team_b);
        teamBRush.setOnClickListener(e -> onClickButton(teamBRush.getId()));
        final Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(e -> onClickButton(reset.getId()));

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
     * @param textView is the Text view in focus
     * @param value  the score to be displayed
     *
     */
    protected void display(TextView textView, int value){
        textView.setText("" + value);
    }

    /**
     * Increase the score displayed on each textView when the corresponding button is pressed.
     *
     * @param id Resource Id of the button making the call
     */

    public void onClickButton(@IdRes int id) {
        TextView t;
        TextView u;

        switch (id) {
            case R.id.p_team_a:
                t = findViewById(R.id.Team_A_Score);
                u = findViewById(R.id.Team_B_Score);
                scoreTeamA = addOne(scoreTeamA);
                if (scoreTeamA > scoreTeamB) {
                    t.setTextColor(0xFF00FF00);
                    u.setTextColor(0xFFFF0000);
                } else if (scoreTeamA < scoreTeamB) {
                    t.setTextColor(0xFFFF0000);
                    u.setTextColor(0xFF00FF00);
                } else {
                    t.setTextColor(0xFF000000);
                    u.setTextColor(0xFF000000);

                }
                display(t, scoreTeamA);
                break;
            case R.id.p_team_b:
                t = findViewById(R.id.Team_B_Score);
                u = findViewById(R.id.Team_A_Score);
                scoreTeamB = addOne(scoreTeamB);
                if (scoreTeamA < scoreTeamB) {
                    t.setTextColor(0xFF00FF00);
                    u.setTextColor(0xFFFF0000);
                } else if (scoreTeamA > scoreTeamB) {
                    t.setTextColor(0xFFFF0000);
                    u.setTextColor(0xFF00FF00);
                } else {
                    t.setTextColor(0xFF000000);
                    u.setTextColor(0xFF000000);
                }
                display(t, scoreTeamB);
                break;
            case R.id.ps_team_a:
                t = findViewById(R.id.Team_A_Pass);
                passTeamA = addOne(passTeamA);
                display(t, passTeamA);
                break;
            case R.id.ps_team_b:
                t = findViewById(R.id.Team_B_Pass);
                passTeamB = addOne(passTeamB);
                display(t, passTeamB);
                break;
            case R.id.r_team_a:
                t = findViewById(R.id.Team_A_Rush);
                rushTeamA = addOne(rushTeamA);
                display(t, rushTeamA);
                break;
            case R.id.r_team_b:
                t = findViewById(R.id.Team_B_Rush);
                rushTeamB = addOne(rushTeamB);
                display(t, rushTeamB);
                break;
            case R.id.reset:
                TextView t1 = findViewById(R.id.Team_A_Score);
                TextView t2 = findViewById(R.id.Team_B_Score);
                TextView t3 = findViewById(R.id.Team_A_Pass);
                TextView t4 = findViewById(R.id.Team_B_Pass);
                TextView t5 = findViewById(R.id.Team_A_Rush);
                TextView t6 = findViewById(R.id.Team_B_Rush);
                //Reset all scores
                scoreTeamA = 0;
                scoreTeamB = 0;
                passTeamA = 0;
                passTeamB = 0;
                rushTeamA = 0;
                rushTeamB = 0;

                //Reset text color of team points
                t1.setTextColor(0xFF000000);
                t2.setTextColor(0xFF000000);

                display(t1, scoreTeamA);
                display(t2, scoreTeamB);
                display(t3, passTeamA);
                display(t4, passTeamB);
                display(t5, rushTeamA);
                display(t6, rushTeamB);
            default:
        }
    }

}
