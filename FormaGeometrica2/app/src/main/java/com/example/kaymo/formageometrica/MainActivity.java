package com.example.kaymo.formageometrica;

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

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button btnDisplay;
    private TextView tv_base;
    private EditText et_base;
    private TextView tv_altura;
    private EditText et_altura;
    private EditText et_raio;
    private TextView tv_raio;
    private TextView resultado;
    private ImageView imagemForma;
    private RadioButton quadrado, triangulo, circulo;
    private Double i;
    private String res;
    private String base;
    private String altura;
    private String raio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.tv_result);
        tv_base = (TextView) findViewById(R.id.tv_base);
        et_base = (EditText) findViewById(R.id.et_base);
        tv_altura = (TextView) findViewById(R.id.tv_altura);
        et_altura = (EditText) findViewById(R.id.et_altura);
        tv_raio = (TextView) findViewById(R.id.tv_raio);
        et_raio = (EditText) findViewById(R.id.et_raio);
        imagemForma = (ImageView) findViewById(R.id.iv_forma);

        quadrado = (RadioButton) findViewById(R.id.rb_quadrado);
        triangulo = (RadioButton) findViewById(R.id.rb_triangulo);
        circulo = (RadioButton) findViewById(R.id.rb_circulo);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        base = et_base.getText().toString();
        altura = et_altura.getText().toString();
        raio = et_raio.getText().toString();


        quadrado.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                tv_raio.setVisibility(View.GONE);
                et_raio.setVisibility(View.GONE);
                tv_altura.setVisibility(View.VISIBLE);
                et_altura.setVisibility(View.VISIBLE);
                tv_base.setVisibility(View.VISIBLE);
                et_base.setVisibility(View.VISIBLE);
            }
        });

        triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_raio.setVisibility(View.GONE);
                et_raio.setVisibility(View.GONE);
                tv_altura.setVisibility(View.VISIBLE);
                et_altura.setVisibility(View.VISIBLE);
                tv_base.setVisibility(View.VISIBLE);
                et_base.setVisibility(View.VISIBLE);
            }
        });

        circulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_base.setVisibility(View.GONE);
                et_base.setVisibility(View.GONE);
                tv_altura.setVisibility(View.GONE);
                et_altura.setVisibility(View.GONE);
                tv_raio.setVisibility(View.VISIBLE);
                et_raio.setVisibility(View.VISIBLE);
            }
        });


        btnDisplay = (Button) findViewById(R.id.bt_calcular);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == quadrado.getId()){
                    if (et_base.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(), "Campo base obrigatório", Toast.LENGTH_SHORT).show();
                        return;
                    } else if(et_altura.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(), "Campo altura obrigatório", Toast.LENGTH_LONG).show();
                        return;
                    } else {
                        imagemForma.setImageResource(R.mipmap.retan);
                        imagemForma.setVisibility(View.VISIBLE);
                        i = Double.parseDouble(et_base.getText().toString()) * Double.parseDouble(et_altura.getText().toString());
                        res = String.valueOf(i);
                        resultado.setText("Area: " + res + " cm2");
                    }
                } else if (selectedId == triangulo.getId()) {
                    if (et_base.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(), "Campo base obrigatório", Toast.LENGTH_SHORT).show();
                        return;
                    }else if(et_altura.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(), "Campo altura obrigatório", Toast.LENGTH_LONG).show();
                        return;
                    }else {
                        imagemForma.setImageResource(R.mipmap.tri);
                        imagemForma.setVisibility(View.VISIBLE);
                        i = (Double.parseDouble(et_base.getText().toString()) * Double.parseDouble(et_altura.getText().toString()))/2;
                        res = String.valueOf(i);
                        resultado.setText("Area: " + res + " cm2");
                    }
                } else if (selectedId == circulo.getId()){
                    if (et_raio.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(), "Campo raio obrigatório", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        imagemForma.setImageResource(R.mipmap.circle);
                        imagemForma.setVisibility(View.VISIBLE);
                        i = Double.parseDouble(String.valueOf(3.14 * (Double.parseDouble(et_raio.getText().toString()) * Double.parseDouble(et_raio.getText().toString()))));
                        res = String.valueOf(i);
                        resultado.setText("Area: "+res+" cm2");
                    }
                }
            }
        });
    }

//    public void buttonClick(View view) {
//
//        boolean checked = ((RadioButton) view).isChecked();
//        String base = et_base.getText().toString();
//        String altura = et_altura.getText().toString();
//        String raio = et_raio.getText().toString();
//        Double i;
//        String result;
//        switch (view.getId()) {
//            case R.id.rb_quadrado:
//                if (checked)
//                    tv_raio.setVisibility(View.GONE);
//                    et_raio.setVisibility(View.GONE);
//                    tv_altura.setVisibility(View.VISIBLE);
//                    et_altura.setVisibility(View.VISIBLE);
//                    tv_base.setVisibility(View.VISIBLE);
//                    et_base.setVisibility(View.VISIBLE);
////                    if(tv_altura.equals("")){
////                        Toast.makeText(this, "Campo altura obrigatório", Toast.LENGTH_LONG).show();
////                        return;
////                    }else if (TextUtils.isEmpty((CharSequence) tv_base)){
////                        Toast.makeText(this, "Campo Base obrigatório", Toast.LENGTH_LONG).show();
////                        return;
////                    }else {
//                        imagemForma.setImageResource(R.mipmap.retan);
//                        imagemForma.setVisibility(View.VISIBLE);
//                        i = Double.parseDouble(base) * Double.parseDouble(altura);
//                        result = String.valueOf(i);
//                        resultado.setText("Area: "+result+" cm2");
////                    }
//                break;
//            case R.id.rb_triangulo:
//                if (checked)
//                    tv_raio.setVisibility(View.GONE);
//                    et_raio.setVisibility(View.GONE);
//                    tv_altura.setVisibility(View.VISIBLE);
//                    et_altura.setVisibility(View.VISIBLE);
//                    tv_base.setVisibility(View.VISIBLE);
//                    et_base.setVisibility(View.VISIBLE);
//                    imagemForma.setImageResource(R.mipmap.tri);
//                    imagemForma.setVisibility(View.VISIBLE);
//                    i = (Double.parseDouble(base) * Double.parseDouble(altura))/2;
//                    result = String.valueOf(i);
//                    resultado.setText("Area: "+result+" cm2");
////                    Toast.makeText(this, result, Toast.LENGTH_LONG).show();
//
//                break;
//            case R.id.rb_circulo:
//                if (checked)
//                    tv_altura.setVisibility(View.GONE);
//                    et_altura.setVisibility(View.GONE);
//                    tv_base.setVisibility(View.GONE);
//                    et_base.setVisibility(View.GONE);
//                    tv_raio.setVisibility(View.VISIBLE);
//                    et_raio.setVisibility(View.VISIBLE);
//                    imagemForma.setImageResource(R.mipmap.circle);
//                    imagemForma.setVisibility(View.VISIBLE);
////                    Double x = 3.14;
////                    Double raix2 = Double.parseDouble(raio) * Double.parseDouble(raio);
////                    i = Double.parseDouble(String.valueOf(3.14 * (Double.parseDouble(raio) * Double.parseDouble(raio))));
////                    result = String.valueOf(i);
////                    resultado.setText("Area: "+result+" cm2");
////                    Toast.makeText(this, result, Toast.LENGTH_LONG).show();
//                break;
//
//        }
//
//    }


    }
