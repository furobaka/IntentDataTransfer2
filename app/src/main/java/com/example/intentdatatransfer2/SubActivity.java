package com.example.intentdatatransfer2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {
    private EditText editText;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
}
