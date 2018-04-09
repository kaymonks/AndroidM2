package com.example.kaymo.formageometrica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kaymo.formageometrica.modelo.FormaGeometrica;

/**
 * Created by kaymo on 09/04/2018.
 */

public class OptionActivity extends AppCompatActivity {

    private EditText et_base;
    private EditText et_altura;
    private EditText et_raio;
    private ImageView imagemForma;
    private FormaGeometrica objetoFormaGeometrica;
    private String tipoForma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        objetoFormaGeometrica = (FormaGeometrica) getIntent().getParcelableExtra("extraObj");
        et_raio = (EditText) findViewById(R.id.et_raio);
        et_base = (EditText) findViewById(R.id.et_base);
        et_altura = (EditText) findViewById(R.id.et_altura);

        this.tipoForma = getIntent().getStringExtra("tipo");
    }

    public void onClickAvancar(View view) {

        FormaGeometrica formaGeometrica = new FormaGeometrica();
        double base;
        double altura;
        double res=0;

        switch (tipoForma) {
            case "quadrado":
                if (et_altura.getText().toString() == "" || et_base.getText().toString() == ""){
                    Toast.makeText(this, "Preencha o campo altura e base", Toast.LENGTH_LONG).show();
                }

                base = Double.parseDouble(et_base.getText().toString());
                altura = Double.parseDouble(et_altura.getText().toString());
                formaGeometrica.setAltura(altura);
                formaGeometrica.setBase(base);
                res = formaGeometrica.calculaRetangulo();
                
                break;
            case "triangulo":
                if (et_altura.getText().toString() == "" || et_base.getText().toString() == "") {
                    Toast.makeText(this, "Preencha o campo altura e base", Toast.LENGTH_LONG).show();
                }
                base = Double.parseDouble(et_base.getText().toString());
                altura = Double.parseDouble(et_altura.getText().toString());
                formaGeometrica.setAltura(altura);
                formaGeometrica.setBase(base);
                res = formaGeometrica.calculaTriangulo();
                break;
            case "circulo":
                if (et_raio.getText().toString() == ""){
                    Toast.makeText(this, "Preencha o campo circulo", Toast.LENGTH_LONG).show();
                }
                double raio = Double.parseDouble(et_raio.getText().toString());
                formaGeometrica.setRaio(raio);
                res = formaGeometrica.calculaRaio();
                break;
        }

        Intent intencao = new Intent(this, ResultadoActivity.class);

        intencao.putExtra("extraObjeto", formaGeometrica);
        intencao.putExtra("res", res);

        startActivity(intencao);
    }

}
