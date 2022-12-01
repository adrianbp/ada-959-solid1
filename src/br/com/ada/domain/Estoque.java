package br.com.ada.domain;

import br.com.ada.service.ProdutoService;

import java.util.List;

public class Estoque implements ProdutoService {

    List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void adicionaProduto(Produto produto) {

        produtos.add(produto);
    }

    @Override
    public List<Produto> getAllProdutos() {
        return produtos;
    }

    @Override
    public void alteraProduto(Produto produto, Integer id ) {

    }

    @Override
    public void removeProduto(Produto produto,  Integer id ) {

    }

    @Override
    public List<Produto> getProdutosByCategoria(ProdutoType produtoType) {
        return null;
    }

    @Override
    public List<Produto> getAllProdutosCategoria() {
        return null;
    }
}
