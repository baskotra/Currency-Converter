package com.android.prakhar.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        try {


            EditText rupeeIndian = (EditText) findViewById(R.id.rupeeIndian);

            Log.i("Convert", rupeeIndian.getText().toString());


            Double resultUSD = Double.parseDouble(rupeeIndian.getText().toString());
            Double converted = resultUSD * 0.018;
            Toast.makeText(MainActivity.this, "$ " + String.format("%.2f", converted), Toast.LENGTH_LONG).show();
        }

        catch(Exception ex)
        {
            Toast.makeText(this, "Enter Some Value", Toast.LENGTH_SHORT).show();
        }
    }

    public void clickFunction2(View view){

        try {
            EditText rupeeIndian = (EditText) findViewById(R.id.rupeeIndian);


            Double resultEUR = Double.parseDouble(rupeeIndian.getText().toString());
            Double converted = resultEUR * 0.012;

            Toast.makeText(this, "EUR " + String.format("%.2f", converted), Toast.LENGTH_LONG).show();
        }
        catch(Exception ex)
        {
            Toast.makeText(this, "Enter Some Value", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
