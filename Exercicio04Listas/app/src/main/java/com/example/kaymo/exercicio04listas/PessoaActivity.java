package com.example.kaymo.exercicio04listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PessoaActivity extends AppCompatActivity {

    EditText etNome;
    EditText etIdade;
    EditText etRg;
    EditText etCidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);

        etNome = findViewById(R.id.etNome);
        etIdade = findViewById(R.id.etIdade);
        etRg = findViewById(R.id.etRg);
        etCidade = findViewById(R.id.etCidade);
    }

    public void onClickCad(View v) {
        //fazer verificação
        if (etNome.getText().toString().equals("")) {
            Toast.makeText(this, "Insira o nome", Toast.LENGTH_LONG).show();
            return;
        }

        if (etIdade.getText().toString().equals("")) {
            Toast.makeText(this, "Insira a idade", Toast.LENGTH_LONG).show();
            return;
        }

        if (etRg.getText().toString().equals("")) {
            Toast.makeText(this, "Insira o rg", Toast.LENGTH_LONG).show();
            return;
        }

        if (etCidade.getText().toString().equals("")) {
            Toast.makeText(this, "Insira a cidade", Toast.LENGTH_LONG).show();
            return;
        }
        String nome = etNome.getText().toString();
        Integer idade = Integer.parseInt(etIdade.getText().toString());
        String rg = etRg.getText().toString();
        String cidade = etCidade.getText().toString();
        RadioGroup rgSexo = findViewById(R.id.rgSexo);
        if (rgSexo.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Selecione o sexo", Toast.LENGTH_LONG).show();
            return;
        }
        char sexo;
        if (rgSexo.getCheckedRadioButtonId() == R.id.rbFeminino) {
            sexo = 'f';
        }else {
            sexo = 'm';
        }

        Pessoa pessoa = new Pessoa(nome, idade, rg, cidade, sexo);

        PessoaDao pessoa2 = new PessoaDao();

        pessoa2.setLista(pessoa);

        Intent intencao = new Intent(this, MainActivity.class);
        startActivity(intencao);

    }
}
