package com.example.kaymo.exercicio04listas;

import java.util.ArrayList;

/**
 * Created by kaymo on 12/04/2018.
 */

public class PessoaDao {

    static ArrayList<Pessoa> retorno = new ArrayList<>();

    public static ArrayList<Pessoa> getLista() {

        return retorno;
    }

    public  ArrayList<Pessoa> setLista(Pessoa pessoa) {
        retorno.add(pessoa);

        return retorno ;
    }

}
