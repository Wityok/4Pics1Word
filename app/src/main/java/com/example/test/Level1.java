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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Level1 extends AppCompatActivity {

    EditText textv1_1L;
    EditText textv2_1L;
    EditText textv3_1L;
    EditText textv4_1L;

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
        setContentView(R.layout.universal);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        textv1_1L = findViewById(R.id.textv1L);
        textv2_1L = findViewById(R.id.textv2L);
        textv3_1L = findViewById(R.id.textv3L);
        textv4_1L = findViewById(R.id.textv4L);

        textv1_1L.setTextColor(getResources().getColor(R.color.white));
        textv2_1L.setTextColor(getResources().getColor(R.color.white));
        textv3_1L.setTextColor(getResources().getColor(R.color.white));
        textv4_1L.setTextColor(getResources().getColor(R.color.white));

        TextView textView1 = (TextView) findViewById(R.id.back_level_2L);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Level1.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }



    public void close(View view) {
        switch (view.getId()) {
            case R.id.close_level_fail:
            case R.id.close_level:
                try {
                    Intent intent = new Intent(Level1.this, GameLevels.class);
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
                    Intent intent = new Intent(Level1.this, Level1.class);
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
                    Intent intent = new Intent(Level1.this, Level2.class);
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
                    Intent intent = new Intent(Level1.this, Bonus1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

    public void clickbtn1_1L(View view) {
        String letter1 = textv1_1L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter1_1L:
                letter1 = "З";
                break;
        }

        if (textv1_1L.isEnabled()) {
            textv1_1L.setText(letter1);
            textv1_1L.setEnabled(false);
            textv2_1L.setEnabled(true);
            textv2_1L.requestFocus();
        } else if (textv2_1L.isEnabled()) {
            textv2_1L.setText(letter1);
            textv2_1L.setEnabled(false);
            textv3_1L.setEnabled(true);
            textv3_1L.requestFocus();
        } else if (textv3_1L.isEnabled()) {
            textv3_1L.setText(letter1);
            textv3_1L.setEnabled(false);
            textv4_1L.setEnabled(true);
            textv4_1L.requestFocus();
        } else if (textv4_1L.isEnabled()) {
            textv4_1L.setText(letter1);
            textv4_1L.setEnabled(false);
        }


    }


    public void clickbtn2_1L(View view) {
        String letter2 = textv1_1L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter2_1L:
                letter2 = "А";
                break;
        }

        if (textv1_1L.isEnabled()) {
            textv1_1L.setText(letter2);
            textv1_1L.setEnabled(false);
            textv2_1L.setEnabled(true);
            textv2_1L.requestFocus();
        } else if (textv2_1L.isEnabled()) {
            textv2_1L.setText(letter2);
            textv2_1L.setEnabled(false);
            textv3_1L.setEnabled(true);
            textv3_1L.requestFocus();
        } else if (textv3_1L.isEnabled()) {
            textv3_1L.setText(letter2);
            textv3_1L.setEnabled(false);
            textv4_1L.setEnabled(true);
            textv4_1L.requestFocus();
        } else if (textv4_1L.isEnabled()) {
            textv4_1L.setText(letter2);
            textv4_1L.setEnabled(false);
        }
    }

    public void clickbtn3_1L(View view) {
        String letter3 = textv1_1L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter3_1L:
                letter3 = "М";
                break;
        }

        if (textv1_1L.isEnabled()) {
            textv1_1L.setText(letter3);
            textv1_1L.setEnabled(false);
            textv2_1L.setEnabled(true);
            textv2_1L.requestFocus();
        } else if (textv2_1L.isEnabled()) {
            textv2_1L.setText(letter3);
            textv2_1L.setEnabled(false);
            textv3_1L.setEnabled(true);
            textv3_1L.requestFocus();
        } else if (textv3_1L.isEnabled()) {
            textv3_1L.setText(letter3);
            textv3_1L.setEnabled(false);
            textv4_1L.setEnabled(true);
            textv4_1L.requestFocus();
        } else if (textv4_1L.isEnabled()) {
            textv4_1L.setText(letter3);
            textv4_1L.setEnabled(false);
        }
    }

    public void clickbtn4_1L(View view) {
        String letter4 = textv1_1L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter4_1L:
                letter4 = "Е";
                break;
        }

        if (textv1_1L.isEnabled()) {
            textv1_1L.setText(letter4);
            textv1_1L.setEnabled(false);
            textv2_1L.setEnabled(true);
            textv2_1L.requestFocus();
        } else if (textv2_1L.isEnabled()) {
            textv2_1L.setText(letter4);
            textv2_1L.setEnabled(false);
            textv3_1L.setEnabled(true);
            textv3_1L.requestFocus();
        } else if (textv3_1L.isEnabled()) {
            textv3_1L.setText(letter4);
            textv3_1L.setEnabled(false);
            textv4_1L.setEnabled(true);
            textv4_1L.requestFocus();
        } else if (textv4_1L.isEnabled()) {
            textv4_1L.setText(letter4);
            textv4_1L.setEnabled(false);
        }
    }

    public void clickbtn5_1L(View view) {
        String letter5 = textv1_1L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter5_1L:
                letter5 = "Т";
                break;
        }

        if (textv1_1L.isEnabled()) {
            textv1_1L.setText(letter5);
            textv1_1L.setEnabled(false);
            textv2_1L.setEnabled(true);
            textv2_1L.requestFocus();
        } else if (textv2_1L.isEnabled()) {
            textv2_1L.setText(letter5);
            textv2_1L.setEnabled(false);
            textv3_1L.setEnabled(true);
            textv3_1L.requestFocus();
        } else if (textv3_1L.isEnabled()) {
            textv3_1L.setText(letter5);
            textv3_1L.setEnabled(false);
            textv4_1L.setEnabled(true);
            textv4_1L.requestFocus();
        } else if (textv4_1L.isEnabled()) {
            textv4_1L.setText(letter5);
            textv4_1L.setEnabled(false);
        }
    }

    public void clickbtn6_1L(View view) {
        String letter6 = textv1_1L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter6_1L:
                letter6 = "Д";
                break;
        }

        if (textv1_1L.isEnabled()) {
            textv1_1L.setText(letter6);
            textv1_1L.setEnabled(false);
            textv2_1L.setEnabled(true);
            textv2_1L.requestFocus();
        } else if (textv2_1L.isEnabled()) {
            textv2_1L.setText(letter6);
            textv2_1L.setEnabled(false);
            textv3_1L.setEnabled(true);
            textv3_1L.requestFocus();
        } else if (textv3_1L.isEnabled()) {
            textv3_1L.setText(letter6);
            textv3_1L.setEnabled(false);
            textv4_1L.setEnabled(true);
            textv4_1L.requestFocus();
        } else if (textv4_1L.isEnabled()) {
            textv4_1L.setText(letter6);
            textv4_1L.setEnabled(false);
        }
    }

    public void clickbtn7_1L(View view) {
        String letter7 = textv1_1L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter7_1L:
                letter7 = "О";
                break;
        }

        if (textv1_1L.isEnabled()) {
            textv1_1L.setText(letter7);
            textv1_1L.setEnabled(false);
            textv2_1L.setEnabled(true);
            textv2_1L.requestFocus();
        } else if (textv2_1L.isEnabled()) {
            textv2_1L.setText(letter7);
            textv2_1L.setEnabled(false);
            textv3_1L.setEnabled(true);
            textv3_1L.requestFocus();
        } else if (textv3_1L.isEnabled()) {
            textv3_1L.setText(letter7);
            textv3_1L.setEnabled(false);
            textv4_1L.setEnabled(true);
            textv4_1L.requestFocus();
        } else if (textv4_1L.isEnabled()) {
            textv4_1L.setText(letter7);
            textv4_1L.setEnabled(false);
        }
    }

    public void clickbtn8_1L(View view) {
        String letter8 = textv1_1L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter8_1L:
                letter8 = "Ь";
                break;
        }

        if (textv1_1L.isEnabled()) {
            textv1_1L.setText(letter8);
            textv1_1L.setEnabled(false);
            textv2_1L.setEnabled(true);
            textv2_1L.requestFocus();
        } else if (textv2_1L.isEnabled()) {
            textv2_1L.setText(letter8);
            textv2_1L.setEnabled(false);
            textv3_1L.setEnabled(true);
            textv3_1L.requestFocus();
        } else if (textv3_1L.isEnabled()) {
            textv3_1L.setText(letter8);
            textv3_1L.setEnabled(false);
            textv4_1L.setEnabled(true);
            textv4_1L.requestFocus();
        } else if (textv4_1L.isEnabled()) {
            textv4_1L.setText(letter8);
            textv4_1L.setEnabled(false);
        }
    }



    public void clickbtn9_1L(View view) {

        String letter9 = textv1_1L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter9_1L:
                letter9 = "Р";
                break;
        }
        if (textv1_1L.isEnabled()) {
            textv1_1L.setText(letter9);
            textv1_1L.setEnabled(false);
            textv2_1L.setEnabled(true);
            textv2_1L.requestFocus();
        } else if (textv2_1L.isEnabled()) {
            textv2_1L.setText(letter9);
            textv2_1L.setEnabled(false);
            textv3_1L.setEnabled(true);
            textv3_1L.requestFocus();
        } else if (textv3_1L.isEnabled()) {
            textv3_1L.setText(letter9);
            textv3_1L.setEnabled(false);
            textv4_1L.setEnabled(true);
            textv4_1L.requestFocus();
        } else if (textv4_1L.isEnabled()) {
            textv4_1L.setText(letter9);
            textv4_1L.setEnabled(false);
        }
    }



    public void clickbtncheck_1L(View view) {
        String l1 = "М";
        String l2 = "О";
        String l3 = "Р";
        String l4 = "Е";

        if (textv1_1L.getText().toString().equals(l1) && textv2_1L.getText().toString().equals(l2)
                && textv3_1L.getText().toString().equals(l3) && textv4_1L.getText().toString().equals(l4)) {



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