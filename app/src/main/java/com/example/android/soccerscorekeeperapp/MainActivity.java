package com.example.android.soccerscorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Integer values for both team A and B.
    public int scoreA = 0;
    public int foulA = 0;
    public int cornerA = 0;
    public int scoreB = 0;
    public int foulB = 0;
    public int cornerB = 0;
    public int yellowA = 0;
    public int redA=0;
    public int yellowB =0;
    public int redB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // TEAM A
    /**
     * Method that adds to the score sheet for team A.
     */
    public void scoreTeamA(View v) {
        // Updates the score by 1
        scoreA = scoreA + 1;
        scoreForTeamA(scoreA);
    }

    /**
     * Method that adds to the fouls for team A.
     */
    public void foulTeamA(View v) {
        // Updates the fouls by 1
        foulA = foulA + 1;
        foulForTeamA(foulA);
    }

    /**
     * Method that adds to corners for team A.
     */
    public void cornerTeamA(View v) {
        // Updates the corners by 1
        cornerA = cornerA + 1;
        cornerForTeamA(cornerA);
    }

    /**
     * Method that adds a yellow card to team A.
     */
    public void yellowTeamA(View v){
        // Updates the yellow card by 1
        yellowA = yellowA +1;
        yellowForTeamA(yellowA);
    }
    /**
     * Method that adds a yellow card to team A.
     */
    public void redTeamA(View v){
        // Updates the yellow card by 1
        redA = redA +1;
        redForTeamA(redA);
    }

    /**
     * Sets the score view for team A.
     */
    public void scoreForTeamA(int value) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(value));
    }

    /**
     * Sets the foul view for team A.
     */
    public void foulForTeamA(int value) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(value));
    }

    /**
     * Sets the coner view for team A.
     */
    public void cornerForTeamA(int value) {
        TextView cornerView = (TextView) findViewById(R.id.team_a_corner);
        cornerView.setText(String.valueOf(value));
    }

    /**
     * Sets the yellow card view for team A.
     */
    public void yellowForTeamA(int value){
        TextView yellowView = (TextView) findViewById(R.id.team_a_yellow);
        yellowView.setText(String.valueOf(value));
    }

    /**
     * Sets the red card view for team A.
     */
    public void redForTeamA(int value){
        TextView redView = (TextView) findViewById(R.id.team_a_red);
        redView.setText(String.valueOf(value));
    }

    // TEAM B
    /**
     * Method that adds to the score sheet for team B.
     */
    public void scoreTeamB(View v) {
        // Updates the score by 1
        scoreB = scoreB + 1;
        scoreForTeamB(scoreB);
    }

    /**
     * Method that adds to the fouls for team B.
     */
    public void foulTeamB(View v) {
        // Updates the fouls by 1
        foulB = foulB + 1;
        foulForTeamB(foulB);
    }

    /**
     * Method that adds to corners for team B.
     */
    public void cornerTeamB(View v) {
        // Updates the corners by 1
        cornerB = cornerB + 1;
        cornerForTeamB(cornerB);
    }

    /**
     * Method that adds a yellow card to team B.
     */
    public void yellowTeamB(View v){
        // Updates the yellow card by 1
        yellowB = yellowB +1;
        yellowForTeamB(yellowB);
    }
    /**
     * Method that adds a yellow card to team B.
     */
    public void redTeamB(View v){
        // Updates the yellow card by 1
        redB = redB +1;
        redForTeamB(redB);
    }

    /**
     * Sets the score view for team B.
     */
    public void scoreForTeamB(int value) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(value));
    }

    /**
     * Sets the foul view for team B.
     */
    public void foulForTeamB(int value) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(value));
    }

    /**
     * Sets the coner view for team b.
     */
    public void cornerForTeamB(int value) {
        TextView cornerView = (TextView) findViewById(R.id.team_b_corner);
        cornerView.setText(String.valueOf(value));
    }

    /**
     * Sets the yellow card view for team B.
     */
    public void yellowForTeamB(int value){
        TextView yellowView = (TextView) findViewById(R.id.team_b_yellow);
        yellowView.setText(String.valueOf(value));
    }

    /**
     * Sets the red card view for team B.
     */
    public void redForTeamB(int value){
        TextView redView = (TextView) findViewById(R.id.team_b_red);
        redView.setText(String.valueOf(value));
    }

    /**
     * Method that sets all values to 0
     * and update the view values.
     * Hence resetting the game.
     */
    public void resetScore(View v) {
        // Sets all values to 0
        scoreA = 0;
        foulA = 0;
        cornerA = 0;
        scoreB = 0;
        foulB = 0;
        cornerB = 0;
        yellowA = 0;
        redA = 0;
        yellowB = 0;
        redB = 0;
        // Sets new display values for team A
        scoreForTeamA(scoreA);
        foulForTeamA(foulA);
        cornerForTeamA(cornerA);
        yellowForTeamA(yellowA);
        redForTeamA(redA);
        // Sets new display values for team B
        scoreForTeamB(scoreB);
        foulForTeamB(foulB);
        cornerForTeamB(cornerB);
        yellowForTeamB(yellowB);
        redForTeamB(redB);
    }
}
