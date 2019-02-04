// https://akira-watson.com/android/activity-2.html
package com.example.intentdatatransfer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // the key constant
    public static final String EXTRA_MESSAGE
            = "com.example.intentdatatransfer2.MESSAGE";
    private TextView textView;
    static final int RESULT_SUBACTIVITY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        final EditText editText = findViewById(R.id.edit_text);

        Button button = findViewById(R.id.button);

    }
}
