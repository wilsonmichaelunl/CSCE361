package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.carlscrate.unl_bathroom.R;

public class OldfatherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldfather);

        //Called when a floor is selected from the list view
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View floorView,
                                    int position,
                                    long id) {

                /*
                switch (position) {
                    case 0:
                        //The intent is coming from AveryActivity, it needs to launch FloorActivity
                        Intent intent = new Intent(AveryActivity.this, AveryBasementFloorActivity.class);
                        startActivity((intent));
                        break;

                    case 1:
                        intent = new Intent(AveryActivity.this, AveryFirstFloorActivity.class);
                        startActivity((intent));
                        break;

                    default:
                        intent = new Intent(AveryActivity.this, UnderConstruction.class);
                        startActivity(intent);
                        break;
                }
                */
                if(position == 0){
                    //The intent is coming from AveryActivity, it needs to launch FloorActivity
                    Intent intent = new Intent(OldfatherActivity.this, UnderConstruction.class);
                    startActivity((intent));
                }else if(position == 1){
                    Intent intent = new Intent(OldfatherActivity.this, UnderConstruction.class);
                    startActivity((intent));
                }else if(position == 2){
                    Intent intent = new Intent(OldfatherActivity.this, UnderConstruction.class);
                    startActivity(intent);
                }else if(position == 3){
                    Intent intent = new Intent(OldfatherActivity.this, UnderConstruction.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(OldfatherActivity.this, UnderConstruction.class);
                    startActivity(intent);
                }


            }
        };

        //Adding the listener to the list view
        ListView listView = (ListView) findViewById(R.id.oldfather_floors);
        listView.setOnItemClickListener(itemClickListener);
    }
}
