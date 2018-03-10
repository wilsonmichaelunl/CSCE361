package com.carlscrate.unl_bathroom;

/**
 * Created by michael on 1/18/18.
 * NOTE:NOT IN USE RIGHT NOW
 */

public class BuildingExpert {
    private String name;
    private String description;
    private int imageResourceId;

    //buildings is an array of Buildings
    public static final BuildingExpert[] buildings = {
         new BuildingExpert("Avery Hall", "On City Campus, Avery Hall is southeast of Memorial Stadium and home to the Math and Computer Science departments",
            R.drawable.avery),
         new BuildingExpert("Oldfather Hall", "The tallest building on City Campus, it houses the dean of the College of Arts and Sciences",
            R.drawable.oldfather),
         new BuildingExpert("Burnett Hall", "Opened in 1948 Burnett Hall is the home to the Psychology Department",
            R.drawable.burnett)
    };

    //Each building has a name, description and an image resource
    private BuildingExpert(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    //The String representation of a Building is its name
    public String toString(){
        return this.name;
    }
}
