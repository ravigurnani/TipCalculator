package com.example.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TipcalculatorActivity extends Activity {
    
	public EditText etAmount;
	public TextView tvTip;
	public TextView tvBill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipcalculator);
        etAmount =  (EditText) findViewById(R.id.etBillAmount);
        tvTip    =  (TextView) findViewById(R.id.tvFinalTip);
        tvBill   =  (TextView) findViewById(R.id.tvBillAmt);
    }
    
    public void Tip10pc (View v) {
    	
    	float billAmt, tip, totAmt;
    	if ( !etAmount.getText().toString().isEmpty()) {
	    	billAmt = Float.parseFloat(etAmount.getText().toString());
	    	
	    	tip = (float) (billAmt*0.1);
	    	totAmt = tip + billAmt;
	        tvTip.setText("Tip: "+tip);
	        tvBill.setText("Total Bill: " +totAmt);
    	} else {
    		Toast.makeText(this, "Please enter bill amount", Toast.LENGTH_SHORT).show();
    	}
    }
    
    public void Tip20pc (View v) {
    	
    	float billAmt=(float) 0.0,tip, totAmt;
    	if ( !etAmount.getText().toString().isEmpty()) {
	    	
    		billAmt = Float.parseFloat(etAmount.getText().toString());
	    	tip = (float) (billAmt*0.2);
	    	totAmt = tip + billAmt;
	    	//Toast.makeText(this, "Tip Amount is : "+tip, Toast.LENGTH_SHORT).show();
	    	//Toast.makeText(this, "Total Amount is : "+totAmt, Toast.LENGTH_SHORT).show();
	        tvTip.setText("Tip: "+tip);
	        tvBill.setText("Total Bill: " +totAmt);
    	} else {
    		Toast.makeText(this, "Please enter bill amount", Toast.LENGTH_SHORT).show();
    	}
    		
    }
    
   public void Tip30pc (View v) {
    	
    	float billAmt, tip, totAmt;
    	if ( !etAmount.getText().toString().isEmpty()) {
	    	billAmt = Float.parseFloat(etAmount.getText().toString());
	    	tip = (float) (billAmt*0.3);
	    	totAmt = tip + billAmt;
	    	//Toast.makeText(this, "Tip Amount is : "+tip, Toast.LENGTH_SHORT).show();
	    	//Toast.makeText(this, "Total Amount is : "+totAmt, Toast.LENGTH_SHORT).show();
	        tvTip.setText("Tip: "+tip);
	        tvBill.setText("Total Bill: " +totAmt);
    	} else {
    		Toast.makeText(this, "Please enter bill amount", Toast.LENGTH_SHORT).show();
    	}
    }
}
