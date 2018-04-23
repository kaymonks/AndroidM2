package com.example.kaymo.atividadesm1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kaymo on 23/04/2018.
 */

public class ReclamacaoHolder extends RecyclerView.ViewHolder {

    private TextView tvTitulo;
    private TextView tvDescricao;

    public ReclamacaoHolder(View itemView) {
        super(itemView);

        tvTitulo = itemView.findViewById(R.id.tvTitulo);
        tvDescricao = itemView.findViewById(R.id.tvDescricao);
    }

    public void exibeReclamacao(Reclamação daVez) {
        tvTitulo.setText(daVez.getTitulo());
        tvDescricao.setText(daVez.getDescricao());
    }

}
