package com.example.projecttracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);

        Button btnPress = findViewById(R.id.mahasiswa01);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                FragmentTransaction replace = ft.replace(R.id.frameMain, new MahasiswaFragmen());
                ft.commit();
            }
        });

        Button helpBtn = (Button)findViewById(R.id.HelpButton);
        helpBtn.setOnClickListener(HelpButtonListener);

        if (savedInstanceState != null){
            Log.d("Proteintracker",savedInstanceState.getString("abc"));
        }

        Button myBtn = (Button) findViewById(R.id.button1);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, kelola_data_mahasiswa.class);
                startActivity(intent);
                Log.d("Proteintracker", myEditText.getText().toString());
            };


            private View.OnClickListener helpButtonListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,HelpActivity.class);

                    Bundle b = new Bundle();

                    EditText myEditText = (EditText)findViewById(R.id.editText1);

                    b.putString("helpString",myEditText.getText().toString());
                    intent.putExtra(b);

                    startActivity(intent);
                }
                
            };

        });

        }

    public void GoToKelola(View view) {
        Intent intent = new Intent(MainActivity.this, kelola_data_mahasiswa.class);
        startActivity(intent);
    }

    public void GoToDialog(View view) {
        Intent intent = new Intent(MainActivity.this,DialogActivity.class);
    }
}











