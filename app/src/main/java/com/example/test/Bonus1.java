package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Bonus1 extends AppCompatActivity {

    private void saveCoinCount(int coinCount) {
        SharedPreferences sharedPreferences =
                getSharedPreferences("CoinPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("coinCount", coinCount);
        editor.apply();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bonus1);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Bonus1.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }


    public void close(View view) {
        switch (view.getId()) {
            case R.id.bonus_close_level:
                try {
                    Intent intent = new Intent(Bonus1.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

    public void answer1(View view) {
        switch (view.getId()) {
            case R.id.answer1:
                Dialog dialog;
                dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.bonus_dialog_window_lose);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setCancelable(false);
                dialog.show();
                break;
        }
    }
    public void answer2(View view) {
        switch (view.getId()) {
            case R.id.answer2:
                Dialog dialog;
                dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.bonus_dialog_window_lose);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setCancelable(false);
                dialog.show();
                break;
        }
    }
    public void answer3(View view) {
        switch (view.getId()) {
            case R.id.answer3:
                Dialog dialog;
                dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.bonus_dialog_window_lose);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setCancelable(false);
                dialog.show();
                break;
        }
    }
    public void answer4(View view) {
        switch (view.getId()) {
            case R.id.answer4:
                Dialog dialog;
                dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.bonus_dialog_window);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setCancelable(false);
                dialog.show();

                CoinManager.addCoins(5);
                saveCoinCount(CoinManager.getCoinCount());

                break;
        }
    }

    public void bonus_next_level(View view) {
        switch (view.getId()) {
            case R.id.bonus_next_level:
                try {
                    Intent intent = new Intent(Bonus1.this, Level2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

}