package com.example.kaymo.atividadesm1;

import android.content.Context;
import android.content.Intent;
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
    private Context context;

    public ReclamacaoAdapter(Context context, ArrayList<Reclamação> listaReclamacao) {
        this.listaReclamacao = listaReclamacao;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("RV", "Gaveta criada");
        View elementoPrincipalXML = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reclamacao, parent, false);
        ReclamacaoHolder gaveta = new ReclamacaoHolder(elementoPrincipalXML);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        Log.d("RV", "Gaveta Atualizada"+position);
        final ReclamacaoHolder gaveta = (ReclamacaoHolder) holder;
        final Reclamação daVez = this.listaReclamacao.get(position);
        gaveta.exibeReclamacao(daVez);

        gaveta.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                Toast.makeText(context, "posição: "+position +daVez.getCategoria(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, DetalhesActivity.class);
                intent.putExtra("descricao", daVez.getDescricao());
                intent.putExtra("categoria", daVez.getCategoria());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.listaReclamacao.size();
    }
}
