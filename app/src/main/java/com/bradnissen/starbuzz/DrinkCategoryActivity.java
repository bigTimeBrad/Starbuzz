package com.bradnissen.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //get the listView from the built-in ListActivity method
        ListView listView = getListView();

        //create an array adapter to bind the data to the ListView
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(
            this,
            android.R.layout.simple_list_item_1,
            Drink.drinks);

        //set the "listAdapter" to bind the data and populate the listview with the drink data
        listView.setAdapter(listAdapter);

    }

    /**
     * Use the onItemClick built-in method instead of creating our own.
     */
    @Override
    public void onListItemClick(ListView listView, View itemView, int postition, long id)
    {
        Log.v("TAG", "User clicked "+ id);
        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }

}
