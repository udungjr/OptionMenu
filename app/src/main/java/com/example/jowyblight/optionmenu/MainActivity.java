package com.example.jowyblight.optionmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ListView listView1;
    String contacts[] = { "Andi", "Tony", "Budi", "Sandy", "Dony" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = (ListView) findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, contacts);
        listView1.setAdapter(adapter);

        registerForContextMenu(listView1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Pilih Option");
        menu.add(0, v.getId(), 0, "Panggil");
        menu.add(0, v.getId(), 0, "Kirim SMS");
        menu.add(0, v.getId(), 0, "Hapus Contact");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Panggil") {
            Toast.makeText(getApplicationContext(), "Memanggil Code",
                    Toast.LENGTH_LONG).show();
        } else if (item.getTitle() == "Kirim SMS") {
            Toast.makeText(getApplicationContext(), "Mengirim SMS",
                    Toast.LENGTH_LONG).show();
        } else {

            return false;
        }
        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.layout.my_option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.newMessage){
            Toast.makeText(MainActivity.this, "New Message Selected", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.setting) {
            Toast.makeText(MainActivity.this, "Setting Selected", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.help) {
            startActivity(new Intent(this, HelpActivity.class));
        }

        return true;
    }
}
