package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class OldfatherFirstFloorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldfather_first_floor);


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

                    case 0:
                        Intent intent = new Intent(OldfatherFirstFloorActivity.this, OldfatherMen1Activity.class);
                        startActivity(intent);
                        break;

                    default:
                        intent = new Intent(OldfatherFirstFloorActivity.this, UnderConstruction.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.oldfather_first_bathrooms);
        listView.setOnItemClickListener(itemClickListener);
    }
}
