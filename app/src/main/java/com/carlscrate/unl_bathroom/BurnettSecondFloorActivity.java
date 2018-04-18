package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BurnettSecondFloorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burnett_second_floor);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View floorView,
                                    int position,
                                    long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(BurnettSecondFloorActivity.this, BurnettWomen2.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent = new Intent(BurnettSecondFloorActivity.this, BurnettMens3.class);
                        startActivity(intent);
                        break;

                    default:
                        intent = new Intent(BurnettSecondFloorActivity.this, UnderConstruction.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.Burnettlist2);
        listView.setOnItemClickListener(itemClickListener);
    }
}
