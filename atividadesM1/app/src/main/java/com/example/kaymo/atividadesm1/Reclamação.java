package com.example.kaymo.atividadesm1;

/**
 * Created by kaymo on 23/04/2018.
 */

public class Reclamação {

    private String titulo;
    private String descricao;
    private String data;
    private String resolvido;

    public Reclamação(String titulo, String descricao, String data, String resolvido) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.resolvido = resolvido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String isResolvido() {
        return resolvido;
    }

    public void setResolvido(String resolvido) {
        this.resolvido = resolvido;
    }
}
