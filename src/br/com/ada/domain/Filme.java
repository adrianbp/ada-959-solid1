package br.com.ada.domain;

import java.util.List;

public class Filme extends Produto{


    private String[] diretores;
    private String[] generos;
    private String[] produtores;

    public String[] getDiretores() {
        return diretores;
    }

    public void setDiretores(String[] diretores) {
        this.diretores = diretores;
    }

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    public String[] getProdutores() {
        return produtores;
    }

    public void setProdutores(String[] produtores) {
        this.produtores = produtores;
    }
}
