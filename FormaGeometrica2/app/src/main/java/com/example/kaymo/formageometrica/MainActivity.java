package com.example.kaymo.formageometrica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kaymo.formageometrica.modelo.FormaGeometrica;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private EditText et_base;
    private EditText et_altura;
    private ImageView imagemForma;
    private RadioButton quadrado, triangulo, circulo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickGetOption(View v) {

       RadioGroup rgForma = findViewById(R.id.radioGroup);
       RadioButton selectedRadioButton, q, t, c;

        if(rgForma.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Selecione uma forma", Toast.LENGTH_LONG).show();
            return;
        }

        FormaGeometrica formaGeometrica = new FormaGeometrica();
        formaGeometrica.setTipoForma("quadrado");

        q = (RadioButton)findViewById(R.id.rb_quadrado);
        t = (RadioButton)findViewById(R.id.rb_triangulo);
        c = (RadioButton)findViewById(R.id.rb_circulo);
        String tipo = "";
        if (q.isChecked()){
            formaGeometrica.setTipoForma("quadrado");
            tipo = "quadrado";
        }else if(t.isChecked()){
            formaGeometrica.setTipoForma("triangulo");
            tipo = "triangulo";
        }else if (c.isChecked()){
            formaGeometrica.setTipoForma("circulo");
            tipo = "circulo";
        }

        Intent intencao = new Intent(this, OptionActivity.class);
        intencao.putExtra("extraObj", formaGeometrica);
        intencao.putExtra("tipo", tipo);
        startActivity(intencao);

    }

}
