package com.example.kaymo.formageometrica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kaymo.formageometrica.modelo.FormaGeometrica;

public class ResultadoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        FormaGeometrica objetoFormaGeometrica = (FormaGeometrica) getIntent().getParcelableExtra("extraObjeto");
        Double res = getIntent().getDoubleExtra("res", 0);
        TextView tvResultado = findViewById(R.id.tvResultado);
        tvResultado.setText(String.valueOf(res));


    }

}
