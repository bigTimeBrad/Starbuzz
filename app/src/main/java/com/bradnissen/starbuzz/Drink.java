package com.bradnissen.starbuzz;

public class Drink
{
    private String name;
    private String description;
    private int imageResourceId;
    //Drinks are in an array of Drinks. This is so we will not be using a DB
    public static final Drink[] drinks =
    {
            new Drink("Latte", "",R.drawable.latte),
            new Drink("","", R.drawable.cappuccino),
            new Drink("","",R.drawable.filter)
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
