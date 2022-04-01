package com.example.mindtrials;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    int random;
    int scoreCount = 0;
    ArrayList<Integer> highScores = new ArrayList<Integer>();
    private String message1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view)
    {
        setContentView(R.layout.diffselect);
    }
    public void easy (View view)
    {
        setContentView(R.layout.easy);
    }
    public void medium(View view)
    {
        setContentView(R.layout.medium);
    }
    public void hard(View view)
    {
        setContentView(R.layout.hard);
    }

    @SuppressLint("SetTextI18n")
    public void easyGuess (View view) {

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Result");
        alertDialog.setMessage("Correct");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        EditText guess = (EditText) findViewById(R.id.editTextEasy);
        int guessInt = Integer.parseInt(guess.getText().toString());
        random = randomEasy();

        if (random == guessInt) {
            alertDialog.setMessage("Correct" + "[" + random + "]");
            scoreCount++;
            alertDialog.show();
        }
        else
            {
                this.highScores.add(scoreCount);
                Collections.sort(highScores, Collections.reverseOrder());
                if (scoreCount > highScores.get(0)) {
                    this.message1 = "New High Score! The correct answer was: " + random + " Your score was: " + scoreCount;
                } else {
                    this.message1 = "You Lost :( The correct answer was: " + random + " Your score was: " + scoreCount;
                }
                alertDialog.setMessage(message1);
                alertDialog.show();
                scoreCount = 0;
                setContentView(R.layout.diffselect);
            }
    }

    public void mediumGuess (View view) {

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Result");
        alertDialog.setMessage("Correct");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        EditText guess = (EditText) findViewById(R.id.editTextMedium);
        int guessInt = Integer.parseInt(guess.getText().toString());
        random = randomMedium();

        if (random == guessInt) {
            alertDialog.setMessage("Correct" + "[" + random + "]");
            scoreCount++;
            alertDialog.show();
        }
        else
        {
            this.highScores.add(scoreCount);
            Collections.sort(highScores, Collections.reverseOrder());
            if (scoreCount > highScores.get(0)) {
                this.message1 = "New High Score! The correct answer was: " + random + " Your score was: " + scoreCount;
            } else {
                this.message1 = "You Lost :( The correct answer was: " + random + " Your score was: " + scoreCount;
            }
            alertDialog.setMessage(message1);
            alertDialog.show();
            scoreCount = 0;
            setContentView(R.layout.diffselect);
        }
    }

    public void hardGuess (View view) {

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Result");
        alertDialog.setMessage("Correct");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        EditText guess = (EditText) findViewById(R.id.editTextHard);
        int guessInt = Integer.parseInt(guess.getText().toString());
        random = randomHard();

        if (random == guessInt) {
            alertDialog.setMessage("Correct" + "[" + random + "]");
            scoreCount++;
            alertDialog.show();
        }
        else
        {
            this.highScores.add(scoreCount);
            Collections.sort(highScores, Collections.reverseOrder());
            if (scoreCount > highScores.get(0)) {
                this.message1 = "New High Score! The correct answer was: " + random + " Your score was: " + scoreCount;
            } else {
                this.message1 = "You Lost :( The correct answer was: " + random + " Your score was: " + scoreCount;
            }
            alertDialog.setMessage(message1);
            alertDialog.show();
            scoreCount = 0;
            setContentView(R.layout.diffselect);
        }

    }

    public int randomEasy ()
    {
        return (int)(Math.random() * 3) +1;
    }
    public int randomMedium ()
    {
        return (int)(Math.random() * 5) +1;
    }
    public int randomHard ()
    {
        return (int)(Math.random() * 10) +1;
    }

    public void backDiff (View view) {
        setContentView(R.layout.activity_main);
    }

    public void backGame (View view) {
        setContentView(R.layout.diffselect);
    }

    public void highScore (View view)
    {
        Collections.sort(highScores);
        Collections.sort(highScores, Collections.reverseOrder());

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("High Scores");
        alertDialog.setMessage(Arrays.toString(highScores.toArray()));
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
