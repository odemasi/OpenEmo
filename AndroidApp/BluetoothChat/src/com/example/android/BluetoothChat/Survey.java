package com.example.android.BluetoothChat;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Survey extends Activity {
	public final static String EXTRA_FIRSTNAME = "com.example.BluetoothChat.FIRSTNAME";
	public final static String EXTRA_LASTNAME = "com.example.BluetoothChat.LASTNAME";
	public final static String EXTRA_VILLAGE = "com.example.BluetoothChat.VILLAGENAME";
	public final static String EXTRA_DATE = "com.example.BluetoothChat.DATE";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.survey, menu);
		return true;
	}

    public void goToBluetoothChat(View view){
    	Intent intent = new Intent(this, BluetoothChat.class);
    	
    	EditText editText = (EditText) findViewById(R.id.edit_firstname);
    	String firstname = editText.getText().toString();
    	intent.putExtra(EXTRA_FIRSTNAME, firstname);
    	
    	editText = (EditText) findViewById(R.id.edit_lastname);
    	intent.putExtra(EXTRA_LASTNAME, editText.getText().toString());
    	
    	editText = (EditText) findViewById(R.id.edit_date);
    	intent.putExtra(EXTRA_DATE, editText.getText().toString());
    	
    	editText = (EditText) findViewById(R.id.edit_village);
    	intent.putExtra(EXTRA_VILLAGE, editText.getText().toString());
    	
    	startActivity(intent); 
    }
}
