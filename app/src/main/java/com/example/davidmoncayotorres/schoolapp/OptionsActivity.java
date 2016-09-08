package com.example.davidmoncayotorres.schoolapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // We'll define a custom screen layout here (the one shown above), but
        // typically, you could just use the standard ListActivity layout.
        setContentView(R.layout.activity_options);

        ListView listView = (ListView) findViewById(R.id.listOptions);
        String[] values = new String[] { "Profesores", "Cursos", "Directivos",
                "Noticias", "Contactenos" };

        // First p  aramenter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = ((TextView) view).getText().toString();

                if (position == 0) {
                    startActivity(new Intent(OptionsActivity.this, TeacherActivity.class));
                }
                else
                {
                    Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
