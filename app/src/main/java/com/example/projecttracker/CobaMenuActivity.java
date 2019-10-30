package com.example.projecttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CobaMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_menu);

        //context menu
        String ContMenu[] = {"Kalajengking", "Kuda", "Kijang", "Kodok"};
        ListView lv = (ListView) findViewById(R.id.lstView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ContMenu);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);

        //context Menu

        @Override
        public void onCreateContextMenu (ContMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
            super.onCreateContextMenu(menu, view, menuInfo);
            menu.setHeaderTitle("silahkan pilih");
            menu.add(0, view.getid(), 0, "Simpan");
            menu.add(0, view.getid(), 0, "Tidak");
        }

        public boolean onContextItemSelected (MenuItem menu){
            if (item.getTitle() == "Simpan") {
                Toast.makeText(getApplicationContext(), "Ex : item disimpan", Toast.LENGTH_SHORT).show();
            } else if (item.getTitle() == "Tidak") {
                Toast.makeText(getApplicationContext(), "Tidak disimpan", Toast.LENGTH_SHORT).show();
            } else {
                return false;
            }
            return true;
        }


        //tampilin icon titik tiga di atas kanan
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu1, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            if (item.getItemId() == R.id.Item1) {
                Toast.makeText(getApplicationContext(), "Menu pertama yang diklik", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.Item2) {
                Toast.makeText(getApplicationContext(), "Menu kedua di klik", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.Item3) {
                Toast.makeText(getApplicationContext(), "Ini ketiga di klik", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.Item4) {
                Toast.makeText(getApplicationContext(), "Menu Ketiga di klik ", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    }
}
