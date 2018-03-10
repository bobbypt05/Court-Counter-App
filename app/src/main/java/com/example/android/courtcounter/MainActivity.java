package com.example.android.courtcounter;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**

     * Displays the given score for Team A.

     */

    int score_a=0,score_b=0;

    public void reset_everything(View view)
    {
        score_a=0;
        score_b=0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }

    public void increment_2a(View view)
    {
        score_a = score_a + 2;
        displayForTeamA(score_a);
    }

    public void increment_3a(View view)
    {
        score_a = score_a + 3;
        displayForTeamA(score_a);
    }

    public void free_throw_a(View view)
    {
        score_a = score_a + 1;
        displayForTeamA(score_a);
    }

    public void increment_2b(View view)
    {
        score_b = score_b + 2;
        displayForTeamB(score_b);
    }

    public void increment_3b(View view)
    {
        score_b = score_b + 3;
        displayForTeamB(score_b);
    }

    public void free_throw_b(View view)
    {
        score_b = score_b + 1;
        displayForTeamB(score_b);
    }

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }
    public void displayForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);

        scoreView.setText(String.valueOf(score));

    }

}
