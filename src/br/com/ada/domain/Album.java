package br.com.ada.domain;

import java.util.List;

public class Album extends Produto{


    private String[] musicos;
    private String[] bandas;
    private String[] generos;
    private String[] selos;

    public String[] getMusicos() {
        return musicos;
    }

    public void setMusicos(String[] musicos) {
        this.musicos = musicos;
    }

    public String[] getBandas() {
        return bandas;
    }

    public void setBandas(String[] bandas) {
        this.bandas = bandas;
    }

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    public String[] getSelos() {
        return selos;
    }

    public void setSelos(String[] selos) {
        this.selos = selos;
    }
}
