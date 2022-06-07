package com.example.m5_mvvm_2_counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    private ScoreViewModel scoreViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewModel = new ViewModelProvider(this).get(ScoreViewModel.class);
        displayForTeamA(scoreViewModel.scoreTeamA);
        displayForTeamB(scoreViewModel.scoreTeamB);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreViewModel.scoreTeamA = scoreViewModel.scoreTeamA + 1;
        displayForTeamA(scoreViewModel.scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreViewModel.scoreTeamA = scoreViewModel.scoreTeamA + 2;
        displayForTeamA(scoreViewModel.scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreViewModel.scoreTeamA = scoreViewModel.scoreTeamA + 3;
        displayForTeamA(scoreViewModel.scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreViewModel.scoreTeamB = scoreViewModel.scoreTeamB + 1;
        displayForTeamB(scoreViewModel.scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreViewModel.scoreTeamB = scoreViewModel.scoreTeamB + 2;
        displayForTeamB(scoreViewModel.scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreViewModel.scoreTeamB = scoreViewModel.scoreTeamB + 3;
        displayForTeamB(scoreViewModel.scoreTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreViewModel.scoreTeamA = 0;
        scoreViewModel.scoreTeamB = 0;
        displayForTeamA(scoreViewModel.scoreTeamA);
        displayForTeamB(scoreViewModel.scoreTeamB);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
