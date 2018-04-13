package com.example.kaymo.exercicio04listas;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kaymo on 12/04/2018.
 */

public class PessoaHolder extends RecyclerView.ViewHolder {

    private TextView tvNome;
    private TextView tvIdade;
    private TextView tvSexo;
    private TextView tvCidade;
    private TextView tvRg;
//    private String dados;

    public PessoaHolder(View itemView) {
        super(itemView);

        tvNome = itemView.findViewById(R.id.tvNome);
        tvIdade = itemView.findViewById(R.id.tvIdade);
        tvSexo = itemView.findViewById(R.id.tvSexo);
        tvCidade = itemView.findViewById(R.id.tvCidade);
        tvRg = itemView.findViewById(R.id.tvRg);

        //__________________________________________
//        tvNome = tvNome.
//
//        Pessoa dados = new Pessoa();


    }

    public void exibePessoa(Pessoa daVez) {
        tvNome.setText(daVez.getNome());
        tvIdade.setText(daVez.getIdade()+ " Anos");
        tvSexo.setText(daVez.getSexo()+"");
        tvCidade.setText(daVez.getCidade()+"");
        tvRg.setText(daVez.getRg()+"");
    }
}
