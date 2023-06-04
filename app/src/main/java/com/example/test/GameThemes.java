package com.example.test;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameThemes extends AppCompatActivity {

    private TextView coinView;

    private int loadCoinCount(){
        SharedPreferences sharedPreferences =
                getSharedPreferences("CoinPref",Context.MODE_PRIVATE);
        return sharedPreferences.getInt("coinCount", 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gametheme);

        int coinCount = loadCoinCount();

        CoinManager.setCoinCount(coinCount);

        coinView = findViewById(R.id.coinTextView);
        coinView.setText(String.valueOf(coinCount));


        Button back = (Button) findViewById(R.id.button_back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameThemes.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }catch(Exception e){

                }
            }
        });

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameThemes.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
            }
        });




        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                   WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent(GameThemes.this, MainActivity.class);
            startActivity(intent);
            finish();
        }catch(Exception e){

        }
    }
}