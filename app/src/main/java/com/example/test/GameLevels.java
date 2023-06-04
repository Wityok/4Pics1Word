package com.example.test;

import android.annotation.SuppressLint;
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

public class GameLevels extends AppCompatActivity {

    private TextView coinView;

    private int loadCoinCount(){
        SharedPreferences sharedPreferences =
                getSharedPreferences("CoinPref", Context.MODE_PRIVATE);
        return sharedPreferences.getInt("coinCount", 0);
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevel);

        int coinCount = loadCoinCount();

        CoinManager.setCoinCount(coinCount);

        coinView = findViewById(R.id.coinTextView);
        coinView.setText(String.valueOf(coinCount));

        Button back1 = (Button) findViewById(R.id.button_back2);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, GameThemes.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){}

            }
        });

        TextView textView1 = (TextView) findViewById(R.id.textViewlevel1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){}
            }
        });

        TextView textView2 = (TextView) findViewById(R.id.textViewlevel2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){}
            }
        });

        TextView textView3 = (TextView) findViewById(R.id.textViewlevel3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){}
            }
        });

//        TextView textView4 = (TextView) findViewById(R.id.textViewlevel4);
//        textView4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                try{
//                    Intent intent = new Intent(GameLevels.this, Level4.class);
//                    startActivity(intent);
//                    finish();
//                } catch (Exception e){}
//            }
//        });

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                   WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
    @Override
    public void onBackPressed() {
        try{
            Intent intent = new Intent(GameLevels.this, GameThemes.class);
            startActivity(intent);
            finish();
        } catch (Exception e){}
    }
}