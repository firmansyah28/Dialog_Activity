package com.example.projecttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class kelola_data_mahasiswa extends AppCompatActivity {
    String[] items={"create", "update", "delete"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola_data_mahasiswa);

        ListView lv = findViewById(R.id.Mmhs);
        Spinner spinner = findViewById(R.id.mhsspinner);

        lv.setAdapter(new ArrayAdapter<String>(kelola_data_mahasiswa.this,android.R.layout.simple_list_item_1,items));
        ArrayAdapter<String> aa=new ArrayAdapter<String>(kelola_data_mahasiswa.this,android.R.layout.simple_spinner_item,items);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(kelola_data_mahasiswa.this, "Anda memilih = " + items , Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(kelola_data_mahasiswa.this, "Anda memilih = " + items , Toast.LENGTH_SHORT).show();
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(kelola_data_mahasiswa.this, "Anda memilih = " + items , Toast.LENGTH_LONG).show();
            }
        });
    }

    public void GoToCreate(View view) {
        Intent intent = new Intent(kelola_data_mahasiswa.this, CreateActivity.class);
        startActivity(intent);
    }

    public void GoToUpdate(View view) {
        Intent intent = new Intent(kelola_data_mahasiswa.this, UpdateActivity.class);
        startActivity(intent);
    }
}
