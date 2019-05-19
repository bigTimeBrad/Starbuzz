package com.bradnissen.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //get the extra information from the intent
        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);

        //This gets the object from the Drink array passing the the Drink No. from the intent
        Drink drink = Drink.drinks[drinkNo];

        //update the views with the data
        updateViews(drink);
    }

    private void updateViews(Drink drink){
        //get the views
        ImageView img = (ImageView) findViewById(R.id.photo);
        TextView name = (TextView) findViewById(R.id.name);
        TextView desc = findViewById(R.id.description);

        //set the views
        img.setImageResource(drink.getImageResourceId());
        name.setText(drink.getName());
        desc.setText(drink.getDescription());
    }
}
