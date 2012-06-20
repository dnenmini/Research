package com.dn.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class RelativeLayoutTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        setActions();
        
    }
    
    private void setActions()
    {
    	Button addBtn = (Button)findViewById(R.id.add);
    	
    	Button subBtn = (Button) findViewById(R.id.sub);
    	
    	
    	addBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				EditText display = (EditText) findViewById(R.id.display);
		    	
				String currentValueStr = display.getText().toString();
				
				int currentValue = Integer.parseInt(currentValueStr);
				
				currentValue = currentValue + 1;
				
				display.setText(currentValue + "");
				
			}
		});
    	

    	subBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				EditText display = (EditText) findViewById(R.id.display);
		    	
				String currentValueStr = display.getText().toString();
				
				int currentValue = Integer.parseInt(currentValueStr);
				
				currentValue = currentValue - 1;
				
				display.setText(currentValue + "");
				
			}
		});
    }
}