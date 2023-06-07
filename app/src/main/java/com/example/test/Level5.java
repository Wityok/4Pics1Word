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

public class Level5 extends AppCompatActivity {

    EditText textv1_5L;
    EditText textv2_5L;
    EditText textv3_5L;
    EditText textv4_5L;
    EditText textv5_5L;

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
        setContentView(R.layout.level5);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        textv1_5L = findViewById(R.id.textv1_5L);
        textv2_5L = findViewById(R.id.textv2_5L);
        textv3_5L = findViewById(R.id.textv3_5L);
        textv4_5L = findViewById(R.id.textv4_5L);
        textv5_5L = findViewById(R.id.textv5_5L);

        textv1_5L.setTextColor(getResources().getColor(R.color.white));
        textv2_5L.setTextColor(getResources().getColor(R.color.white));
        textv3_5L.setTextColor(getResources().getColor(R.color.white));
        textv4_5L.setTextColor(getResources().getColor(R.color.white));
        textv5_5L.setTextColor(getResources().getColor(R.color.white));

        TextView textView1 = (TextView) findViewById(R.id.back_level_5L);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level5.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Level5.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {}
    }



    public void close(View view) {
        switch (view.getId()) {
            case R.id.close_level_fail:
            case R.id.close_level:
                try {
                    Intent intent = new Intent(Level5.this, GameLevels.class);
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
                    Intent intent = new Intent(Level5.this, Level5.class);
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
                    Intent intent = new Intent(Level5.this, Bonus5.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {}
                break;
        }
    }

    public void clickbtn1_5L(View view) {
        String letter1 = textv1_5L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter1_5L:
                letter1 = "Ь";
                break;
        }

        if (textv1_5L.isEnabled()) {
            textv1_5L.setText(letter1);
            textv1_5L.setEnabled(false);
            textv2_5L.setEnabled(true);
            textv2_5L.requestFocus();
        } else if (textv2_5L.isEnabled()) {
            textv2_5L.setText(letter1);
            textv2_5L.setEnabled(false);
            textv3_5L.setEnabled(true);
            textv3_5L.requestFocus();
        } else if (textv3_5L.isEnabled()) {
            textv3_5L.setText(letter1);
            textv3_5L.setEnabled(false);
            textv4_5L.setEnabled(true);
            textv4_5L.requestFocus();
        } else if (textv4_5L.isEnabled()) {
            textv4_5L.setText(letter1);
            textv4_5L.setEnabled(false);
        } else if (textv5_5L.isEnabled()) {
            textv5_5L.setText(letter1);
            textv5_5L.setEnabled(false);
        }
    }


    public void clickbtn2_5L(View view) {
        String letter2 = textv1_5L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter2_5L:
                letter2 = "А";
                break;
        }

        if (textv1_5L.isEnabled()) {
            textv1_5L.setText(letter2);
            textv1_5L.setEnabled(false);
            textv2_5L.setEnabled(true);
            textv2_5L.requestFocus();
        } else if (textv2_5L.isEnabled()) {
            textv2_5L.setText(letter2);
            textv2_5L.setEnabled(false);
            textv3_5L.setEnabled(true);
            textv3_5L.requestFocus();
        } else if (textv3_5L.isEnabled()) {
            textv3_5L.setText(letter2);
            textv3_5L.setEnabled(false);
            textv4_5L.setEnabled(true);
            textv4_5L.requestFocus();
        } else if (textv4_5L.isEnabled()) {
            textv4_5L.setText(letter2);
            textv4_5L.setEnabled(false);
        } else if (textv5_5L.isEnabled()) {
            textv5_5L.setText(letter2);
            textv5_5L.setEnabled(false);

        }
    }

    public void clickbtn3_5L(View view) {
        String letter3 = textv1_5L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter3_5L:
                letter3 = "І";
                break;
        }

        if (textv1_5L.isEnabled()) {
            textv1_5L.setText(letter3);
            textv1_5L.setEnabled(false);
            textv2_5L.setEnabled(true);
            textv2_5L.requestFocus();
        } else if (textv2_5L.isEnabled()) {
            textv2_5L.setText(letter3);
            textv2_5L.setEnabled(false);
            textv3_5L.setEnabled(true);
            textv3_5L.requestFocus();
        } else if (textv3_5L.isEnabled()) {
            textv3_5L.setText(letter3);
            textv3_5L.setEnabled(false);
            textv4_5L.setEnabled(true);
            textv4_5L.requestFocus();
        } else if (textv4_5L.isEnabled()) {
            textv4_5L.setText(letter3);
            textv4_5L.setEnabled(false);
        } else if (textv5_5L.isEnabled()) {
            textv5_5L.setText(letter3);
            textv5_5L.setEnabled(false);

        }
    }

    public void clickbtn4_5L(View view) {
        String letter4 = textv1_5L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter4_5L:
                letter4 = "Х";
                break;
        }

        if (textv1_5L.isEnabled()) {
            textv1_5L.setText(letter4);
            textv1_5L.setEnabled(false);
            textv2_5L.setEnabled(true);
            textv2_5L.requestFocus();
        } else if (textv2_5L.isEnabled()) {
            textv2_5L.setText(letter4);
            textv2_5L.setEnabled(false);
            textv3_5L.setEnabled(true);
            textv3_5L.requestFocus();
        } else if (textv3_5L.isEnabled()) {
            textv3_5L.setText(letter4);
            textv3_5L.setEnabled(false);
            textv4_5L.setEnabled(true);
            textv4_5L.requestFocus();
        } else if (textv4_5L.isEnabled()) {
            textv4_5L.setText(letter4);
            textv4_5L.setEnabled(false);
        } else if (textv5_5L.isEnabled()) {
            textv5_5L.setText(letter4);
            textv5_5L.setEnabled(false);

        }
    }

    public void clickbtn5_5L(View view) {
        String letter5 = textv1_5L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter5_5L:
                letter5 = "Б";
                break;
        }

        if (textv1_5L.isEnabled()) {
            textv1_5L.setText(letter5);
            textv1_5L.setEnabled(false);
            textv2_5L.setEnabled(true);
            textv2_5L.requestFocus();
        } else if (textv2_5L.isEnabled()) {
            textv2_5L.setText(letter5);
            textv2_5L.setEnabled(false);
            textv3_5L.setEnabled(true);
            textv3_5L.requestFocus();
        } else if (textv3_5L.isEnabled()) {
            textv3_5L.setText(letter5);
            textv3_5L.setEnabled(false);
            textv4_5L.setEnabled(true);
            textv4_5L.requestFocus();
        } else if (textv4_5L.isEnabled()) {
            textv4_5L.setText(letter5);
            textv4_5L.setEnabled(false);
        } else if (textv5_5L.isEnabled()) {
            textv5_5L.setText(letter5);
            textv5_5L.setEnabled(false);

        }
    }

    public void clickbtn6_5L(View view) {
        String letter6 = textv1_5L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter6_5L:
                letter6 = "К";
                break;
        }

        if (textv1_5L.isEnabled()) {
            textv1_5L.setText(letter6);
            textv1_5L.setEnabled(false);
            textv2_5L.setEnabled(true);
            textv2_5L.requestFocus();
        } else if (textv2_5L.isEnabled()) {
            textv2_5L.setText(letter6);
            textv2_5L.setEnabled(false);
            textv3_5L.setEnabled(true);
            textv3_5L.requestFocus();
        } else if (textv3_5L.isEnabled()) {
            textv3_5L.setText(letter6);
            textv3_5L.setEnabled(false);
            textv4_5L.setEnabled(true);
            textv4_5L.requestFocus();
        } else if (textv4_5L.isEnabled()) {
            textv4_5L.setText(letter6);
            textv4_5L.setEnabled(false);
        } else if (textv5_5L.isEnabled()) {
            textv5_5L.setText(letter6);
            textv5_5L.setEnabled(false);

        }
    }

    public void clickbtn7_5L(View view) {
        String letter7 = textv1_5L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter7_5L:
                letter7 = "Р";
                break;
        }

        if (textv1_5L.isEnabled()) {
            textv1_5L.setText(letter7);
            textv1_5L.setEnabled(false);
            textv2_5L.setEnabled(true);
            textv2_5L.requestFocus();
        } else if (textv2_5L.isEnabled()) {
            textv2_5L.setText(letter7);
            textv2_5L.setEnabled(false);
            textv3_5L.setEnabled(true);
            textv3_5L.requestFocus();
        } else if (textv3_5L.isEnabled()) {
            textv3_5L.setText(letter7);
            textv3_5L.setEnabled(false);
            textv4_5L.setEnabled(true);
            textv4_5L.requestFocus();
        } else if (textv4_5L.isEnabled()) {
            textv4_5L.setText(letter7);
            textv4_5L.setEnabled(false);
        } else if (textv5_5L.isEnabled()) {
            textv5_5L.setText(letter7);
            textv5_5L.setEnabled(false);

        }
    }

    public void clickbtn8_5L(View view) {
        String letter8 = textv1_5L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter8_5L:
                letter8 = "Т";
                break;
        }

        if (textv1_5L.isEnabled()) {
            textv1_5L.setText(letter8);
            textv1_5L.setEnabled(false);
            textv2_5L.setEnabled(true);
            textv2_5L.requestFocus();
        } else if (textv2_5L.isEnabled()) {
            textv2_5L.setText(letter8);
            textv2_5L.setEnabled(false);
            textv3_5L.setEnabled(true);
            textv3_5L.requestFocus();
        } else if (textv3_5L.isEnabled()) {
            textv3_5L.setText(letter8);
            textv3_5L.setEnabled(false);
            textv4_5L.setEnabled(true);
            textv4_5L.requestFocus();
        } else if (textv4_5L.isEnabled()) {
            textv4_5L.setText(letter8);
            textv4_5L.setEnabled(false);
        }else if (textv5_5L.isEnabled()) {
            textv5_5L.setText(letter8);
            textv5_5L.setEnabled(false);
        }
    }

    public void clickbtn9_5L(View view) {

        String letter9 = textv1_5L.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter9_5L:
                letter9 = "Ц";
                break;
        }
        if (textv1_5L.isEnabled()) {
            textv1_5L.setText(letter9);
            textv1_5L.setEnabled(false);
            textv2_5L.setEnabled(true);
            textv2_5L.requestFocus();
        } else if (textv2_5L.isEnabled()) {
            textv2_5L.setText(letter9);
            textv2_5L.setEnabled(false);
            textv3_5L.setEnabled(true);
            textv3_5L.requestFocus();
        } else if (textv3_5L.isEnabled()) {
            textv3_5L.setText(letter9);
            textv3_5L.setEnabled(false);
            textv4_5L.setEnabled(true);
            textv4_5L.requestFocus();
        } else if (textv4_5L.isEnabled()) {
            textv4_5L.setText(letter9);
            textv4_5L.setEnabled(false);
        } else if (textv5_5L.isEnabled()) {
            textv5_5L.setText(letter9);
            textv5_5L.setEnabled(false);

        }
    }

    public void clickbtncheck_5L(View view) {
        String l1 = "Т";
        String l2 = "А";
        String l3 = "Б";
        String l4 = "І";
        String l5 = "Р";

        if (textv1_5L.getText().toString().equals(l1) && textv2_5L.getText().toString().equals(l2)
                && textv3_5L.getText().toString().equals(l3) && textv4_5L.getText().toString().equals(l4)
                && textv5_5L.getText().toString().equals(l5)) {



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