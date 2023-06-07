package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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
import android.widget.EditText;
import android.widget.TextView;

public class Level4 extends AppCompatActivity {

    EditText textv1_4L;
    EditText textv2_4L;
    EditText textv3_4L;
    EditText textv4_4L;
    EditText textv5_4L;

    private void saveCoinCount(int coinCount) {
        SharedPreferences sharedPreferences =
                getSharedPreferences("CoinPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("coinCount", coinCount);
        editor.apply();
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level4);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        textv1_4L = findViewById(R.id.textv1_4L);
        textv2_4L = findViewById(R.id.textv2_4L);
        textv3_4L = findViewById(R.id.textv3_4L);
        textv4_4L = findViewById(R.id.textv4_4L);
        textv5_4L = findViewById(R.id.textv5_4L);

        textv1_4L.setTextColor(getResources().getColor(R.color.white));
        textv2_4L.setTextColor(getResources().getColor(R.color.white));
        textv3_4L.setTextColor(getResources().getColor(R.color.white));
        textv4_4L.setTextColor(getResources().getColor(R.color.white));
        textv5_4L.setTextColor(getResources().getColor(R.color.white));

        TextView textView1 = (TextView) findViewById(R.id.back_level_4L);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level4.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Level4.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }



    public void close(View view) {
        switch (view.getId()) {
            case R.id.close_level_fail:
            case R.id.close_level:
                try {
                    Intent intent = new Intent(Level4.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

    public void retry(View view) {
        switch (view.getId()) {
            case R.id.retry_level:
                try {
                    Intent intent = new Intent(Level4.this, Level4.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

    public void next_level(View view) {
        switch (view.getId()) {
            case R.id.next_level:
                try {
                    Intent intent = new Intent(Level4.this, Level5.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

    public void bonus(View view) {
        switch (view.getId()) {
            case R.id.bonus:
                try {
                    Intent intent = new Intent(Level4.this, Bonus4.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

    public void clickbtn1_4L(View view) {
        String letter1 = textv1_4L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter1_4L:
                letter1 = "Я";
                break;
        }

        if (textv1_4L.isEnabled()) {
            textv1_4L.setText(letter1);
            textv1_4L.setEnabled(false);
            textv2_4L.setEnabled(true);
            textv2_4L.requestFocus();
        } else if (textv2_4L.isEnabled()) {
            textv2_4L.setText(letter1);
            textv2_4L.setEnabled(false);
            textv3_4L.setEnabled(true);
            textv3_4L.requestFocus();
        } else if (textv3_4L.isEnabled()) {
            textv3_4L.setText(letter1);
            textv3_4L.setEnabled(false);
            textv4_4L.setEnabled(true);
            textv4_4L.requestFocus();
        } else if (textv4_4L.isEnabled()) {
            textv4_4L.setText(letter1);
            textv4_4L.setEnabled(false);
        } else if (textv5_4L.isEnabled()) {
            textv5_4L.setText(letter1);
            textv5_4L.setEnabled(false);
        }
    }


    public void clickbtn2_4L(View view) {
        String letter2 = textv1_4L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter2_4L:
                letter2 = "Г";
                break;
        }

        if (textv1_4L.isEnabled()) {
            textv1_4L.setText(letter2);
            textv1_4L.setEnabled(false);
            textv2_4L.setEnabled(true);
            textv2_4L.requestFocus();
        } else if (textv2_4L.isEnabled()) {
            textv2_4L.setText(letter2);
            textv2_4L.setEnabled(false);
            textv3_4L.setEnabled(true);
            textv3_4L.requestFocus();
        } else if (textv3_4L.isEnabled()) {
            textv3_4L.setText(letter2);
            textv3_4L.setEnabled(false);
            textv4_4L.setEnabled(true);
            textv4_4L.requestFocus();
        } else if (textv4_4L.isEnabled()) {
            textv4_4L.setText(letter2);
            textv4_4L.setEnabled(false);
        } else if (textv5_4L.isEnabled()) {
            textv5_4L.setText(letter2);
            textv5_4L.setEnabled(false);

        }
    }

    public void clickbtn3_4L(View view) {
        String letter3 = textv1_4L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter3_4L:
                letter3 = "С";
                break;
        }

        if (textv1_4L.isEnabled()) {
            textv1_4L.setText(letter3);
            textv1_4L.setEnabled(false);
            textv2_4L.setEnabled(true);
            textv2_4L.requestFocus();
        } else if (textv2_4L.isEnabled()) {
            textv2_4L.setText(letter3);
            textv2_4L.setEnabled(false);
            textv3_4L.setEnabled(true);
            textv3_4L.requestFocus();
        } else if (textv3_4L.isEnabled()) {
            textv3_4L.setText(letter3);
            textv3_4L.setEnabled(false);
            textv4_4L.setEnabled(true);
            textv4_4L.requestFocus();
        } else if (textv4_4L.isEnabled()) {
            textv4_4L.setText(letter3);
            textv4_4L.setEnabled(false);
        } else if (textv5_4L.isEnabled()) {
            textv5_4L.setText(letter3);
            textv5_4L.setEnabled(false);

        }
    }

    public void clickbtn4_4L(View view) {
        String letter4 = textv1_4L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter4_4L:
                letter4 = "Ю";
                break;
        }

        if (textv1_4L.isEnabled()) {
            textv1_4L.setText(letter4);
            textv1_4L.setEnabled(false);
            textv2_4L.setEnabled(true);
            textv2_4L.requestFocus();
        } else if (textv2_4L.isEnabled()) {
            textv2_4L.setText(letter4);
            textv2_4L.setEnabled(false);
            textv3_4L.setEnabled(true);
            textv3_4L.requestFocus();
        } else if (textv3_4L.isEnabled()) {
            textv3_4L.setText(letter4);
            textv3_4L.setEnabled(false);
            textv4_4L.setEnabled(true);
            textv4_4L.requestFocus();
        } else if (textv4_4L.isEnabled()) {
            textv4_4L.setText(letter4);
            textv4_4L.setEnabled(false);
        } else if (textv5_4L.isEnabled()) {
            textv5_4L.setText(letter4);
            textv5_4L.setEnabled(false);

        }
    }

    public void clickbtn5_4L(View view) {
        String letter5 = textv1_4L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter5_4L:
                letter5 = "Ч";
                break;
        }

        if (textv1_4L.isEnabled()) {
            textv1_4L.setText(letter5);
            textv1_4L.setEnabled(false);
            textv2_4L.setEnabled(true);
            textv2_4L.requestFocus();
        } else if (textv2_4L.isEnabled()) {
            textv2_4L.setText(letter5);
            textv2_4L.setEnabled(false);
            textv3_4L.setEnabled(true);
            textv3_4L.requestFocus();
        } else if (textv3_4L.isEnabled()) {
            textv3_4L.setText(letter5);
            textv3_4L.setEnabled(false);
            textv4_4L.setEnabled(true);
            textv4_4L.requestFocus();
        } else if (textv4_4L.isEnabled()) {
            textv4_4L.setText(letter5);
            textv4_4L.setEnabled(false);
        } else if (textv5_4L.isEnabled()) {
            textv5_4L.setText(letter5);
            textv5_4L.setEnabled(false);

        }
    }

    public void clickbtn6_4L(View view) {
        String letter6 = textv1_4L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter6_4L:
                letter6 = "В";
                break;
        }

        if (textv1_4L.isEnabled()) {
            textv1_4L.setText(letter6);
            textv1_4L.setEnabled(false);
            textv2_4L.setEnabled(true);
            textv2_4L.requestFocus();
        } else if (textv2_4L.isEnabled()) {
            textv2_4L.setText(letter6);
            textv2_4L.setEnabled(false);
            textv3_4L.setEnabled(true);
            textv3_4L.requestFocus();
        } else if (textv3_4L.isEnabled()) {
            textv3_4L.setText(letter6);
            textv3_4L.setEnabled(false);
            textv4_4L.setEnabled(true);
            textv4_4L.requestFocus();
        } else if (textv4_4L.isEnabled()) {
            textv4_4L.setText(letter6);
            textv4_4L.setEnabled(false);
        } else if (textv5_4L.isEnabled()) {
            textv5_4L.setText(letter6);
            textv5_4L.setEnabled(false);

        }
    }

    public void clickbtn7_4L(View view) {
        String letter7 = textv1_4L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter7_4L:
                letter7 = "Т";
                break;
        }

        if (textv1_4L.isEnabled()) {
            textv1_4L.setText(letter7);
            textv1_4L.setEnabled(false);
            textv2_4L.setEnabled(true);
            textv2_4L.requestFocus();
        } else if (textv2_4L.isEnabled()) {
            textv2_4L.setText(letter7);
            textv2_4L.setEnabled(false);
            textv3_4L.setEnabled(true);
            textv3_4L.requestFocus();
        } else if (textv3_4L.isEnabled()) {
            textv3_4L.setText(letter7);
            textv3_4L.setEnabled(false);
            textv4_4L.setEnabled(true);
            textv4_4L.requestFocus();
        } else if (textv4_4L.isEnabled()) {
            textv4_4L.setText(letter7);
            textv4_4L.setEnabled(false);
        } else if (textv5_4L.isEnabled()) {
            textv5_4L.setText(letter7);
            textv5_4L.setEnabled(false);

        }
    }

    public void clickbtn8_4L(View view) {
        String letter8 = textv1_4L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter8_4L:
                letter8 = "Й";
                break;
        }

        if (textv1_4L.isEnabled()) {
            textv1_4L.setText(letter8);
            textv1_4L.setEnabled(false);
            textv2_4L.setEnabled(true);
            textv2_4L.requestFocus();
        } else if (textv2_4L.isEnabled()) {
            textv2_4L.setText(letter8);
            textv2_4L.setEnabled(false);
            textv3_4L.setEnabled(true);
            textv3_4L.requestFocus();
        } else if (textv3_4L.isEnabled()) {
            textv3_4L.setText(letter8);
            textv3_4L.setEnabled(false);
            textv4_4L.setEnabled(true);
            textv4_4L.requestFocus();
        } else if (textv4_4L.isEnabled()) {
            textv4_4L.setText(letter8);
            textv4_4L.setEnabled(false);
        }else if (textv5_4L.isEnabled()) {
            textv5_4L.setText(letter8);
            textv5_4L.setEnabled(false);
        }
    }

    public void clickbtn9_4L(View view) {

        String letter9 = textv1_4L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter9_4L:
                letter9 = "О";
                break;
        }
        if (textv1_4L.isEnabled()) {
            textv1_4L.setText(letter9);
            textv1_4L.setEnabled(false);
            textv2_4L.setEnabled(true);
            textv2_4L.requestFocus();
        } else if (textv2_4L.isEnabled()) {
            textv2_4L.setText(letter9);
            textv2_4L.setEnabled(false);
            textv3_4L.setEnabled(true);
            textv3_4L.requestFocus();
        } else if (textv3_4L.isEnabled()) {
            textv3_4L.setText(letter9);
            textv3_4L.setEnabled(false);
            textv4_4L.setEnabled(true);
            textv4_4L.requestFocus();
        } else if (textv4_4L.isEnabled()) {
            textv4_4L.setText(letter9);
            textv4_4L.setEnabled(false);
        } else if (textv5_4L.isEnabled()) {
            textv5_4L.setText(letter9);
            textv5_4L.setEnabled(false);

        }
    }

    public void clickbtncheck_4L(View view) {
        String l1 = "С";
        String l2 = "В";
        String l3 = "Я";
        String l4 = "Т";
        String l5 = "О";

        if (textv1_4L.getText().toString().equals(l1) && textv2_4L.getText().toString().equals(l2)
                && textv3_4L.getText().toString().equals(l3) && textv4_4L.getText().toString().equals(l4)
                && textv5_4L.getText().toString().equals(l5)) {



            Dialog dialog;
            dialog = new Dialog(this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.dialogwindow);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(false);
            dialog.show();

            CoinManager.addCoins(10);
            saveCoinCount(CoinManager.getCoinCount());

        } else {

            Dialog dialog;
            dialog = new Dialog(this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.dialogwindowfail);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(false);
            dialog.show();

        }


    }

}