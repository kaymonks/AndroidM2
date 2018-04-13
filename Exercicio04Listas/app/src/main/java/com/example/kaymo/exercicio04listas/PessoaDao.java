package com.example.kaymo.exercicio04listas;

import java.util.ArrayList;

/**
 * Created by kaymo on 12/04/2018.
 */

public class PessoaDao {

    ArrayList<Pessoa> retorno = new ArrayList<>();
    public ArrayList<Pessoa> getLista() {

        return this.retorno;


    }

    public  ArrayList<Pessoa> setLista(Pessoa pessoa) {


        this.retorno.add(pessoa);
        return this.retorno ;
    }

}
