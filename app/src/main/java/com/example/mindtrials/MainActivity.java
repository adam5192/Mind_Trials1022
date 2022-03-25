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

public class MainActivity extends AppCompatActivity {

    int random;
    int scoreCount = 0;

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

        if (random == guessInt)
        {
            alertDialog.setMessage("Correct" + "[" + random + "]");
            scoreCount++;
        }
        else
            {
                alertDialog.setMessage("You Lost :( The correct answer was: "  + random + " Your score was: " + scoreCount);
                scoreCount = 0;
                setContentView(R.layout.diffselect);
            }
        alertDialog.show();
    }

    public void mediumGuess (View view) {


    }

    public void hardGuess (View view) {


    }

    public int randomEasy ()
    {
        return (int)(Math.random() * 3) +1;
    }

}
