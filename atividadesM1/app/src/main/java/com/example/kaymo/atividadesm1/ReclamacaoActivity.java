package com.example.kaymo.atividadesm1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class ReclamacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclamacao);
    }

    public void onClickSalvar(View view) {
        EditText etTitulo = findViewById(R.id.etTitulo);
        EditText etDescricao = findViewById(R.id.etDescricao);
        EditText etData = findViewById(R.id.etData);
        CheckBox cbResolvido = findViewById(R.id.cbResolvido);

        if (etTitulo.getText().toString().equals("")) {
            Toast.makeText(this, "Título obrigatório", Toast.LENGTH_LONG).show();
            return;
        }else if (etDescricao.getText().toString().equals("")) {
            Toast.makeText(this, "Descrição obrigatório", Toast.LENGTH_LONG).show();
            return;
        }else if (etData.getText().toString().equals("")) {
            Toast.makeText(this, "Data obrigatório", Toast.LENGTH_LONG).show();
            return;
        }

        String titulo = etTitulo.getText().toString();
        String descricao = etDescricao.getText().toString();
        String data = etData.getText().toString();

        Reclamação reclamação = new Reclamação(titulo, descricao, data, cbResolvido.getText().toString());

        ReclamacaoDao.salvar(this, reclamação);

        setResult(Activity.RESULT_OK);

    }
}
