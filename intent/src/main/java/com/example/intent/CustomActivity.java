package com.example.intent;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by TutorialsPoint7 on 8/23/2016.
 */
public class CustomActivity extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.custom_view);
      TextView label = (TextView) findViewById(R.id.show_data);
      Uri url = getIntent().getData();
      label.setText(url.toString());
   }
}