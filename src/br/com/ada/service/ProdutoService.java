package br.com.ada.service;

import br.com.ada.domain.Produto;
import br.com.ada.domain.ProdutoType;

import java.util.List;

public interface ProdutoService {

    void adicionaProduto(Produto produto);

    List<Produto> getAllProdutos();

    void alteraProduto(Produto produto, Integer id);

    void removeProduto(Produto produto , Integer id);

    List<Produto> getProdutosByCategoria(ProdutoType produtoType);

    List<Produto> getAllProdutosCategoria();



}
