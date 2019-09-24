package com.example.projecttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        super.onCreate(savedInstanceState);

        TextView myTextView = new TextView(this);
        myTextView.setText("Some Help Text");
        setContentView(myTextView);

        TextView myTextView = new TextView(this);

        Bundle b = getIntent().getExtras();

        String helpText = b.getString("helpString");
        myTextView.setText(helpText);
        setContentView(myTextView);
    }
}
