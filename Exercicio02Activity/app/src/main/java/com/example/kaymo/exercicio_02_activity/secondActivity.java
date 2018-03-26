package com.example.kaymo.exercicio_02_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    public TextView et_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_result = (TextView) findViewById(R.id.tv_result);
        Intent res = getIntent();
        int i = res.getIntExtra("numero", 0);

        et_result.setText (String.valueOf(i));
    }
}
