package com.example.kaymo.atividadesm1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kaymo on 26/04/2018.
 */

public class DetalhesActivity extends AppCompatActivity {

    private static final String TAG = "DetalhesActivity";
    String categoria;
    String descricao;
    TextView tvDescricao;
    TextView tvCategoria;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        tvCategoria = findViewById(R.id.tvCategoria);
        tvDescricao = findViewById(R.id.tvDescricao);

        categoria = getIntent().getExtras().getString("categoria");
        descricao = getIntent().getExtras().getString("descricao");

        tvCategoria.setText(categoria);
        tvDescricao.setText(descricao);

    }
}
