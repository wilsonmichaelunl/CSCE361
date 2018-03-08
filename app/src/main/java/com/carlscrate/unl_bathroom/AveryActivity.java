package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AveryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avery);

        //Called when a floor is selected from the list view
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View floorView,
                                    int position,
                                    long id) {
                switch (position) {
                    case 0:
                        //The intent is coming from AveryActivity, it needs to launch FloorActivity
                        Intent intent = new Intent(AveryActivity.this, AveryBasementFloorActivity.class);
                        startActivity((intent));
                        break;

                    default:
                        intent = new Intent(AveryActivity.this, UnderConstruction.class);
                        startActivity(intent);
                        break;
                }


            }
        };

        //Adding the listener to the list view
        ListView listView = (ListView) findViewById(R.id.avery_floors);
        listView.setOnItemClickListener(itemClickListener);
    }
}
