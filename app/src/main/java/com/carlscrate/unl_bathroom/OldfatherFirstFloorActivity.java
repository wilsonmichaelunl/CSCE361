package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class OldfatherFirstFloorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldfather_first_floor);

        //Makes the image of the floor plan link to website
        ImageView img = (ImageView)findViewById(R.id.oldfather_first_imageView);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);

                startActivity(intent);
            }
        });

        //Called when a floor is selected from the list view
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View floorView,
                                    int position,
                                    long id) {
                switch (position) {

                    case 1:
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

        //Adding the listener to the list view
        ListView listView = (ListView) findViewById(R.id.andrews_first_bathrooms);
        listView.setOnItemClickListener(itemClickListener);
    }
}
