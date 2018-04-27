package com.example.kaymo.atividadesm1;

/**
 * Created by kaymo on 23/04/2018.
 */

public class Reclamação {

    private String categoria;
    private String descricao;
    private int curtir = 0;
    private int naoCurtir = 0;

    public Reclamação(String categoria, String descricao) {
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setTitulo(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCurtir() { return curtir; }

    public void setCurtir(int curtir) { this.curtir = curtir; }

    public int getNaoCurtir() { return naoCurtir; }

    public void setNaoCurtir(int naoCurtir) { this.naoCurtir = naoCurtir; }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
