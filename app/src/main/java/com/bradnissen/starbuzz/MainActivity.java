package com.bradnissen.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Life-cycle: ", "onCreate()");
        setContentView(R.layout.activity_main);
    }

    //create a listener for the ListView to make an intent depending on which item was
    //clicked in the list
    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> listView,
                                View itemView,
                                int position,
                                long id) {
            if (position == 0) {
                //Intent intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                //startActivity(intent);
            }
        }
    };


}
