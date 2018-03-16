package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AndrewsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andrews);

        //Called when a floor is selected from the list view
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View floorView,
                                    int position,
                                    long id) {

                if(position == 0){
                    Intent intent = new Intent(AndrewsActivity.this, AndrewsFirstFloorActivity.class);
                    startActivity((intent));
                }else if(position == 1){
                    Intent intent = new Intent(AndrewsActivity.this, AndrewsSecondFloorActivity.class);
                    startActivity(intent);
                }else if(position == 2){
                    Intent intent = new Intent(AndrewsActivity.this, AndrewsThirdFloorActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(AndrewsActivity.this, UnderConstruction.class);
                    startActivity(intent);
                }


            }
        };

        //Adding the listener to the list view
        ListView listView = (ListView) findViewById(R.id.andrews_floors);
        listView.setOnItemClickListener(itemClickListener);
    }
}
