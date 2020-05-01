package com.iqbal.timedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000){

            @Override
            public void onTick(long millisUntilFinished) {
                //Coundown is counting down (every second)
                Log.i("Second Left", String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                //Counter is finished !
            }
        };

       /* final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                //Insert code to be run everu second
                Log.i("Runnable has run !", "a second must have passed...");
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(run);*/
    }
}
