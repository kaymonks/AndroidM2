package com.example.kaymo.atividadesm1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kaymo on 26/04/2018.
 */

public class DetalhesActivity extends AppCompatActivity {

    private static final String TAG = "DetalhesActivity";
    String categoria;
    String descricao;
    String imagemCategoria;
    TextView tvDescricao;
    TextView tvCategoria;
    ImageView ivCategoria;
    int curtir = 0, naoCurtir = 0, position;
    Button btCurtir, btNaoCurtir;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        tvCategoria = findViewById(R.id.tvCategoria);
        tvDescricao = findViewById(R.id.tvDescricao);
        ivCategoria = findViewById(R.id.ivCategoria);
        btCurtir = findViewById(R.id.btCurtir);
        btNaoCurtir = findViewById(R.id.btNaoCurtir);

        categoria = getIntent().getExtras().getString("categoria");
        descricao = getIntent().getExtras().getString("descricao");
//        position = Integer.parseInt(getIntent().getExtras().getString("position"));

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

    }

    public void curtir() {
        this.curtir = 1;
        btCurtir.setEnabled(false);
        btNaoCurtir.setEnabled(false);
    }

    public void naoCurtir() {
        this.naoCurtir = 1;
        btCurtir.setEnabled(false);
        btNaoCurtir.setEnabled(false);
    }
}
