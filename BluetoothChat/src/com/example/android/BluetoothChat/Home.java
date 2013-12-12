package com.example.android.BluetoothChat;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		ImageView imageView = (ImageView) findViewById(R.id.logoimage);
	    imageView.setImageResource(R.drawable.logo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
    public void goToSurvey(View view){
    	Intent intent = new Intent(this, Survey.class);
//    	String myText = "this is my test text";
    	startActivity(intent); 
    }

    
    public void displayViewData(View view){
    	Intent intent = new Intent(this, ViewData.class);
//    	String myText = "this is my test text";
    	startActivity(intent); 
    }

}
