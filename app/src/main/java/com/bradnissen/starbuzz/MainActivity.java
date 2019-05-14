package com.bradnissen.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Life-cycle: ", "onCreate()");
        setContentView(R.layout.activity_main);

        //create a listener for the ListView to make an intent depending on which item was
        //clicked in the list
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View v,
                                    int position,
                                    long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        //now attach the listView to the listener
        ListView myListView = (ListView) findViewById(R.id.list_options);
        myListView.setOnItemClickListener(itemClickListener);
    }


}
