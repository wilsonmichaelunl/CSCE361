package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
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


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View floorView,
                                    int position,
                                    long id) {

        if(position == 0){
            Intent intent = new Intent(OldfatherActivity.this, OldfatherFirstFloorActivity.class);
            startActivity((intent));
        }else if(position == 1){
            Intent intent = new Intent(OldfatherActivity.this, OldfatherSecondFloorActivity.class);
            startActivity(intent);
        }else if(position == 2){
            Intent intent = new Intent(OldfatherActivity.this, OldfatherThirdFloorActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(OldfatherActivity.this, UnderConstruction.class);
            startActivity(intent);
        }


    }
};

        ListView listView = (ListView) findViewById(R.id.oldfather_floors);
        listView.setOnItemClickListener(itemClickListener);


    }
}
