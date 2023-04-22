package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class Level1 extends AppCompatActivity {

    TextView textv1;
    EditText editText2;
    EditText editText3;
    EditText editText4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        textv1 = findViewById(R.id.textv1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);



        TextView textView1 = (TextView) findViewById(R.id.back_level);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        try{
            Intent intent = new Intent(Level1.this, GameLevels.class);
            startActivity(intent);
            finish();
        }catch (Exception e){

        }
    }

    public void clickbtn1(View view) {
        String letter = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter1:
                letter = "З";
                break;
        }
        textv1.setText(letter);
    }

    public void clickbtn2(View view) {
        String letter = textv1.getText().toString();
        switch (view.getId()) {
            case R.id.btn_text_letter2:
                letter = "А";
                break;
        }
        textv1.setText(letter);
    }
}