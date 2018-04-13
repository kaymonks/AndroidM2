package com.example.kaymo.exercicio04listas;

import java.util.ArrayList;

/**
 * Created by kaymo on 12/04/2018.
 */

public class Pessoa {

    private String nome;
    private int idade;
    private String rg;
    private String cidade;
    private char sexo;
    static ArrayList<Pessoa> retorno = new ArrayList<>();



    public Pessoa(String nome, int idade, String rg, String cidade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.cidade = cidade;
        this.sexo = sexo;
    }

    public static ArrayList<Pessoa> getLista() {

        return retorno;
    }

    public ArrayList<Pessoa> setlista(Pessoa pessoa) {
        retorno.add(pessoa);
        retorno.add(pessoa);
        retorno.add(pessoa);
        retorno.add(pessoa);
        retorno.add(pessoa);
        retorno.add(pessoa);
        retorno.add(pessoa);
        retorno.add(pessoa);
        //Add a mesma pessoa p/ nao cadastrar varias vezes
        return retorno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRg() {
        return rg;
    }

    public String getCidade() {
        return cidade;
    }

    public char getSexo() {
        return sexo;
    }
}
