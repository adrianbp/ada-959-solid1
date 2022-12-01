package br.com.ada.domain;

import br.com.ada.service.ProdutoService;

public abstract class Produto {

    private String nome;
    private int id;
    private Double preco;
    private ProdutoType tipoProduto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
