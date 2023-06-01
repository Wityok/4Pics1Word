package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Bonus1 extends AppCompatActivity {

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