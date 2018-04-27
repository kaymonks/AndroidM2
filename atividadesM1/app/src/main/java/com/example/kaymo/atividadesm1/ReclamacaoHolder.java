package com.example.kaymo.atividadesm1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kaymo on 23/04/2018.
 */

public class ReclamacaoHolder extends RecyclerView.ViewHolder {

    private ImageView ivCategoria;
    private TextView tvDescricao;
    private TextView tvCategoria;
//    RelativeLayout parentLayout;

    public ReclamacaoHolder(View itemView) {
        super(itemView);
        tvCategoria = itemView.findViewById(R.id.tvCategoria);
        tvDescricao = itemView.findViewById(R.id.tvDescricao);
    }


    public void exibeReclamacao(Reclamação daVez) {
//        tvCategoria.setText(daVez.getCategoria());
        tvDescricao.setText(daVez.getDescricao());
    }


}
