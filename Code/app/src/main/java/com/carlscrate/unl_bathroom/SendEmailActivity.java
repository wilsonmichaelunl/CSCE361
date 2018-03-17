package com.carlscrate.unl_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SendEmailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
    }

    public void onClickRequest(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","carlscrate@gmail.com", null));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Bathroom Request");
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));
    }
}
