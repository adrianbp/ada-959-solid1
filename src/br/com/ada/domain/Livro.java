package br.com.ada.domain;

import java.util.List;

public class Livro extends Produto{


    private List<String> generos;
    private String escritor;
    private String editora;

    public List<String> getGenero() {
        return generos;
    }

    public void setGenero(List<String> genero) {
        this.generos = genero;
    }


    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
