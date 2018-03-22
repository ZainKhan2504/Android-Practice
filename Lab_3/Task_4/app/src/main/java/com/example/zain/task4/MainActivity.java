package com.example.zain.task4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = findViewById(R.id.firstnum);
                int num1 = Integer.parseInt(text1.getText().toString());

                EditText text2 = findViewById(R.id.secondnum);
                int num2 = Integer.parseInt(text2.getText().toString());

                int result = num1 + num2;

                EditText text3 = findViewById(R.id.result);
                text3.setText(String.valueOf(result));
            }
        });
    }
}
