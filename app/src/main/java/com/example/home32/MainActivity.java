package com.example.home32;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    EditText text2;
    EditText text3;
    TextView viewT;

    Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.editTextNumber);
        text2 = findViewById(R.id.editTextNumber2);
        text3 = findViewById(R.id.editTextNumber3);
        viewT= findViewById(R.id.textView);
        if (savedInstanceState!=null){
            String str = savedInstanceState.getString("result");
           viewT.setText(str);
        }
    }

    public void result(View view) {
        result= Integer.parseInt(text1.getText().toString())+Integer.parseInt(text2.getText().toString())+Integer.parseInt(text3.getText().toString());
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("result",result.toString());
    }

}