package com.example.kaymo.exercicio04listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvLista = findViewById(R.id.rvLista);

        PessoaAdapter adaptador = new PessoaAdapter(Pessoa.getLista());
        rvLista.setAdapter(adaptador);

        rvLista.setLayoutManager(new LinearLayoutManager(this));

    }

    public void onClickCadastro(View view) {
        Intent intencao = new Intent(this, PessoaActivity.class);
        startActivity(intencao);
    }
}
