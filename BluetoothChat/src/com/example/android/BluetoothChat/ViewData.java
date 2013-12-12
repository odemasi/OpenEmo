package com.example.android.BluetoothChat;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewData extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_data);
		
		//Get the message from the intent
        Intent intent = getIntent();
        String filename = intent.getStringExtra(BluetoothChat.EXTRA_FILENAME);
        
        
      //create the text view
      TextView textView = new TextView(this);
      textView.setTextSize(40);
      textView.setText("will display" + filename);
//      //set the text view as the activity layout
      
      
		ImageView imageView = (ImageView) findViewById(R.id.widget45);
	    imageView.setImageResource(R.drawable.dataplot);
      
//	    setContentView(textView);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_data, menu);
		return true;
	}

}
