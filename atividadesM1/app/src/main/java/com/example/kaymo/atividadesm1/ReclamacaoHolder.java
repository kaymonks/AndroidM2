package com.example.kaymo.atividadesm1;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.support.constraint.Constraints.TAG;

/**
 * Created by kaymo on 23/04/2018.
 */

public class ReclamacaoHolder extends RecyclerView.ViewHolder {

    private ImageView ivCategoria;
    private TextView tvDescricao;
    private TextView tvCategoria;
    int position;

    public ReclamacaoHolder(View itemView) {
        super(itemView);
        tvCategoria = itemView.findViewById(R.id.tvCategoria);
        tvDescricao = itemView.findViewById(R.id.tvDescricao);
        ivCategoria = itemView.findViewById(R.id.ivCategoria);

    }

    public void exibeReclamacao(Reclamação daVez) {
        tvDescricao.setText(daVez.getDescricao());
        if (daVez.getCategoria().equals("Infraestrutura")) {
            ivCategoria.setImageResource(R.drawable.ic_location_city_black_24dp);
        }else if (daVez.getCategoria().equals("Trânsito")) {
            ivCategoria.setImageResource(R.drawable.ic_traffic_black_24dp);
        }else if (daVez.getCategoria().equals("Segurança")) {
            ivCategoria.setImageResource(R.drawable.ic_accessibility_black_24dp);
        }else if (daVez.getCategoria().equals("Outro")){
            ivCategoria.setImageResource(R.drawable.ic_info_black_24dp);
        }
    }
}
