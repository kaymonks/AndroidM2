package com.example.kaymo.exercicio04listas;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by kaymo on 12/04/2018.
 */

public class PessoaAdapter extends RecyclerView.Adapter {

    private ArrayList<Pessoa> listaPessoa;

    public PessoaAdapter(ArrayList<Pessoa> listaInicio) {
        this.listaPessoa = listaInicio;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("RV", "Gaveta Criada");
        View elementoXML = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pessoa, parent, false);
        PessoaHolder gaveta = new PessoaHolder(elementoXML);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.d("RV", "Gaveta Atualizada "+position);
        PessoaHolder gaveta = (PessoaHolder) holder;
        Pessoa daVez = this.listaPessoa.get(position);
        gaveta.exibePessoa( daVez );
    }

    @Override
    public int getItemCount() {
        return this.listaPessoa.size();
    }
}
