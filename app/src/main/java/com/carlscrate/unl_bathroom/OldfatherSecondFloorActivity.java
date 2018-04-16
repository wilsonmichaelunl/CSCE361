package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class OldfatherSecondFloorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldfather_second_floor);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View floorView,
                                    int position,
                                    long id) {
                switch (position) {
                    /*
                    case 0:
                        //The intent is coming from AveryActivity, it needs to launch BathroomActivity
                        Intent intent = new Intent(AveryBasementFloorActivity.this, AveryBasementFloor.class);
                        startActivity((intent));
                        break;
                    */

                    case 1:
                        Intent intent = new Intent(OldfatherSecondFloorActivity.this, OldfatherMen2Activity.class);
                        startActivity(intent);
                        break;

                    default:
                        intent = new Intent(OldfatherSecondFloorActivity.this, UnderConstruction.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.gender);
        listView.setOnItemClickListener(itemClickListener);
    }
}