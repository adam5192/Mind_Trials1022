package com.example.mindtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view)
    {
        setContentView(R.layout.diffselect);
    }
    public void easy(View view)
    {
        setContentView(R.layout.easy);
    }
    public void medium(View view)
    {
        setContentView(R.layout.easy);
    }

}
