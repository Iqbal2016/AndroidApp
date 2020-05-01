package com.iqbal.timetables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    public void generateTimeTables(int timesTable){
        //int timesTable =10;
        ArrayList<String> timeTableContent = new ArrayList<String>();
        for (int i =1; i <=10; i++){
            timeTableContent.add(Integer.toString(i*timesTable));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, timeTableContent);
        listView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar timeTableSeekBar = findViewById(R.id.timeTableSeekBar);
        listView = findViewById(R.id.listView);

        timeTableSeekBar.setMax(20);
        timeTableSeekBar.setProgress(10);
        timeTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min =1;
                int timesTable;
                if (progress < min){
                    timesTable = min;
                    timeTableSeekBar.setProgress(min);
                }else {
                    timesTable = progress;
                }
                generateTimeTables(timesTable);
               // Log.i("SeekBar Value", Integer.toString(timesTable));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        generateTimeTables(10);
    }
}
