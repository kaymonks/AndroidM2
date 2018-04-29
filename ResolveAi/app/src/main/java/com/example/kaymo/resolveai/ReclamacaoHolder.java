package com.example.kaymo.resolveai;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kaymo on 28/04/2018.
 */

class ReclamacaoHolder extends RecyclerView.ViewHolder {

    private ImageView ivCategoria;
    private TextView tvDescricao, tvCategoria, tvUp, tvDown;

    public ReclamacaoHolder(View itemView) {
        super(itemView);
        tvCategoria = itemView.findViewById(R.id.tvCategoria);
        tvDescricao = itemView.findViewById(R.id.tvDescricao);
        ivCategoria = itemView.findViewById(R.id.ivCategoria);
        tvUp = itemView.findViewById(R.id.tvUp);
        tvDown = itemView.findViewById(R.id.tvDown);
    }

    public void exibeReclamacao(Reclamacao daVez) {
        tvDescricao.setText(daVez.getDescricao());
        tvUp.setText(String.valueOf(daVez.getCurtir()));
        tvDown.setText(String.valueOf(daVez.getNaoCurtir()));
        if (daVez.getCategoria().equals("Infraestrutura")) {
            ivCategoria.setImageResource(R.drawable.ic_location_city_black_24dp);
        }else if (daVez.getCategoria().equals("Trânsito")) {
            ivCategoria.setImageResource(R.drawable.ic_traffic_black_24dp);
        }else if (daVez.getCategoria().equals("Segurança")) {
            ivCategoria.setImageResource(R.drawable.ic_warning_black_24dp);
        }else if (daVez.getCategoria().equals("Outro")){
            ivCategoria.setImageResource(R.drawable.ic_info_black_24dp);
        }
    }
}
