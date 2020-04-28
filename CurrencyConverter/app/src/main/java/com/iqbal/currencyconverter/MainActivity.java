package com.iqbal.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertDollar(View view){
        EditText editText = findViewById(R.id.dollarAmount);
        Double doller = Double.parseDouble(editText.getText().toString());
        Double taka = doller*76;
        Toast.makeText(MainActivity.this, "Taka "+taka.toString(), Toast.LENGTH_SHORT).show();
        Log.i( "Info","$ "+taka.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
