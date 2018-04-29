package com.example.kaymo.resolveai;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetalhesActivity extends AppCompatActivity {

    String categoria, descricao;
    TextView tvDescricao, tvCategoria, tvCurtidas, tvNaoCurtidas;
    ImageView ivCategoria;

    FloatingActionButton  btCurtir, btNaoCurtir;
    int id, qtdCurtir, qtdNaoCurtir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        tvCategoria = findViewById(R.id.tvCategoria);
        tvDescricao = findViewById(R.id.tvDescricao);
        ivCategoria = findViewById(R.id.ivCategoria);
        btCurtir = findViewById(R.id.btCurtir);
        btNaoCurtir = findViewById(R.id.btNaoCurtir);

        categoria = getIntent().getExtras().getString("categoria");
        descricao = getIntent().getExtras().getString("descricao");
        id = getIntent().getExtras().getInt("id", -1);
        qtdCurtir = getIntent().getExtras().getInt("curtir", -1);
        qtdNaoCurtir = getIntent().getExtras().getInt("naoCurtir", -1);

        Log.d(String.valueOf(this), "onCreate: "+"curtir "+qtdCurtir+" Naocurtir "+qtdNaoCurtir);
        if (categoria.equals("Infraestrutura")) {
            ivCategoria.setImageResource(R.drawable.ic_location_city_black_24dp);
        } else if (categoria.equals("Trânsito")) {
            ivCategoria.setImageResource(R.drawable.ic_traffic_black_24dp);
        }else if (categoria.equals("Segurança")) {
            ivCategoria.setImageResource(R.drawable.ic_accessibility_black_24dp);
        }else if (categoria.equals("Outro")){
            ivCategoria.setImageResource(R.drawable.ic_info_black_24dp);
        }

        tvCategoria.setText(categoria);
        tvDescricao.setText(descricao);

        btCurtir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            qtdCurtir += 1;
            Reclamacao reclamacao = new Reclamacao();
            ReclamacaoDAO reclamacaoDAO = new ReclamacaoDAO(getBaseContext());
            reclamacao.setId(id);
            reclamacao.setCategoria(categoria);
            reclamacao.setDescricao(descricao);
            reclamacao.setCurtir(qtdCurtir);
            reclamacao.setNaoCurtir(qtdNaoCurtir);

            reclamacaoDAO.updateReclamacao(reclamacao);

            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);

            }
        });

        btNaoCurtir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtdNaoCurtir += 1;
                Reclamacao reclamacao = new Reclamacao();
                ReclamacaoDAO reclamacaoDAO = new ReclamacaoDAO(getBaseContext());
                reclamacao.setId(id);
                reclamacao.setCategoria(categoria);
                reclamacao.setDescricao(descricao);
                reclamacao.setCurtir(qtdCurtir);
                reclamacao.setNaoCurtir(qtdNaoCurtir);
                Log.d(String.valueOf(this), "onCreate2: "+reclamacao.getNaoCurtir());
                reclamacaoDAO.updateReclamacao(reclamacao);

                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
