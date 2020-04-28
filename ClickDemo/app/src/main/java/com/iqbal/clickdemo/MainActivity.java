package com.iqbal.clickdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText editText = findViewById(R.id.editText);
        Log.i("Info", "The Button was Clicked ! "+editText.getText().toString());

        Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
