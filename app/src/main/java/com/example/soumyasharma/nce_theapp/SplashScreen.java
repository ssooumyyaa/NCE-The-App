package com.example.soumyasharma.nce_theapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);
        

        Thread th=new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent obj = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(obj);

                }

            }
        };
        th.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
