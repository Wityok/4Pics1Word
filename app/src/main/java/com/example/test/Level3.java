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

public class Level3 extends AppCompatActivity {

    EditText textv1_3L;
    EditText textv2_3L;
    EditText textv3_3L;
    EditText textv4_3L;

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
        setContentView(R.layout.level3);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        textv1_3L = findViewById(R.id.textv1_3L);
        textv2_3L = findViewById(R.id.textv2_3L);
        textv3_3L = findViewById(R.id.textv3_3L);
        textv4_3L = findViewById(R.id.textv4_3L);

        textv1_3L.setTextColor(getResources().getColor(R.color.white));
        textv2_3L.setTextColor(getResources().getColor(R.color.white));
        textv3_3L.setTextColor(getResources().getColor(R.color.white));
        textv4_3L.setTextColor(getResources().getColor(R.color.white));

        TextView textView1 = (TextView) findViewById(R.id.back_level_3L);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level3.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Level3.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }



    public void close(View view) {
        switch (view.getId()) {
            case R.id.close_level_fail:
            case R.id.close_level:
                try {
                    Intent intent = new Intent(Level3.this, GameLevels.class);
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
                    Intent intent = new Intent(Level3.this, Level3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

//    public void next_level(View view) {
//        switch (view.getId()) {
//            case R.id.next_level:
//                try {
//                    Intent intent = new Intent(Level3.this, Level4.class);
//                    startActivity(intent);
//                    finish();
//                } catch (Exception e) {}
//                break;
//        }
//    }

    public void bonus(View view) {
        switch (view.getId()) {
            case R.id.bonus:
                try {
                    Intent intent = new Intent(Level3.this, Bonus3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

    public void clickbtn1_3L(View view) {
        String letter1 = textv1_3L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter1_3L:
                letter1 = "Р";
                break;
        }

        if (textv1_3L.isEnabled()) {
            textv1_3L.setText(letter1);
            textv1_3L.setEnabled(false);
            textv2_3L.setEnabled(true);
            textv2_3L.requestFocus();
        } else if (textv2_3L.isEnabled()) {
            textv2_3L.setText(letter1);
            textv2_3L.setEnabled(false);
            textv3_3L.setEnabled(true);
            textv3_3L.requestFocus();
        } else if (textv3_3L.isEnabled()) {
            textv3_3L.setText(letter1);
            textv3_3L.setEnabled(false);
            textv4_3L.setEnabled(true);
            textv4_3L.requestFocus();
        } else if (textv4_3L.isEnabled()) {
            textv4_3L.setText(letter1);
            textv4_3L.setEnabled(false);
        }


    }


    public void clickbtn2_3L(View view) {
        String letter2 = textv1_3L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter2_3L:
                letter2 = "Д";
                break;
        }

        if (textv1_3L.isEnabled()) {
            textv1_3L.setText(letter2);
            textv1_3L.setEnabled(false);
            textv2_3L.setEnabled(true);
            textv2_3L.requestFocus();
        } else if (textv2_3L.isEnabled()) {
            textv2_3L.setText(letter2);
            textv2_3L.setEnabled(false);
            textv3_3L.setEnabled(true);
            textv3_3L.requestFocus();
        } else if (textv3_3L.isEnabled()) {
            textv3_3L.setText(letter2);
            textv3_3L.setEnabled(false);
            textv4_3L.setEnabled(true);
            textv4_3L.requestFocus();
        } else if (textv4_3L.isEnabled()) {
            textv4_3L.setText(letter2);
            textv4_3L.setEnabled(false);
        }
    }

    public void clickbtn3_3L(View view) {
        String letter3 = textv1_3L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter3_3L:
                letter3 = "Я";
                break;
        }

        if (textv1_3L.isEnabled()) {
            textv1_3L.setText(letter3);
            textv1_3L.setEnabled(false);
            textv2_3L.setEnabled(true);
            textv2_3L.requestFocus();
        } else if (textv2_3L.isEnabled()) {
            textv2_3L.setText(letter3);
            textv2_3L.setEnabled(false);
            textv3_3L.setEnabled(true);
            textv3_3L.requestFocus();
        } else if (textv3_3L.isEnabled()) {
            textv3_3L.setText(letter3);
            textv3_3L.setEnabled(false);
            textv4_3L.setEnabled(true);
            textv4_3L.requestFocus();
        } else if (textv4_3L.isEnabled()) {
            textv4_3L.setText(letter3);
            textv4_3L.setEnabled(false);
        }
    }

    public void clickbtn4_3L(View view) {
        String letter4 = textv1_3L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter4_3L:
                letter4 = "Ь";
                break;
        }

        if (textv1_3L.isEnabled()) {
            textv1_3L.setText(letter4);
            textv1_3L.setEnabled(false);
            textv2_3L.setEnabled(true);
            textv2_3L.requestFocus();
        } else if (textv2_3L.isEnabled()) {
            textv2_3L.setText(letter4);
            textv2_3L.setEnabled(false);
            textv3_3L.setEnabled(true);
            textv3_3L.requestFocus();
        } else if (textv3_3L.isEnabled()) {
            textv3_3L.setText(letter4);
            textv3_3L.setEnabled(false);
            textv4_3L.setEnabled(true);
            textv4_3L.requestFocus();
        } else if (textv4_3L.isEnabled()) {
            textv4_3L.setText(letter4);
            textv4_3L.setEnabled(false);
        }
    }

    public void clickbtn5_3L(View view) {
        String letter5 = textv1_3L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter5_3L:
                letter5 = "Л";
                break;
        }

        if (textv1_3L.isEnabled()) {
            textv1_3L.setText(letter5);
            textv1_3L.setEnabled(false);
            textv2_3L.setEnabled(true);
            textv2_3L.requestFocus();
        } else if (textv2_3L.isEnabled()) {
            textv2_3L.setText(letter5);
            textv2_3L.setEnabled(false);
            textv3_3L.setEnabled(true);
            textv3_3L.requestFocus();
        } else if (textv3_3L.isEnabled()) {
            textv3_3L.setText(letter5);
            textv3_3L.setEnabled(false);
            textv4_3L.setEnabled(true);
            textv4_3L.requestFocus();
        } else if (textv4_3L.isEnabled()) {
            textv4_3L.setText(letter5);
            textv4_3L.setEnabled(false);
        }
    }

    public void clickbtn6_3L(View view) {
        String letter6 = textv1_3L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter6_3L:
                letter6 = "Ч";
                break;
        }

        if (textv1_3L.isEnabled()) {
            textv1_3L.setText(letter6);
            textv1_3L.setEnabled(false);
            textv2_3L.setEnabled(true);
            textv2_3L.requestFocus();
        } else if (textv2_3L.isEnabled()) {
            textv2_3L.setText(letter6);
            textv2_3L.setEnabled(false);
            textv3_3L.setEnabled(true);
            textv3_3L.requestFocus();
        } else if (textv3_3L.isEnabled()) {
            textv3_3L.setText(letter6);
            textv3_3L.setEnabled(false);
            textv4_3L.setEnabled(true);
            textv4_3L.requestFocus();
        } else if (textv4_3L.isEnabled()) {
            textv4_3L.setText(letter6);
            textv4_3L.setEnabled(false);
        }
    }

    public void clickbtn7_3L(View view) {
        String letter7 = textv1_3L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter7_3L:
                letter7 = "Ж";
                break;
        }

        if (textv1_3L.isEnabled()) {
            textv1_3L.setText(letter7);
            textv1_3L.setEnabled(false);
            textv2_3L.setEnabled(true);
            textv2_3L.requestFocus();
        } else if (textv2_3L.isEnabled()) {
            textv2_3L.setText(letter7);
            textv2_3L.setEnabled(false);
            textv3_3L.setEnabled(true);
            textv3_3L.requestFocus();
        } else if (textv3_3L.isEnabled()) {
            textv3_3L.setText(letter7);
            textv3_3L.setEnabled(false);
            textv4_3L.setEnabled(true);
            textv4_3L.requestFocus();
        } else if (textv4_3L.isEnabled()) {
            textv4_3L.setText(letter7);
            textv4_3L.setEnabled(false);
        }
    }

    public void clickbtn8_3L(View view) {
        String letter8 = textv1_3L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter8_3L:
                letter8 = "П";
                break;
        }

        if (textv1_3L.isEnabled()) {
            textv1_3L.setText(letter8);
            textv1_3L.setEnabled(false);
            textv2_3L.setEnabled(true);
            textv2_3L.requestFocus();
        } else if (textv2_3L.isEnabled()) {
            textv2_3L.setText(letter8);
            textv2_3L.setEnabled(false);
            textv3_3L.setEnabled(true);
            textv3_3L.requestFocus();
        } else if (textv3_3L.isEnabled()) {
            textv3_3L.setText(letter8);
            textv3_3L.setEnabled(false);
            textv4_3L.setEnabled(true);
            textv4_3L.requestFocus();
        } else if (textv4_3L.isEnabled()) {
            textv4_3L.setText(letter8);
            textv4_3L.setEnabled(false);
        }
    }

    public void clickbtn9_3L(View view) {

        String letter9 = textv1_3L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter9_3L:
                letter9 = "Б";
                break;
        }
        if (textv1_3L.isEnabled()) {
            textv1_3L.setText(letter9);
            textv1_3L.setEnabled(false);
            textv2_3L.setEnabled(true);
            textv2_3L.requestFocus();
        } else if (textv2_3L.isEnabled()) {
            textv2_3L.setText(letter9);
            textv2_3L.setEnabled(false);
            textv3_3L.setEnabled(true);
            textv3_3L.requestFocus();
        } else if (textv3_3L.isEnabled()) {
            textv3_3L.setText(letter9);
            textv3_3L.setEnabled(false);
            textv4_3L.setEnabled(true);
            textv4_3L.requestFocus();
        } else if (textv4_3L.isEnabled()) {
            textv4_3L.setText(letter9);
            textv4_3L.setEnabled(false);
        }
    }

    public void clickbtncheck_3L(View view) {
        String l1 = "П";
        String l2 = "Л";
        String l3 = "Я";
        String l4 = "Ж";

        if (textv1_3L.getText().toString().equals(l1) && textv2_3L.getText().toString().equals(l2)
                && textv3_3L.getText().toString().equals(l3) && textv4_3L.getText().toString().equals(l4)) {



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