package com.example.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Level1 extends AppCompatActivity {

    EditText textv1;
    EditText textv2;
    EditText textv3;
    EditText textv4;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        textv1 = findViewById(R.id.textv1);
        textv2 = findViewById(R.id.textv2);
        textv3 = findViewById(R.id.textv3);
        textv4 = findViewById(R.id.textv4);


        TextView timer = findViewById(R.id.timer);
        new CountDownTimer(180000, 1000) {

            public void onTick(long millisUntilFinished) {
                long seconds = millisUntilFinished / 1000;
                String time = String.format("%02d:%02d", seconds / 60, seconds % 60);
                timer.setText(time); // textView - це елемент, де відображається час
            }

            public void onFinish() {
                timer.setText("00:00");
            }

        }.start();



        TextView textView1 = (TextView) findViewById(R.id.back_level);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level1.this, GameLevels.class);
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
            Intent intent = new Intent(Level1.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {

        }
    }



    public void clickbtn1(View view) {
        String letter1 = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter1:
                letter1 = "З";
                break;
        }

        if (textv1.isEnabled()) {
            textv1.setText(letter1);
            textv1.setEnabled(false);
            textv2.setEnabled(true);
            textv2.requestFocus();
        } else if (textv2.isEnabled()) {
            textv2.setText(letter1);
            textv2.setEnabled(false);
            textv3.setEnabled(true);
            textv3.requestFocus();
        } else if (textv3.isEnabled()) {
            textv3.setText(letter1);
            textv3.setEnabled(false);
            textv4.setEnabled(true);
            textv4.requestFocus();
        } else if (textv4.isEnabled()) {
            textv4.setText(letter1);
            textv4.setEnabled(false);
        }


    }


    public void clickbtn2(View view) {
        String letter2 = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter2:
                letter2 = "А";
                break;
        }

        if (textv1.isEnabled()) {
            textv1.setText(letter2);
            textv1.setEnabled(false);
            textv2.setEnabled(true);
            textv2.requestFocus();
        } else if (textv2.isEnabled()) {
            textv2.setText(letter2);
            textv2.setEnabled(false);
            textv3.setEnabled(true);
            textv3.requestFocus();
        } else if (textv3.isEnabled()) {
            textv3.setText(letter2);
            textv3.setEnabled(false);
            textv4.setEnabled(true);
            textv4.requestFocus();
        } else if (textv4.isEnabled()) {
            textv4.setText(letter2);
            textv4.setEnabled(false);
        }
    }

    public void clickbtn3(View view) {
        String letter3 = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter3:
                letter3 = "М";
                break;
        }

        if (textv1.isEnabled()) {
            textv1.setText(letter3);
            textv1.setEnabled(false);
            textv2.setEnabled(true);
            textv2.requestFocus();
        } else if (textv2.isEnabled()) {
            textv2.setText(letter3);
            textv2.setEnabled(false);
            textv3.setEnabled(true);
            textv3.requestFocus();
        } else if (textv3.isEnabled()) {
            textv3.setText(letter3);
            textv3.setEnabled(false);
            textv4.setEnabled(true);
            textv4.requestFocus();
        } else if (textv4.isEnabled()) {
            textv4.setText(letter3);
            textv4.setEnabled(false);
        }
    }

    public void clickbtn4(View view) {
        String letter4 = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter4:
                letter4 = "Е";
                break;
        }

        if (textv1.isEnabled()) {
            textv1.setText(letter4);
            textv1.setEnabled(false);
            textv2.setEnabled(true);
            textv2.requestFocus();
        } else if (textv2.isEnabled()) {
            textv2.setText(letter4);
            textv2.setEnabled(false);
            textv3.setEnabled(true);
            textv3.requestFocus();
        } else if (textv3.isEnabled()) {
            textv3.setText(letter4);
            textv3.setEnabled(false);
            textv4.setEnabled(true);
            textv4.requestFocus();
        } else if (textv4.isEnabled()) {
            textv4.setText(letter4);
            textv4.setEnabled(false);
        }
    }

    public void clickbtn5(View view) {
        String letter5 = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter5:
                letter5 = "Т";
                break;
        }

        if (textv1.isEnabled()) {
            textv1.setText(letter5);
            textv1.setEnabled(false);
            textv2.setEnabled(true);
            textv2.requestFocus();
        } else if (textv2.isEnabled()) {
            textv2.setText(letter5);
            textv2.setEnabled(false);
            textv3.setEnabled(true);
            textv3.requestFocus();
        } else if (textv3.isEnabled()) {
            textv3.setText(letter5);
            textv3.setEnabled(false);
            textv4.setEnabled(true);
            textv4.requestFocus();
        } else if (textv4.isEnabled()) {
            textv4.setText(letter5);
            textv4.setEnabled(false);
        }
    }

    public void clickbtn6(View view) {
        String letter6 = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter6:
                letter6 = "Д";
                break;
        }

        if (textv1.isEnabled()) {
            textv1.setText(letter6);
            textv1.setEnabled(false);
            textv2.setEnabled(true);
            textv2.requestFocus();
        } else if (textv2.isEnabled()) {
            textv2.setText(letter6);
            textv2.setEnabled(false);
            textv3.setEnabled(true);
            textv3.requestFocus();
        } else if (textv3.isEnabled()) {
            textv3.setText(letter6);
            textv3.setEnabled(false);
            textv4.setEnabled(true);
            textv4.requestFocus();
        } else if (textv4.isEnabled()) {
            textv4.setText(letter6);
            textv4.setEnabled(false);
        }
    }

    public void clickbtn7(View view) {
        String letter7 = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter7:
                letter7 = "О";
                break;
        }

        if (textv1.isEnabled()) {
            textv1.setText(letter7);
            textv1.setEnabled(false);
            textv2.setEnabled(true);
            textv2.requestFocus();
        } else if (textv2.isEnabled()) {
            textv2.setText(letter7);
            textv2.setEnabled(false);
            textv3.setEnabled(true);
            textv3.requestFocus();
        } else if (textv3.isEnabled()) {
            textv3.setText(letter7);
            textv3.setEnabled(false);
            textv4.setEnabled(true);
            textv4.requestFocus();
        } else if (textv4.isEnabled()) {
            textv4.setText(letter7);
            textv4.setEnabled(false);
        }
    }

    public void clickbtn8(View view) {
        String letter8 = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter8:
                letter8 = "Ь";
                break;
        }

        if (textv1.isEnabled()) {
            textv1.setText(letter8);
            textv1.setEnabled(false);
            textv2.setEnabled(true);
            textv2.requestFocus();
        } else if (textv2.isEnabled()) {
            textv2.setText(letter8);
            textv2.setEnabled(false);
            textv3.setEnabled(true);
            textv3.requestFocus();
        } else if (textv3.isEnabled()) {
            textv3.setText(letter8);
            textv3.setEnabled(false);
            textv4.setEnabled(true);
            textv4.requestFocus();
        } else if (textv4.isEnabled()) {
            textv4.setText(letter8);
            textv4.setEnabled(false);
        }
    }

    public void clickbtn9(View view) {

        String letter9 = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter9:
                letter9 = "Р";
                break;
        }
        if (textv1.isEnabled()) {
            textv1.setText(letter9);
            textv1.setEnabled(false);
            textv2.setEnabled(true);
            textv2.requestFocus();
        } else if (textv2.isEnabled()) {
            textv2.setText(letter9);
            textv2.setEnabled(false);
            textv3.setEnabled(true);
            textv3.requestFocus();
        } else if (textv3.isEnabled()) {
            textv3.setText(letter9);
            textv3.setEnabled(false);
            textv4.setEnabled(true);
            textv4.requestFocus();
        } else if (textv4.isEnabled()) {
            textv4.setText(letter9);
            textv4.setEnabled(false);
        }
    }

    public void clickbtncheck(View view) {
        String l1 = "М";
        String l2 = "О";
        String l3 = "Р";
        String l4 = "Е";

        if (textv1.getText().toString().equals(l1) && textv2.getText().toString().equals(l2)
                && textv3.getText().toString().equals(l3) && textv4.getText().toString().equals(l4)) {

            Dialog dialog;
            dialog = new Dialog(this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.dialogwindow);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(false);
            dialog.show();

        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Ваша відповідь неправильна!!!"); // Встановлюємо текст повідомлення
            builder.setCancelable(true); // Дозволяємо користувачу закрити вікно кнопкою Back
            builder.setPositiveButton("Спробувати ще раз", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // Код, який виконується при натисканні на кнопку "OK"
                }
            });

            AlertDialog alert = builder.create();
            alert.show();
        }
    }


}