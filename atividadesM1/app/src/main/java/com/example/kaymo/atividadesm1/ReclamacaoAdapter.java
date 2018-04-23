package com.example.kaymo.atividadesm1;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by kaymo on 23/04/2018.
 */

public class ReclamacaoAdapter extends RecyclerView.Adapter {

    private ArrayList<Reclamação> listaReclamacao;

    public ReclamacaoAdapter(ArrayList<Reclamação> listaReclamacao) {
        this.listaReclamacao = listaReclamacao;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("RV", "Gaveta criada");
        View elementoPrincipalXML = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reclamacao, parent, false);
        ReclamacaoHolder gaveta = new ReclamacaoHolder(elementoPrincipalXML);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.d("RV", "Gaveta Atualizada"+position);
        ReclamacaoHolder gaveta = (ReclamacaoHolder) holder;
        Reclamação daVez = this.listaReclamacao.get(position);
        gaveta.exibeReclamacao(daVez);
    }

    @Override
    public int getItemCount() {
        return this.listaReclamacao.size();
    }
}
