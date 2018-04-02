package com.example.kaymo.formageometrica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioFormGroup;
    private Button botaoExibir;
    private TextView tv_base;
    private EditText et_base;
    private TextView tv_altura;
    private EditText et_altura;
    private EditText et_raio;
    private TextView tv_raio;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        tv_base = (TextView) findViewById(R.id.tv_base);
        et_base = (EditText) findViewById(R.id.et_base);
        tv_altura = (TextView) findViewById(R.id.tv_altura);
        et_altura = (EditText) findViewById(R.id.et_altura);
        tv_raio = (TextView) findViewById(R.id.tv_raio);
        et_raio = (EditText) findViewById(R.id.et_raio);

    }

    public void buttonClick(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        String base = et_base.getText().toString();
        String altura = et_altura.getText().toString();
        String raio = et_raio.getText().toString();
        Double i;
        String result;
        switch (view.getId()) {
            case R.id.rb_quadrado:
                if (checked)
                    tv_raio.setVisibility(View.GONE);
                    et_raio.setVisibility(View.GONE);
                    tv_altura.setVisibility(View.VISIBLE);
                    et_altura.setVisibility(View.VISIBLE);
                    tv_base.setVisibility(View.VISIBLE);
                    et_base.setVisibility(View.VISIBLE);

                    i = Double.parseDouble(base) * Double.parseDouble(altura);
                    result = String.valueOf(i);
                    Toast.makeText(this, result, Toast.LENGTH_LONG).show();
                break;
            case R.id.rb_triangulo:
                if (checked)
                    tv_raio.setVisibility(View.GONE);
                    et_raio.setVisibility(View.GONE);
                    tv_altura.setVisibility(View.VISIBLE);
                    et_altura.setVisibility(View.VISIBLE);
                    tv_base.setVisibility(View.VISIBLE);
                    et_base.setVisibility(View.VISIBLE);

                    i = (Double.parseDouble(base) * Double.parseDouble(altura))/2;
                    result = String.valueOf(i);
                    Toast.makeText(this, result, Toast.LENGTH_LONG).show();

                break;
            case R.id.rb_circulo:
                if (checked)
                    tv_altura.setVisibility(View.GONE);
                    et_altura.setVisibility(View.GONE);
                    tv_base.setVisibility(View.GONE);
                    et_base.setVisibility(View.GONE);
                    tv_raio.setVisibility(View.VISIBLE);
                    et_raio.setVisibility(View.VISIBLE);
                    Double x = 3.14;
                    Double raix2 = Double.parseDouble(raio) * Double.parseDouble(raio);
                    i = Double.parseDouble(String.valueOf(x * raix2));
                    result = String.valueOf(i);
                    Toast.makeText(this, result, Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void calcular(View view) {

    }

}
