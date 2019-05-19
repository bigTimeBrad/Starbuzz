package com.bradnissen.starbuzz;

public class Drink
{
    private String name;
    private String description;
    private int imageResourceId;
    //Drinks are in an array of Drinks. This is so we will not be using a DB
    public static final Drink[] drinks =
    {
            new Drink("Latte", "A couple of espresso shots with steamed milk",R.drawable.latte),
            new Drink("Cappuccino","Esspresso, hot milk, and a streamed milk foam.", R.drawable.cappuccino),
            new Drink("Filter","Highest quality beans roasted and brewed fresh.",R.drawable.filter)
    };

    //Constructor
    private Drink(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    @Override
    public String toString(){
        return this.name;
    }



}
