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

public class Level2 extends AppCompatActivity {

    EditText textv1_2L;
    EditText textv2_2L;
    EditText textv3_2L;
    EditText textv4_2L;
    EditText textv5_2L;

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
        setContentView(R.layout.level2);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        textv1_2L = findViewById(R.id.textv1_2L);
        textv2_2L = findViewById(R.id.textv2_2L);
        textv3_2L = findViewById(R.id.textv3_2L);
        textv4_2L = findViewById(R.id.textv4_2L);
        textv5_2L = findViewById(R.id.textv5_2L);

        textv1_2L.setTextColor(getResources().getColor(R.color.white));
        textv2_2L.setTextColor(getResources().getColor(R.color.white));
        textv3_2L.setTextColor(getResources().getColor(R.color.white));
        textv4_2L.setTextColor(getResources().getColor(R.color.white));
        textv5_2L.setTextColor(getResources().getColor(R.color.white));


        TextView textView1 = (TextView) findViewById(R.id.back_level_2L);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level2.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Level2.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }



    public void close(View view) {
        switch (view.getId()) {
            case R.id.close_level_fail:
            case R.id.close_level:
                try {
                    Intent intent = new Intent(Level2.this, GameLevels.class);
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
                    Intent intent = new Intent(Level2.this, Level2.class);
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
                    Intent intent = new Intent(Level2.this, Level3.class);
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
                    Intent intent = new Intent(Level2.this, Bonus2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

    public void clickbtn1_2L(View view) {
        String letter1 = textv1_2L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter1_2L:
                letter1 = "А";
                break;
        }

        if (textv1_2L.isEnabled()) {
            textv1_2L.setText(letter1);
            textv1_2L.setEnabled(false);
            textv2_2L.setEnabled(true);
            textv2_2L.requestFocus();
        } else if (textv2_2L.isEnabled()) {
            textv2_2L.setText(letter1);
            textv2_2L.setEnabled(false);
            textv3_2L.setEnabled(true);
            textv3_2L.requestFocus();
        } else if (textv3_2L.isEnabled()) {
            textv3_2L.setText(letter1);
            textv3_2L.setEnabled(false);
            textv4_2L.setEnabled(true);
            textv4_2L.requestFocus();
        } else if (textv4_2L.isEnabled()) {
            textv4_2L.setText(letter1);
            textv4_2L.setEnabled(false);
        } else if (textv5_2L.isEnabled()) {
            textv5_2L.setText(letter1);
            textv5_2L.setEnabled(false);
        }


    }


    public void clickbtn2_2L(View view) {
        String letter2 = textv1_2L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter2_2L:
                letter2 = "Р";
                break;
        }

        if (textv1_2L.isEnabled()) {
            textv1_2L.setText(letter2);
            textv1_2L.setEnabled(false);
            textv2_2L.setEnabled(true);
            textv2_2L.requestFocus();
        } else if (textv2_2L.isEnabled()) {
            textv2_2L.setText(letter2);
            textv2_2L.setEnabled(false);
            textv3_2L.setEnabled(true);
            textv3_2L.requestFocus();
        } else if (textv3_2L.isEnabled()) {
            textv3_2L.setText(letter2);
            textv3_2L.setEnabled(false);
            textv4_2L.setEnabled(true);
            textv4_2L.requestFocus();
        } else if (textv4_2L.isEnabled()) {
            textv4_2L.setText(letter2);
            textv4_2L.setEnabled(false);
        } else if (textv5_2L.isEnabled()) {
            textv5_2L.setText(letter2);
            textv5_2L.setEnabled(false);
        }
    }

    public void clickbtn3_2L(View view) {
        String letter3 = textv1_2L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter3_2L:
                letter3 = "К";
                break;
        }

        if (textv1_2L.isEnabled()) {
            textv1_2L.setText(letter3);
            textv1_2L.setEnabled(false);
            textv2_2L.setEnabled(true);
            textv2_2L.requestFocus();
        } else if (textv2_2L.isEnabled()) {
            textv2_2L.setText(letter3);
            textv2_2L.setEnabled(false);
            textv3_2L.setEnabled(true);
            textv3_2L.requestFocus();
        } else if (textv3_2L.isEnabled()) {
            textv3_2L.setText(letter3);
            textv3_2L.setEnabled(false);
            textv4_2L.setEnabled(true);
            textv4_2L.requestFocus();
        } else if (textv4_2L.isEnabled()) {
            textv4_2L.setText(letter3);
            textv4_2L.setEnabled(false);
        } else if (textv5_2L.isEnabled()) {
            textv5_2L.setText(letter3);
            textv5_2L.setEnabled(false);
        }
    }

    public void clickbtn4_2L(View view) {
        String letter4 = textv1_2L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter4_2L:
                letter4 = "П";
                break;
        }

        if (textv1_2L.isEnabled()) {
            textv1_2L.setText(letter4);
            textv1_2L.setEnabled(false);
            textv2_2L.setEnabled(true);
            textv2_2L.requestFocus();
        } else if (textv2_2L.isEnabled()) {
            textv2_2L.setText(letter4);
            textv2_2L.setEnabled(false);
            textv3_2L.setEnabled(true);
            textv3_2L.requestFocus();
        } else if (textv3_2L.isEnabled()) {
            textv3_2L.setText(letter4);
            textv3_2L.setEnabled(false);
            textv4_2L.setEnabled(true);
            textv4_2L.requestFocus();
        } else if (textv4_2L.isEnabled()) {
            textv4_2L.setText(letter4);
            textv4_2L.setEnabled(false);
        } else if (textv5_2L.isEnabled()) {
            textv5_2L.setText(letter4);
            textv5_2L.setEnabled(false);
        }
    }

    public void clickbtn5_2L(View view) {
        String letter5 = textv1_2L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter5_2L:
                letter5 = "Д";
                break;
        }

        if (textv1_2L.isEnabled()) {
            textv1_2L.setText(letter5);
            textv1_2L.setEnabled(false);
            textv2_2L.setEnabled(true);
            textv2_2L.requestFocus();
        } else if (textv2_2L.isEnabled()) {
            textv2_2L.setText(letter5);
            textv2_2L.setEnabled(false);
            textv3_2L.setEnabled(true);
            textv3_2L.requestFocus();
        } else if (textv3_2L.isEnabled()) {
            textv3_2L.setText(letter5);
            textv3_2L.setEnabled(false);
            textv4_2L.setEnabled(true);
            textv4_2L.requestFocus();
        } else if (textv4_2L.isEnabled()) {
            textv4_2L.setText(letter5);
            textv4_2L.setEnabled(false);
        } else if (textv5_2L.isEnabled()) {
            textv5_2L.setText(letter5);
            textv5_2L.setEnabled(false);
        }
    }

    public void clickbtn6_2L(View view) {
        String letter6 = textv1_2L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter6_2L:
                letter6 = "Ф";
                break;
        }

        if (textv1_2L.isEnabled()) {
            textv1_2L.setText(letter6);
            textv1_2L.setEnabled(false);
            textv2_2L.setEnabled(true);
            textv2_2L.requestFocus();
        } else if (textv2_2L.isEnabled()) {
            textv2_2L.setText(letter6);
            textv2_2L.setEnabled(false);
            textv3_2L.setEnabled(true);
            textv3_2L.requestFocus();
        } else if (textv3_2L.isEnabled()) {
            textv3_2L.setText(letter6);
            textv3_2L.setEnabled(false);
            textv4_2L.setEnabled(true);
            textv4_2L.requestFocus();
        } else if (textv4_2L.isEnabled()) {
            textv4_2L.setText(letter6);
            textv4_2L.setEnabled(false);
        } else if (textv5_2L.isEnabled()) {
            textv5_2L.setText(letter6);
            textv5_2L.setEnabled(false);
        }
    }

    public void clickbtn7_2L(View view) {
        String letter7 = textv1_2L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter7_2L:
                letter7 = "С";
                break;
        }

        if (textv1_2L.isEnabled()) {
            textv1_2L.setText(letter7);
            textv1_2L.setEnabled(false);
            textv2_2L.setEnabled(true);
            textv2_2L.requestFocus();
        } else if (textv2_2L.isEnabled()) {
            textv2_2L.setText(letter7);
            textv2_2L.setEnabled(false);
            textv3_2L.setEnabled(true);
            textv3_2L.requestFocus();
        } else if (textv3_2L.isEnabled()) {
            textv3_2L.setText(letter7);
            textv3_2L.setEnabled(false);
            textv4_2L.setEnabled(true);
            textv4_2L.requestFocus();
        } else if (textv4_2L.isEnabled()) {
            textv4_2L.setText(letter7);
            textv4_2L.setEnabled(false);
        } else if (textv5_2L.isEnabled()) {
            textv5_2L.setText(letter7);
            textv5_2L.setEnabled(false);
        }
    }

    public void clickbtn8_2L(View view) {
        String letter8 = textv1_2L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter8_2L:
                letter8 = "Е";
                break;
        }

        if (textv1_2L.isEnabled()) {
            textv1_2L.setText(letter8);
            textv1_2L.setEnabled(false);
            textv2_2L.setEnabled(true);
            textv2_2L.requestFocus();
        } else if (textv2_2L.isEnabled()) {
            textv2_2L.setText(letter8);
            textv2_2L.setEnabled(false);
            textv3_2L.setEnabled(true);
            textv3_2L.requestFocus();
        } else if (textv3_2L.isEnabled()) {
            textv3_2L.setText(letter8);
            textv3_2L.setEnabled(false);
            textv4_2L.setEnabled(true);
            textv4_2L.requestFocus();
        } else if (textv4_2L.isEnabled()) {
            textv4_2L.setText(letter8);
            textv4_2L.setEnabled(false);
        } else if (textv5_2L.isEnabled()) {
            textv5_2L.setText(letter8);
            textv5_2L.setEnabled(false);
        }
    }

    public void clickbtn9_2L(View view) {

        String letter9 = textv1_2L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter9_2L:
                letter9 = "Х";
                break;
        }
        if (textv1_2L.isEnabled()) {
            textv1_2L.setText(letter9);
            textv1_2L.setEnabled(false);
            textv2_2L.setEnabled(true);
            textv2_2L.requestFocus();
        } else if (textv2_2L.isEnabled()) {
            textv2_2L.setText(letter9);
            textv2_2L.setEnabled(false);
            textv3_2L.setEnabled(true);
            textv3_2L.requestFocus();
        } else if (textv3_2L.isEnabled()) {
            textv3_2L.setText(letter9);
            textv3_2L.setEnabled(false);
            textv4_2L.setEnabled(true);
            textv4_2L.requestFocus();
        } else if (textv4_2L.isEnabled()) {
            textv4_2L.setText(letter9);
            textv4_2L.setEnabled(false);
        } else if (textv5_2L.isEnabled()) {
            textv5_2L.setText(letter9);
            textv5_2L.setEnabled(false);
        }
    }

    public void clickbtncheck_2L(View view) {
        String l1 = "С";
        String l2 = "П";
        String l3 = "Е";
        String l4 = "К";
        String l5 = "А";

        if (textv1_2L.getText().toString().equals(l1) && textv2_2L.getText().toString().equals(l2)
                && textv3_2L.getText().toString().equals(l3) && textv4_2L.getText().toString().equals(l4)
                && textv5_2L.getText().toString().equals(l5)) {



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