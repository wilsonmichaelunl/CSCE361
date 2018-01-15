package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    private BathroomExpert expert = new BathroomExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the button gets clicked
    public void onClickFindBathroom(View view){
        //Get a reference to the Spinner
        Spinner building = (Spinner) findViewById(R.id.building);
        //Get the selected item in the Spinner
        String buildingName = String.valueOf(building.getSelectedItem());
    }
}
