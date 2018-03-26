package com.example.kaymo.exercicio_02_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {


    private Button soma;
    private Button multiplica;
    public EditText numero1;
    public EditText numero2;



    public void init(){
        soma = (Button) findViewById(R.id.bt_soma);
        multiplica = (Button) findViewById(R.id.bt_multiplica);
        numero1 = (EditText) findViewById(R.id.et_numero_1);
        numero2 = (EditText) findViewById(R.id.et_numero_2);



        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (numero1.getText().toString().trim().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Numero um não pode ser vazio", Toast.LENGTH_SHORT).show();
                } else if (numero2.getText().toString().trim().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Numero dois não pode ser vazio", Toast.LENGTH_SHORT).show();
                }else {
                    Integer value = Integer.parseInt(numero1.getText().toString());
                    Integer value2 = Integer.parseInt(numero2.getText().toString());


                    Intent segundaTela = new Intent(MainActivity.this, secondActivity.class);

                    Integer res = value + value2;

                    segundaTela.putExtra("numero", res);


                    startActivity(segundaTela);

                }
            }
        });

        multiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numero1.getText().toString().trim().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Numero um não pode ser vazio", Toast.LENGTH_SHORT).show();
                } else if (numero2.getText().toString().trim().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Numero dois não pode ser vazio", Toast.LENGTH_SHORT).show();
                }else {
                    Integer value = Integer.parseInt(numero1.getText().toString());
                    Integer value2 = Integer.parseInt(numero2.getText().toString());


                    Intent segundaTela = new Intent(MainActivity.this, secondActivity.class);

                    Integer res = value * value2;

                    segundaTela.putExtra("numero", res);


                    startActivity(segundaTela);

                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
