package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {


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


        switch (buildingName){
            case "Avery Hall":
                //The intent is coming from MainActivity, it needs to launch BuildingActivity
                Intent intent = new Intent(MainActivity.this, AveryActivity.class);
                startActivity(intent);
                break;

            case "Oldfather Hall":
                intent = new Intent(MainActivity.this, OldfatherActivity.class);
                startActivity(intent);
                break;

            default:
                intent = new Intent(MainActivity.this, UnderConstruction.class);
                startActivity(intent);

        }
    }

   public void onClickSendEmail(View view){
       Intent intent = new Intent(MainActivity.this,SendEmailActivity.class);
       startActivity(intent);
   }
}
